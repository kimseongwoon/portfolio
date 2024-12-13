<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.company1.DBManager" %>
<%
	//�ѱ� ó��
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
	</style>
</head>
<body>
  <div class="container">
    <h1>Web Programming</h1>
    <p>������ ������ ����� ������</p>
    <form id="form1" action="./webprogramming_insert.jsp" method="POST">
     ����
      <input type="text" id="subject" name="subject" autofocus>
      <br>
      <input type="text" id="prior" name="prior">
      �켱����
      <button>�߰�</button>
    </form>
    <hr>  
    <ul id="itemList"></ul>
<%
  	//studdy1���̺��� ������ ��������
	Connection conn = DBManager.getDBConnection(); 
	
	String sql = "SELECT study_no, study_content, study_prior, reg_date " 
					+ " FROM study1 ORDER BY study_no DESC";
	
	try {
		//PreparedStatement ��� �� �� ����
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		//SQL�� ���� �� ResultSet�� ���� ������ �б�
		ResultSet rs = pstmt.executeQuery(); // SELECT�� ����
		while(rs.next()) { // rs�� 0��° Ŀ���� �����Ͱ� ������ true
%>
<li>
	<span><%= rs.getString("study_content") %></span>,
	�켱����: <span><%= rs.getInt("study_prior") %></span>
	<button class="delete-button" data-id="<%= rs.getInt("study_no") %>">����</button>
	<button class="update-button" data-id="<%= rs.getInt("study_no") %>">����</button>
</li>
<%
		}
		
		// DB�ڿ� ����
		DBManager.dbClose(conn, pstmt, rs);
	} catch(SQLException se) {
		se.printStackTrace();
		System.err.println("���̺� ��ȸ ����");
	}
%>
	</ul>
  </div>

  <script>
   	document.addEventListener("DOMContentLoaded", function() {   // �� �������� �ε��Ǹ� ����
	  const button = document.querySelector("button");  // ��ư ��� ��������
	  button.addEventListener("click", function (event) {  // ��ư�� Ŭ���ϸ� ����
		 event.preventDefault();  // �⺻ ������ ����
	     newRegister();   // ���ο� ������ ����ϴ� �Լ� ȣ��  
	  });
	  
	  // �׸��� Ŭ���ϸ� ������ȣ alertâ���� ������ �ϱ�
   	  const itemList = document.querySelector("#itemList");  // �θ� ��� ��������
  	  itemList.addEventListener("click", (event) => {
  		// ������ư Ŭ���� 
  	  	if(event.target.classList.contains('delete-button')) {
  	  		if (confirm('���� �����Ͻðڽ��ϱ�?')) {
  	  			const studyNo = event.target.getAttribute("data-id");
	  	  		//alert(studyNo);
	  	  		
	  	  		// method�� GET������� �Ķ���� ����
	  	  		location.href = `./webprogramming_delete.jsp?study_no=` + studyNo;
	  	  		//location.href = './webprogramming_delete.jsp?study_no=' + studyNo; + '&key1=value1&key2=value2'; 
	  	  	}
	  	}
  	  	// ������ư Ŭ����
  		if(event.target.classList.contains('update-button')) {
  			alert('������');
  		}
  	  }); 
	  // �׸��� Ŭ���ϸ� �����ϱ�
      /*
      const itemList = document.querySelector("#itemList");  // �θ� ��� ��������
      itemList.addEventListener("click", (event) => {
        if(event.target.tagName === "LI") {  // Ŭ���� ��Ұ� li ����̸�
          if (confirm("�����Ͻðڽ��ϱ�?")) {  // Ȯ�� ��ȭ���� ǥ��
            //event.target.remove();  // Ŭ���� ��� ����
          }
        }
	  });
	  */
	}); 
   
   // �߰� ��ư Ŭ���� ����
   function newRegister() {
     let form1 = document.getElementById('form1');
     form1.submit();   // form1�� action������ input�����͸� �̵�
   }
  </script>
</body>
</html>