<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>스크립트릿 연습</title>
	</head>
	<body>
		<%
			for(int i=0; i<5; i++){ //스크립트릿 안
		%> 
		
				<h1>이 내용을 <%=i%> 반복</h1>  <!-- 스크립트릿 밖에 적은 것이 계속 반복된다. 하나로 연결되었다고 보면 된다. -->
		<%
			} //for문 종료
		%>
	</body>
</html>