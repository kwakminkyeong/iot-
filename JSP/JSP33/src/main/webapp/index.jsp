<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>서블릿 이용</title>
	</head>
	<body>
		<a href="AAA">GET방식으로 서블릿 호출</a> <!-- 데이터를 지우는 방식에 많이 쓰임. 자바에서 a태그는 도메인에 적어주는 역할을 한다.@에노테이션 -->
		<form method="post" action="AAA">
			<input type="submit" value="post방식으로 서블릿 호출">
		</form>
	</body>
</html>