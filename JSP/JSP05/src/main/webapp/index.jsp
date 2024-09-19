<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>메인페이지</title>
	</head>
	<body>
		<%
			//페이지가 여러개로 제작되어 있는 경우에는
			//한개의 페이지에서 특정 값을 다른 페이지로 이전해야 하는 경우가 있다.
			
			int number=500;
		
		 	//데이터 공유범위 : scope
		 	//PageScope : 한 페이지 내부에서 해당 데이타가 사용가능 -> 다른 페이지에서 공유불가
		 	//RequestScope : 1회의 request에 해당 데이터가 사용가능 그 이후에는 소멸된다.
		 	//SessionScope : 접속한 1명의 사용자가 해당 데이터를 사용가능 -> 다른 모든 페이지가 공유, 다른 사용자와 공유불가 (로그인정보가 들어간다)
		 	//ApplicationScope : 모든 사용자가 모든 페이지에서 공유(광고)
		 	
		 	
		 	
		 	//*X5,000,000
		 	//GET 방식
		 	//도메인 뒤쪽에  ?변수=값 을 통해 데이터를 다른 페이지로 전달하는 방법
		 	//a태그 또는 form태그, 자바스크립트를 이용하여 입력한다.
		%>
		<a href="data.jsp?number=<%=number%>">눌러서 다른 페이지로 이동</a><br> <!-- 도메인을 조작하고 있다. 도메인?변수=값 get방식 -->
		<a href="data.jsp?number=999&name=곰">다른값을 다른 페이지로 이동</a>
		
		<form method="get" action="data.jsp"> <!-- action은 보낼 곳 -->
			<input type="text" name="A" ><br>
			<input type="date" name="E"><br> <!-- 모바일에서 보면 자리가 좁아서 클릭이 잘 안된다 실제로 사용하지 않는다-->
			<input type="range" name="C"><br><!-- 숫자가 명확하지 않다 실제로 사용하지 않는다-->
			<input type="number" name="D"><br><!-- 모바일에서 보면 자리가 좁아서 클릭이 잘 안된다 실제로 사용하지 않는다-->
			<input type="color" name="B"><br><!-- 관리자페이지에 많이 들어간다-->
			<input type="submit" value="전송!">
			
		</form>
	
	</body>
</html>