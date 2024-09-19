<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>입력 확인 페이지</title>
	</head>
	<body>
		
	
		<%
			request.setCharacterEncoding("utf-8"); //scope page
			
			//beans.Reg r=new beans.Reg();
			
			/*String name=request.getParameter("nm");
			String userId=request.getParameter("userId");
			String pass=request.getParameter("pw");
			String phone=request.getParameter("first")+"-"+
						 request.getParameter("second")+"-"+
						 request.getParameter("third");*/
		%>
		<jsp:useBean class="beans.Reg" id="r"></jsp:useBean>
		<jsp:setProperty name="r" property="*" ></jsp:setProperty>
		
		<h1>전송받은 데이터</h1>
		<p>이름 : <%=r.getName() %></p>
		<p>아이디 : <jsp:getProperty name="r" property="userId"></jsp:getProperty></p>
		<p>비밀번호 : <jsp:getProperty name="r" property="pass"></jsp:getProperty></p>
		<p>전화번호 : <jsp:getProperty name="r" property="phone"></jsp:getProperty></p>
	</body>
</html>