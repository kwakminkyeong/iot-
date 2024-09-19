<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>EL을 이용한 리퀘스트 처리</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String user=request.getParameter("user");
		%>
		<h1>전체 내용 : ${param }</h1>
		<h1>입력한 아이디 : ${param.user }</h1>
		<h1>입력한 비밀번호 : ${param["pw"] }</h1>
		
		
		<%--
			String[] arr=request.getParameterValues("season");
			for(int i=0; i<arr.length; i++){
				out.print("<h1>"+arr[i]+"</h1>");
			}
		--%>
				
		<h1>선택한 계절 : ${paramValues.season[1] }</h1>
		<h2>기존방식 : <%=request.getParameter("user")=="admin" %> </h2>
		<h2>El방식 : ${param.user=="admin" }</h2>
	
	</body>
</html>