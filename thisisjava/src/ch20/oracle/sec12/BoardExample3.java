package ch20.oracle.sec12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch20.oracle.sec09.exam02.Board;

/**
 * 게시판 목록 조회하기 기능 추가 
 */
public class BoardExample3 {
	//Field
	private Scanner scanner = new Scanner(System.in);
	private Connection conn = null;
	
	//Constructor
	public BoardExample3() {
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
			exit();		// 에러일 경우에는 무조건 종료 f
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
		System.out.println("*** create() 메소드 실행됨");
		list();
	}
	
	public void read() {
		System.out.println("*** read() 메소드 실행됨");
		list();
	}
	
	public void clear() {
		System.out.println("*** clear() 메소드 실행됨");
		list();
	}
	
	public void exit() {
		System.exit(0);  // 프로그램 종료
	}
	
	public static void main(String[] args) {
		BoardExample3 boardExample = new BoardExample3();
		boardExample.list();
	}
}
