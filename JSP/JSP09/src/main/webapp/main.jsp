<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>메인페이지 입니다.</title>
	</head>
	<body>
	<%
		//session.getAttribute(String) return Object의 형태를 띄고 있으므로
		//리턴된 데이터는 Object타입 변수에 담거나 캐스팅해서 사용하여야 한다.
		
		String ok=(String)session.getAttribute("login"); //강제 형변환  object=session.getAttribute("login")
	
	%>
	 	<h1>여기는 메인페이지 입니다.</h1>
	 	<h1>결과 : <%=ok %></h1>
	</body>
</html>