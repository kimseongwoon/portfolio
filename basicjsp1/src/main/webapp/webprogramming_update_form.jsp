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

	//공부할 주제 번호를 가져옴
	String studyNo = request.getParameter("study_no");
	int studyNoNum = Integer.parseInt(studyNo);
	
	String content = null;		// DB에서 가져온 주제 데이터
	Integer prior = null;       // DB에서 가져온 우선순위 데이터
	
	// DB에서 수정하려는 데이터 행의 모든 정보를 가져오기
	Connection conn = DBManager.getDBConnection();
	
	String sqlSelect 
		= "SELECT study_no, study_content, study_prior, reg_date " 
			+ "FROM study1 "
			+ "WHERE study_no = ? "
	;
	int rows = 0;
	try {
		// SQL쿼리 실행
		//PreparedStatement 얻기 및 값 지정
		PreparedStatement pstmt = conn.prepareStatement(sqlSelect);
		pstmt.setInt(1, studyNoNum);
		
		//SQL문 실행 후 ResultSet을 통해 데이터 읽기
		ResultSet rs = pstmt.executeQuery(); // SELECT문 실행
		if(rs.next()) { // rs의 0번째 커서에 데이터가 있으면 true
			content = rs.getString("study_content");
			prior = rs.getInt("study_prior");
		}
		// DB자원 정리
		DBManager.dbClose(conn, pstmt, null);
	} catch (Exception e) {
		e.printStackTrace();
		//exit();
	}
%>    
<!-- 수정화는 화면 프론트 코드 -->
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Web Programming 수정 페이지</title>
	<link rel="stylesheet" href="./css/subject.css">
	<style>
		#update-button {
			background-color: royalblue;
		}
	</style>
</head>
<body>
  <div class="container">
  	<h1>Web Programming 수정 페이지</h1>
  	<p>공부할 주제를 기록해 보세요</p>
  	<form id="form1" action="./webprogramming_update.jsp" method="POST">
  	  <!-- 주제번호도 넘겨야 되서 hidden으로 처리 -->
  	  <input type="hidden" name="studyNo" value="<%= studyNoNum %>"/> 
      주제
      <input type="text" id="subject" name="subject" autofocus value="<%= content %>">
      <br>
      <input type="text" id="prior" name="prior" value="<%= prior %>">
      우선순위
    </form>
    <!-- return false는 form의 action값으로 이동하지 않게 막기 -->
    <br><br>
    <button id="cancel-button" style="cursor: pointer;" onclick="javascript: location.href='./webprogramming.jsp';">취소</button>
    <button id="update-button" style="cursor: pointer;" onclick="javascript: update();">수정완료</button>
  </div>
  
  <script>
  	function update() {
  		const form1 = document.getElementById('form1');
        form1.submit();   // form1의 action값으로 input데이터를 이동
  	}	
  </script>
</body>
</html>