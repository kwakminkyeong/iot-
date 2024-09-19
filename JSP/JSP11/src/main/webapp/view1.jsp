<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>다른페이지 1번</title>
	</head>
	<body>
		<h1>여기는 view1.jsp 파일입니다.</h1>
		<a href="index.jsp">메인으로 가기</a><br>
		<a href="view2.jsp">쿠키값 공유 확인하러 가기</a><br>
		<%
			//쿠키정보를 가져오는 방법, 쿠키는 여러개가 생성되어 있을 수 있으니 배열로 받아온다.
			Cookie[] cks=request.getCookies();
		
			//쿠키가 몇개나 있는지 확인
			int size=cks.length;
			
			//제 각각 다른 무언가를 제공하기 위해 쿠키가 필요하다.
			//치명적인 약점은 보안에 취약하다. 한개의 장비를 여러사람이 쓰게되면 문제가 생긴다.
			//원격지를 돌아다니면서 사용하는 경우
		%>
		<p>쿠키정보</p>
		<p>쿠키배열의 크기 : <%=size %></p>
		
		<%
			for(int i=0; i<cks.length; i++){
		%>
		
			<p>쿠키의 이름확인 : <%=cks[i].getName() %></p>
			<p>쿠키의 내용확인 : <%=cks[i].getValue() %></p>
		<%
			}
		%>
	</body>
</html>