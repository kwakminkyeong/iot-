<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>세션 데이터 확인</title>
	</head>
	<body>
	
		<h1>세션데이터를 확인합니다.result.jsp</h1>
		<%
			//서버에서 바로 가져오기 때문에 request나 response로부터 불러오지 않는다.
			//return타입이 Object타입으로 반화되므로 캐스팅을 해 주어야 한다.
			
			//String str=session.getAttribute("msg"); getAttribute()메서드는 Object타입으로 잡힌다.
			
			String str=(String)session.getAttribute("msg");
		
		%>
		<h2><%=str %></h2>
	
	</body>
</html>