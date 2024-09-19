<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>EL의 계산처리</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String first=request.getParameter("first");
			String second=request.getParameter("second");
			String result=first+second;
		%>
		<h1>더한 값 : ${param.first+param.second }</h1>
		<h1>문자처럼 처리 : ${param.first }${param.second }</h1>
	</body>
</html>