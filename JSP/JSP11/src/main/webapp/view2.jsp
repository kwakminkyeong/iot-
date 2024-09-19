<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>쿠키값 공유확인 페이지</title>
	</head>
	<body>
		<h1>여기는 view2.jsp입니다. 쿠키값 공유를 확인합니다</h1>
		<a href="index.jsp">메인으로 가기</a><br>
		<a href="view1.jsp">쿠키내용 확인하러 가기</a>
		<%
		
			Cookie[] cookies=request.getCookies();
		
			for(int i=0; i<cookies.length; i++){
				out.print("<p>"+cookies[i].getName()+"</p>");
				out.print("<p>"+cookies[i].getValue()+"</p>");
				
			}
		%>
	</body>
</html>