<%@ page language="java" contentType="text/html; charset=UTF-8"
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

	// 공부할 주제 번호를 가져옴
	String studyNo = request.getParameter("studyNo");
	int studyNoNum = Integer.parseInt(studyNo);
	
	// form에서 넘긴 데이터 받기
	String content = request.getParameter("subject"); // 주제
	String prior = request.getParameter("prior");     // 우선순위

	// 실제 DB에서 수정하는 코드
	Connection conn = DBManager.getDBConnection();
	
	String sql 
		= "UPDATE study1 SET study_content = ?, study_prior = ? " 
	       + " WHERE study_no = ?";
	int rows = 0;
	boolean isSuccess = false;
	String errMsg = "";
	try {
		// 실제 UPDATE SQL쿼리 실행
		//PreparedStatement 얻기 및 값 지정
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, content);
		pstmt.setInt(2, Integer.parseInt(prior));
		pstmt.setInt(3, studyNoNum);
		
		// SQL문을 진짜 실행
		rows = pstmt.executeUpdate(); // 리턴값은 실제 delete한 행의 개수
		
		// DB자원 정리
		DBManager.dbClose(conn, pstmt, null);
		
		isSuccess = true;
	} catch (Exception e) {
		e.printStackTrace();
		//exit();
		errMsg = e.getMessage();
	}
%>
<%
	if (isSuccess) {
%>
<script>
	alert('수정되었습니다.');
	location.href = './webprogramming.jsp';
</script>
<%
	} else { 
%>
<script>
	alert('수정에 실패하였습니다. 에러 사유: <%= errMsg %>');
	location.href = './webprogramming_update_form.jsp?study_no=' + <%= studyNo %>;
</script>
<%
	}
%>
    