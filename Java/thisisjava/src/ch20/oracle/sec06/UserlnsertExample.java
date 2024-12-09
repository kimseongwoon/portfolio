package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserlnsertExample {
	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 등록된 드라이버를 실제 Connection 클래스 변수에 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl",
					"test1",
					"1234"
			);
			System.out.println("연결 성공");
			
			// 매개변수화된 SQL문 작성
			String sql = "" 
					+ "INSERT INTO users(userid, username, userpassword, userage, useremail)" 
					+ "VALUES(?, ?, ?, ?, ?)";
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter3");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "12345");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "winter@mycompany.com");
			
			// SQL문을 진짜 실행
			int rows = pstmt.executeUpdate(); // 리턴값은 실제 insert한 행의 개수
			System.out.println("저장된 행 수: " + rows);
			
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
