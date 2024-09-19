<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>데이터 받는 페이지</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String input=request.getParameter("tx");
			String hidden=request.getParameter("hi");
		%>
		<h1>전송받은 값: <%=input %></h1>
		<h1>히든태그에 있는 값 : <%=hidden %></h1>
	</body>
</html>