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
%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Web Programming</title>
	<link rel="stylesheet" href="./css/subject.css">
	<style>
		.delete-button {
			background-color: red;
		}
		.delete-button:hover {
			cursor: pointer;
		}
		.update-button {
			background-color: royalblue;
		}
		.update-button:hover {
			cursor: pointer;
		}
		#init-box {
			background-color: orange;
		}
		#init-box:hover {
			cursor: pointer;
		}
		#delete-all-button {
			background-color: red;
		}
		#delete-all-button:hover {
			cursor: pointer;
		}
	</style>
</head>
<body>
  <div class="container">
    <h1>Web Programming</h1>
    <p>공부할 주제를 기록해 보세요</p>
    <form id="form1" action="./webprogramming_insert.jsp" method="POST">
      <button id="delete-all-button">전체삭제</button>
      주제
      <input type="text" id="subject" name="subject" autofocus>
      <br>
      <input type="text" id="prior" name="prior">
      우선순위
      <button id="add-button" style="cursor: pointer;">추가</button>
      <!-- return false는 form의 action값으로 이동하지 않게 막기 -->
      <button id="init-box" onclick="return false;">초기화</button>
    </form>
    <hr>  
    <ul id="itemList">
<%
  	//studdy1테이블에서 데이터 가져오기
	Connection conn = DBManager.getDBConnection(); 
	
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
	<span class="li-half">
		<%= rs.getString("study_content") %>, 우선순위: <span><%= rs.getInt("study_prior") %>
	</span>
	<button class="delete-button" data-id="<%= rs.getInt("study_no") %>">삭제</button>
	<button class="update-button" data-id="<%= rs.getInt("study_no") %>">수정</button>
</li>
<%
		}
		
		// DB자원 정리
		DBManager.dbClose(conn, pstmt, rs);
	} catch(SQLException se) {
		se.printStackTrace();
		System.err.println("테이블 조회 에러");
	}
%>
	</ul>
  </div>

  <script>
   	document.addEventListener("DOMContentLoaded", function() {   // 웹 페이지가 로딩되면 실행
	  //const button = document.querySelector("button");  // 버튼 요소 가져오기
	  const button = document.getElementById("add-button");  // 버튼 요소 가져오기
	  button.addEventListener("click", function (event) {  // 버튼을 클릭하면 실행
		 event.preventDefault();  // 기본 동작을 막음
	     newRegister();   // 새로운 주제를 등록하는 함수 호출  
	  });
	  
	  // 입력상자 초기화 버튼 기능
	  const btnInputInit = document.getElementById("init-box");  // 초기화 버튼 요소 가져오기
	  btnInputInit.addEventListener("click", function (event) {  // 버튼을 클릭하면 실행
		  document.getElementById("subject").value = '';
		  document.getElementById("prior").value = '';
      });
	  
	  // 항목을 클릭하면 주제번호 alert창으로 나오게 하기
   	  const itemList = document.querySelector("#itemList");  // 부모 노드 가져오기
  	  itemList.addEventListener("click", (event) => {
  		// 삭제버튼 클릭시 
  	  	if(event.target.classList.contains('delete-button')) {
  	  		if (confirm('정말 삭제하시겠습니까?')) {
  	  			const studyNo = event.target.getAttribute("data-id");
	  	  		//alert(studyNo);
	  	  		
	  	  		// method가 GET방식으로 파라미터 전달
	  	  		location.href = `./webprogramming_delete.jsp?study_no=` + studyNo;
	  	  		//location.href = './webprogramming_delete.jsp?study_no=' + studyNo; + '&key1=value1&key2=value2'; 
	  	  	}
	  	}
  	  	
  		// 수정버튼 클릭시
  		if(event.target.classList.contains('update-button')) {
  			const studyNo = event.target.getAttribute("data-id");
  			// 수정form jsp페이지 이동
  			location.href = `./webprogramming_update_form.jsp?study_no=` + studyNo;
  		}
  		
  		// 주제 클릭 시
        if (event.target.classList.contains('li-half')) {
        	let array1 = event.target.textContent.trim().split(',');
            
        	const subjectInput = document.getElementById("subject");
            subjectInput.value = array1[0];
            
            const priorInput = document.getElementById("prior");
            priorInput.value = array1[1].split(':')[1].replace(' ', '');
        }
  	  });
   	  
  	  // 전체삭제 버튼 클릭시
      const btnDeleteAll = document.getElementById("delete-all-button");
      btnDeleteAll.addEventListener("click", function (event) {
        event.preventDefault();  // 기본 동작을 막음
        //alert('만들어 보세요');
        
        if (confirm('정말 모두 삭제하시겠습니까?')) {
	        const form1 = document.getElementById('form1');
	        form1.action = './webprogramming_delete_all.jsp';
	        form1.submit();
        }
      });
  
	  // 항목을 클릭하면 삭제하기
      /*
      const itemList = document.querySelector("#itemList");  // 부모 노드 가져오기
      itemList.addEventListener("click", (event) => {
        if(event.target.tagName === "LI") {  // 클릭한 요소가 li 요소이면
          if (confirm("삭제하시겠습니까?")) {  // 확인 대화상자 표시
            //event.target.remove();  // 클릭한 요소 삭제
          }
        }
	  });
	  */
	}); 
   
   // 추가 버튼 클릭시 동작
   function newRegister() {
	   // 입력 상자에 텍스트가 있는지 확인
      if (!document.getElementById("subject").value
    		  || !document.getElementById("prior").value) {
    	  alert('공부할 주제 혹은 우선순위를 적어주세요.');
    	  return;
      }
      
      // 우선순위의 내용이 숫자인지 체크
      if (isNaN(document.getElementById("prior").value)) {
    	  alert('우선순위는 숫자로 입력해 주세요.');
    	  document.getElementById("prior").value = '';
    	  
    	  return;
      }
      
      const form1 = document.getElementById('form1');
	  form1.submit();   // form1의 action값으로 input데이터를 이동
  	}
  </script>
</body>
</html>