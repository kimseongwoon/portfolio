package ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
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
			
			String sql = """
					SELECT 
						userid, 
						username,
						userpassword,
						userage,
						useremail
					FROM
						users
					WHERE
						-- userid LIKE '%winter%'
						userid = ?
					""";
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter2");
			
			//SQL문 실행 후 ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery(); // SELECT문 실행
			if(rs.next()) { // rs의 0번째 커서에 데이터가 있으면 true
				// DB에서 가져온 데이터를 User 클래스 객체에 저장(클래스 객체는 메모리에 존재)
				User user = new User();
				user.setUserId(rs.getString("userid"));  // 0번째행의 userid컬럼명의 값을 String으로 가져옴
				user.setUserName(rs.getString("username"));  // 0번째행의 username컬럼명의 값을 String으로 가져옴
				user.setUserPassword(rs.getString("userpassword"));  // 0번째행의 userpassword컬럼명의 값을 String으로 가져옴
				user.setUserAge(rs.getInt(4));    // 0번째행의 4번째 순번의 컬럼을 int로 가져옴
				user.setUserEmail(rs.getString(5)); // 0번째행의 5번째 순번의 컬럼을 String로 가져옴				
				System.out.println(user);
				
//				System.out.println("userid: " + rs.getString("userid"));
//				System.out.println("username: " + rs.getString("username"));
//				System.out.println("userpassword: " + rs.getString("userpassword"));
//				System.out.println("userage: " + rs.getInt(4));
//				System.out.println("useremail: " + rs.getString(5));
			
//				rs.getString("userid");  // 0번째행의 userid컬럼명의 값을 String으로 가져옴
//				rs.getString("username");  // 0번째행의 username컬럼명의 값을 String으로 가져옴
//				rs.getString("userpassword");  // 0번째행의 userpassword컬럼명의 값을 String으로 가져옴
//				rs.getInt(4);    // 0번째행의 4번째 순번의 컬럼을 int로 가져옴
//				rs.getString(5); // 0번째행의 5번째 순번의 컬럼을 String로 가져옴
			
				System.out.println();  // 한 줄 띄우기
			} 
//			else {
//				System.out.println("글 작성자 winter 아이디가 존재하지 않음");
//			}
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
