<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>데이터를 전송받는 페이지</title>
	</head>
	<body>
		
		
		<h1>여기서 데이터 받을 꺼에요</h1>
		
		
		
		<%
			//http://localhost:8080/JSP05/data.jsp?number=200 이게 request임
			
			//http://localhost:8080/JSP05/data.jsp
			//?
			//A=%EC%B2%AB%EB%B2%88%EC%A7%B8%EA%B0%92=>첫번째값
			//&
			//B=%EB%91%90%EB%B2%88%EC%A7%B8%EA%B0%92=>두번째값
			
			String data=request.getParameter("A");
			String data2=request.getParameter("B");
			String data3=request.getParameter("D");
			Integer num=Integer.parseInt(data3);
			
		%>
		
		<%=data%>
		<%=data2 %>
		<%=num%>
		
		
		<h1 style=" background-color:<%=data2%>; font-size:<%=num%>;"><%=data %></h1>
		
	</body>
</html>



<!-- String data=request.getParameter(변수);
	Parameter를 여러개를 같이 사용하는 경우 연산자 &를 붙여서 같이 보낸다.
	로그인처리가 이 페이지에서 이루어진다.
	검색엔진
	회원가입
	게시판 글쓰기
	input type 
	이용범위를 잘 생각해 본다
	



 -->