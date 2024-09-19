<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>액션 태그를 이용한 request처리</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<div id="wrap">
			<form method="post" action="register.jsp">
				<span>이름</span><input type="text" name="name"><br>
				<span>아이디</span><input type="text" name="userId"><br>
				<span>비밀번호</span><input type="password" name="pass"><br>
				<span>연락처</span><br>
				<input type="text" name="first" class="phone"> -
				<input type="text" name="second" class="phone"> -
				<input type="text" name="third" class="phone"><br>
				<input type="submit" value="입력하기!">
			</form>
		</div>
	</body>
</html>