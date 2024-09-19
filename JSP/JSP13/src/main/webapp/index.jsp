<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>세션 공유처리 실습</title>
	</head>
	<body>
		<form method="post" action="data.jsp">
			좋아하는 계절은?
			<select name="data">
				<option>봄</option>
				<option>여름</option>
				<option>가을</option>
				<option>겨울</option>
			
			</select>
			<input type="submit" value="전송!">
			
		</form>
	</body>
</html>