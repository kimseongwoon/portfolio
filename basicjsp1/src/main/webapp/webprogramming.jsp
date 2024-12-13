<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%
	//한글 처리
	request.setCharacterEncoding("UTF-8");	
%>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Web Programming</title>
	<link rel="stylesheet" href="./css/subject.css">
</head>
<body>
  <div class="container">
    <h1>Web Programming</h1>
    <p>공부할 주제를 기록해 보세요</p>
    <form id="form1" action="./webprogramming_insert.jsp" method="POST">
     주제
      <input type="text" id="subject" name="subject" autofocus>
      <br>
      <input type="text" id="prior" name="prior">
      우선순위
      <button>추가</button>
    </form>
    <hr>  
    <ul id="itemList"></ul>
<%
  	//studdy1테이블에서 데이터 가져오기
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
		System.out.println("DB 접속 성공");
	} catch(Exception e) {
		e.printStackTrace();
		//exit();		// 에러일 경우에는 무조건 종료
		System.err.println("DB 접속 에러");
	}
	
	String sql = "SELECT study_no, study_content, study_prior, reg_date " 
					+ " FROM study1 ORDER BY study_no DESC";
	
	try {
		//PreparedStatement 얻기 및 값 지정
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		//SQL문 실행 후 ResultSet을 통해 데이터 읽기
		ResultSet rs = pstmt.executeQuery(); // SELECT문 실행
		while(rs.next()) { // rs의 0번째 커서에 데이터가 있으면 true
%>
<li>
	<span><%= rs.getString("study_content") %></span>,
	우선순위: <span><%= rs.getInt("study_prior") %></span>
</li>
<%
		}
		rs.close();
		
		// PreparedStatement 닫기
		pstmt.close();
	} catch(SQLException se) {
		se.printStackTrace();
		System.err.println("테이블 조회 에러");
	}
%>
    </ul>
 </div>
  

 <script>
   document.addEventListener("DOMContentLoaded", function() {   // 웹 페이지가 로딩되면 실행
    const button = document.querySelector("button");  // 버튼 요소 가져오기
    button.addEventListener("click", function (event) {  // 버튼을 클릭하면 실행
      event.preventDefault();  // 기본 동작을 막음
      newRegister();   // 새로운 주제를 등록하는 함수 호출  
    });

     // 항목을 클릭하면 삭제하기
     /*
     const itemList = document.querySelector("#itemList");  // 부모 노드 가져오기
     itemList.addEventListener("click", (event) => {
       if(event.target.tagName === "LI") {  // 클릭한 요소가 li 요소이면
         if (confirm("삭제하시겠습니까?")) {  // 확인 대화상자 표시
           event.target.remove();  // 클릭한 요소 삭제
         }
       }
     });
     */
   }); 
   
   // 추가 버튼 클릭시 동작
   function newRegister() {
     let form1 = document.getElementById('form1');
     form1.submit();   // form1의 action값으로 input데이터를 이동
   }
  </script>
</body>
</html>