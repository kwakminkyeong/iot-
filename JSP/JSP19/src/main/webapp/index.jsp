<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="test.Sample" %>    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<title>자바클래스의 이용</title>
	</head>
	<body>
		<%
			Sample s=new Sample("이영준",3,3);
		%>
		<h1>이름 : <%=s.name %></h1>
		<h1>나이 : <%=s.age %></h1>
		<h1>주소 : <%=s.address %></h1>
		<%=s.make(3,5) %>
		<%=s.tag %>
	</body>
</html>