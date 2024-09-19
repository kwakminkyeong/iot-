<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>session 단위 테스트</title>
	</head>
	<body>
		
		
		<h1>session 단위 데이터 확인</h1>
	
		<h1>\${page } : ${page }</h1>
		<h1>\${param.req } : ${param.req }</h1>
		<h1>\${sess } : ${sess }</h1>
		<h1>\${app } : ${app }</h1>
		
		<%
			session.invalidate();
		%>
		<h1>세션정보 만료 후 : ${sess }</h1>
		
		<a href="index.jsp">page단위 scope확인</a><br>
		<a href="request.jsp" >request단위 scope확인</a><br>
		<a href="session.jsp">session단위 scope확인</a><br>
		<a href="application.jsp">application단위 scope확인</a>
	</body>
</html>