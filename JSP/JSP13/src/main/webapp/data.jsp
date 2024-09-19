<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>리퀘스트 데이터의 세션 가공</title>
	</head>
	<body>
		<h1>여기는 data.jsp입니다.</h1>
	     
		<%
			request.setCharacterEncoding("utf-8");
			String data=request.getParameter("data");
			session.setAttribute("key", data);
			
			
		%>
	 	<h1>request로 받은 데이터 : <%=data %></h1>
	 	<a href="view.jsp">세션 데이터 확인</a>
	 
	</body>
</html>