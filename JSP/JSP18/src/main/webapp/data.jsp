<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.net.*" %>    
<div id="data">
	<%
	request.setCharacterEncoding("utf-8");
	
	String name=request.getParameter("nm");
	String edit=request.getParameter("edit");
	String result=URLDecoder.decode(edit, "utf-8");
	%>
	
	<h1><%=name %>님 접속을 환영합니다.</h1>
	<h1><%=result %>님 접속을 환영합니다.</h1>


</div>