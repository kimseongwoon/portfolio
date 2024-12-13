<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.company1.DBManager" %>
<%
	//한글 처리
	request.setCharacterEncoding("UTF-8");

	// request라는 변수는 tomcat-servlet에서 요청에 대한 정보를 담아서 사용하는 객체
	// input의 name이 subject의 값을 가져옴
	String subject = request.getParameter("subject");
	System.out.println("subject: " + subject);	
	
	String prior = request.getParameter("prior");
	Integer priorNum = Integer.parseInt(prior);
	System.out.println("priorNum: " + priorNum);
	
	// java로 sql실행하여 데이터 삽입하기
	Connection conn =  DBManager.getDBConnection();
	
	String sql = "INSERT INTO study1(study_no,study_content,study_prior) " 
			+ " VALUES (seq_study_no.NEXTVAL, ?, ?)";
		
	int rows = 0;
	try {
		PreparedStatement pstmt 
		= conn.prepareStatement(sql, new String[] {"study_no"});
		pstmt.setString(1, subject);
		pstmt.setInt(2, priorNum);
		
		// SQL문을 진짜 실행
		rows = pstmt.executeUpdate(); // 리턴값은 실제 insert한 행의 개수
		
		// DB자원 정리
		DBManager.dbClose(conn, pstmt, null);
	} catch (Exception e) {
		e.printStackTrace();
		//exit();
	}
%>
<%= rows %>행이 저장되었습니다.
<script>
	location.href = './webprogramming.jsp';
</script>