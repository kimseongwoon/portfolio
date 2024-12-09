package ch20.oracle.sec12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch20.oracle.sec09.exam02.Board;

/**
 * 7. 게시물 상세글 삭제 기능
 */
public class BoardExample7 {
	//Field
	private Scanner scanner = new Scanner(System.in);
	private Connection conn = null;
	
	//Constructor
	public BoardExample7() {
		try {
			// JDBC 드라이버 등록
		Class.forName("oracle.jdbc.OracleDriver");
		// 등록된 드라이버를 실제 Connection 클래스 변수에 연결
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/orcl",
				"test1",
				"1234"
		);
	} catch(Exception e) {
		e.printStackTrace();
		exit();		// 에러일 경우에는 무조건 종료
		}
	}
	
	//Method		
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------------------------");
		
		// boards 테이블에서 게시물 정보를 가져와서 출력하기
		try {
			String sql = """
					SELECT 
						bno,
						btitle,
						bwriter,
						bdate
					FROM
						boards
					ORDER BY bno DESC
					""";
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//SQL문 실행 후 ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery(); // SELECT문 실행
			while(rs.next()) { // rs의 0번째 커서에 데이터가 있으면 true
				//데이터 행을 읽고 Board 객체 생성
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s \n", 
						board.getBno(), 
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			
			// PreparedStatement 닫기
			pstmt.close();
		} catch(SQLException se) {
			se.printStackTrace();
			System.err.println("DriverManager.getConnection에서 에러 발생");
		}
		
		mainMenu();  // 함수 호출
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		String menuNo = scanner.nextLine();
		System.out.println();
		
		switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> exit();
		}
	}
	
	public void create() {
		Board board = new Board();
		
		// 게시물 생성하는 코드
		System.out.println("[새 게시물 입력]");
		// 게시물 데이터 입력받기Lll
		System.out.print("제목: "); 	
		String boardTitle = scanner.nextLine();
		System.out.print("내용: "); 	
		String boardContent = scanner.nextLine();
		System.out.print("작성자: "); 	
		String boardWriter = scanner.nextLine();
		
		//보조 메뉴 출력
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = scanner.nextLine();
		
		// 위에서 입력받은 게시물 데이터를 DB에 저장하는 코드
		if (menuNo.equals("1")) {
			String sql = "" 
					+ "INSERT INTO boards(bno, btitle, bcontent, bwriter, bdate)" 
					+ "VALUES(SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
			try {
				PreparedStatement pstmt 
					= conn.prepareStatement(sql, new String[] {"bno"});
				pstmt.setString(1, boardTitle);
				pstmt.setString(2, boardContent);
				pstmt.setString(3, boardWriter);
				
				// SQL문을 진짜 실행
				int rows = pstmt.executeUpdate(); // 리턴값은 실제 insert한 행의 개수
				System.out.println("저장된 행 수: " + rows);
				
				// PreparedStatement 닫기
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		// 게시물 생성 뒤에 생성한 게시물을 확인하기 위해 다시 list()함수 호츨
			list();
	}
	
	public void read() {
		// 입력 받기
		System.out.println("[게시물 읽기]");
		System.out.print("bno: ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		try {
			String sql = """
					SELECT 
						bno,
						btitle,
						bcontent,
						bwriter,
						bdate
					FROM
						boards
					WHERE
						bno = ?
					""";
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			//SQL문 실행 후 ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery(); // SELECT문 실행
			if(rs.next()) { // rs의 0번째 커서에 데이터가 있으면 true
				//데이터 행을 읽고 Board 객체 생성
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
		
				//콘솔에 출력
				System.out.println("###############");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				//보조 메뉴 출력
				System.out.println("---------------");
				System.out.println("보조 메뉴: 1. Update | 2. Delete | 3. List");
				System.out.print("메뉴 선택: ");
				String menuNo = scanner.nextLine();
				System.out.println(); // 한 줄 띄우기
				
				if(menuNo.equals("1")) { // Update
					update(board);    // 실제 게시물 수정하기
				} else if(menuNo.equals("2")) { // Delete
					delete(board);    // 실제 게시물 삭제하기
				}
			}
			rs.close();
			
			// PreparedStatement 닫기
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
			
			list();
		}
		
		// 게시물 수정하는 코드
		public void update(Board board) {
			// 게시물 수정하기 위해 데이터 입력받기
			System.out.println("[수정 내용 입력]");
			System.out.print("제목: "); 	
			board.setBtitle(scanner.nextLine());
			System.out.print("내용: "); 	
			board.setBcontent(scanner.nextLine());
			System.out.print("작성자: "); 	
			board.setBwriter(scanner.nextLine());
			
			//보조 메뉴 출력
			System.out.println("---------------");
			System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
			System.out.print("메뉴 선택: ");
			String menuNo = scanner.nextLine();
			System.out.println(); // 한 줄 띄우기
			if(menuNo.equals("1")) {
				try {
					// boards테이블에서 게시물 정보 수정
					String sql = """
							UPDATE 
							  boards 
							SET 
							  btitle = ?,
							  bcontent = ?,
							  bwriter = ?
							WHERE
							  bno = ? 
							""";
					//PreparedStatement 얻기 및 값 지정
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, board.getBtitle());
					pstmt.setString(2, board.getBcontent());
					pstmt.setString(3, board.getBwriter());
					pstmt.setInt(4, board.getBno());  //boards 테이블에 있는 게시물 번호(bno) 지정
					
					// SQL문을 진짜 실행
					pstmt.executeUpdate(); // 리턴값은 실제 insert한 행의 개수
					System.out.println(board.getBno() + "번이 수정되었습니다.");
					
					// PreparedStatement 닫기
					pstmt.close();
				} catch(Exception e) {
					e.printStackTrace();
					exit();
				} 
			}
			
			//list();
		}
		
		// board 상세글 삭제
		public void delete(Board board) {
			try {
				String sql = """
					DELETE FROM boards WHERE bno = ?
					""";
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			
			// SQL문을 진짜 실행
			int rows = pstmt.executeUpdate(); // 리턴값은 실제 delete한 행의 개수
			System.out.println(board.getBno() + "번이 삭제되었습니다");
		
			// PreparedStatement 닫기
					pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void clear() {
		System.out.println("*** clear() 메소드 실행됨");
		list();
	}
	
	public void exit() {
		System.exit(0);  // 프로그램 종료
	}
	
	public static void main(String[] args) {
		BoardExample7 boardExample = new BoardExample7();
		boardExample.list();
	}                                           

}
