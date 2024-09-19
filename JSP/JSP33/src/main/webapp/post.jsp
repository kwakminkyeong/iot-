<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>get방식 접근</title>
	</head>
	<body>
		<h1 style="color:red;">post방식으로 호출된 경우 이 페이지가 실행됩니다.</h1>
		<h1>현재 파일은 post.jsp입니다.</h1>
		${requestScope.data }<br>
	</body>
</html>