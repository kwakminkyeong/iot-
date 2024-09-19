<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>인클루드 연습</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<div id="wrap">
			<jsp:include page="header.jsp"></jsp:include>
			<p>본문은 이곳에 작성합니다</p>
			<h1>여기는 index.jsp입니다.</h1>
			<p>내용을 적어 둡니다</p>
			<p>다른 페이지를 확인하려면 <a href="next.jsp">여기</a>를 클릭!</p>
		
		</div>
	</body>
</html>