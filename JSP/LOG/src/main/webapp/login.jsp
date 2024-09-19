<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원가입정보</title>
		
	</head>
	<body>
	<%
		String id=request.getParameter("id");
		String ph=request.getParameter("ph");
		String pw=request.getParameter("pw");
		String pw2=request.getParameter("pw2");
		String name=request.getParameter("nm");
		String email=request.getParameter("em");
		String birth=request.getParameter("bth");
		String[] gender=request.getParameterValues("gen");
		String address=request.getParameter("ad");
		
		
	
	%>
		<h1>아이디 : <%=id %></h1>
		<h1>핸드폰번호 : <%=ph %></h1>
		<h1>비밀번호 : <%=pw %></h1>
		<h1>비밀번호 확인 : <%=pw2 %></h1>
		<h1>이름 : <%=name %></h1>
		<h1>이메일 : <%=email %></h1>
		<h1>생년월일 : <%=birth %></h1>
		<h1>성별 : <%=gender %></h1>
		<h1>성별 : <%=address %></h1>
	
	
	<%
		if(gender!=null){
			for(int i=0; i<gender.length; i++){
	 %>
			<h1>	<%= gender[i]%></h1>
	<%
			}
		}
	%>
	
	</body>
</html>