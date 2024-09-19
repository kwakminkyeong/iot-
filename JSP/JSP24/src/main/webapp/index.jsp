<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>EL의 리퀘스트 처리</title>
	</head>
	<body>
		<div id="wrap">
			<form method="post" action="test.jsp">
				아이디 : <input type="text" name="user"><br>
				비밀번호 : <input type="password" name="pw"><br>
				<hr>
				좋아하는 계절<br>
				<input type="checkbox" name="season" value="spring">봄
				<input type="checkbox" name="season" value="summer">여름
				<input type="checkbox" name="season" value="fall">가을
				<input type="checkbox" name="season" value="winter">겨울<br>
				<input type="submit" value="제출">
			
			</form>
			<hr>
			<form method="post" action="add.jsp">
				<input type="text" name="first">+<input type="text" name="second"><br>
				<input type="submit" value="더하기!">
			
			</form>
		</div>
	</body>
</html>