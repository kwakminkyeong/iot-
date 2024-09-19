<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${empty loginUser }">
	<jsp:forward page="login.do"></jsp:forward>
</c:if>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>메인 페이지</title>
	</head>
	<body>
		<h1>안녕하세요 ${loginUser.name }님, ${loginUser.userid }</h1>
		<a href="#">로그아웃</a><br>
		<a href="#">회원정보 수정</a>
	</body>
</html>