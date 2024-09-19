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
		String ph2=request.getParameter("ph2");
		String where=request.getParameter("where");
		String age=request.getParameter("age");
		String[] g=request.getParameterValues("gender");
		
		
	
	%>
		<h1>아이디 : <%=id %></h1>
		<h1>핸드폰번호 : <%=ph %></h1>
		<h1>비밀번호 : <%=pw %></h1>
		<h1>비밀번호 확인 : <%=pw2 %></h1>
		<h1>핸드폰 인증 : <%=ph2 %></h1>
		<h1>지역 및 재적교회명 : <%=where %></h1>
		<h1>나이대 : <%=age %></h1>
	
	
	<%
		if(g!=null){
			for(int i=0; i<g.length; i++){
	 %>
			<h1>	<%= g[i]%></h1>
	<%
			}
		}
	%>
	
	</body>
</html>