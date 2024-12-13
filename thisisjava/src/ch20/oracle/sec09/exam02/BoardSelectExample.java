package ch20.oracle.sec09.exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ch20.oracle.sec09.exam01.User;

public class BoardSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 등록된 드라이버를 실제 Connection 클래스 변수에 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl",
					"test3",
					"1234"
			);
			System.out.println("연결 성공");
			
			String sql = """
					SELECT 
						bno,
						btitle,
						bcontent,
						bwriter,
						bdate,
						bfilename,
						bfiledata
					FROM
						boards
					WHERE
						bwriter = ?
					""";
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			//SQL문 실행 후 ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery(); // SELECT문 실행
			while(rs.next()) { // rs의 0번째 커서에 데이터가 있으면 true
				//데이터 행을 읽고 Board 객체 생성
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				//콘솔에 출력
				System.out.println(board);
			}
			rs.close();
			
			// PreparedStatement 닫기
			pstmt.close();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			System.err.println("Class.forName에서 에러 발생");
		} catch(SQLException se) {
			se.printStackTrace();
			System.err.println("DriverManager.getConnection에서 에러 발생");
		} finally {
			try {
				if (conn != null) {
					// DB연결 끊기
					conn.close();
				}
				System.out.println("연결 끊기");
			} catch(SQLException se) {
				se.printStackTrace();
				System.err.println("conn.close에서 에러 발생");
			}
		}
	}
}
