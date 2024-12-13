<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.company1.DBManager" %>
<%
	// 한글 처리
	request.setCharacterEncoding("UTF-8");

	//공부할 주제 번호를 가져옴
	String studyNo = request.getParameter("study_no");
	int studyNoNum = Integer.parseInt(studyNo);
	
	//String keyValue1 = request.getParameter("key1");
	//String keyValue2 = request.getParameter("key2");

	// 실제 DB에서 삭제하는 코드
	Connection conn = DBManager.getDBConnection();
	
	String sql = "DELETE FROM study1 WHERE study_no = ?";
	int rows = 0;
	try {
		// 실제 DELETE SQL쿼리 실행
		//PreparedStatement 얻기 및 값 지정
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, studyNoNum);
		
		// SQL문을 진짜 실행
		rows = pstmt.executeUpdate(); // 리턴값은 실제 delete한 행의 개수
		
		// DB자원 정리
		DBManager.dbClose(conn, pstmt, null);
	} catch (Exception e) {
		e.printStackTrace();
		//exit();
	}
%>
<%= studyNo %>번호가 삭제되었습니다.
<script>
	location.href = './webprogramming.jsp';
</script>