<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>다른 인풋의 전송처리</title>
	</head>
	<body>
	<!-- type=button 으로는 데이터를 전송할 수 없다. -->
	<!-- type=submit 으로도 데이터를 전송할 수 있다. -->
		<div id="wrap">
			<form method="get" action="data.jsp">
				<input type="button" value="버튼입니다." name="btn"><br> 
				<input type="checkbox" value="체크박스1" name="cb">
				<input type="checkbox" value="체크박스2" name="cb">
				<input type="checkbox" value="체크박스3" name="cb">
				<input type="checkbox" value="체크박스4" name="cb"><br>
				<input type="submit" value="전송입니다." name="sub">
			</form>
		
		
		</div>
	</body>
</html>