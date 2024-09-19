<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>데이터 전송 목적지</title>
	</head>
	<body>
		<h1>여기는 dest.jsp입니다.</h1>
		<h1>전송받은 데이터는 다음과 같습니다. </h1>
		<%
		 	//post통신은 request내부에 데이터 형태로 문자를 저장하기때문에 한글이 인식되지 않는다.
		 	//request를 통해 데이터를 전송하는 과정에서 한글이 깨진다면 이 코드를 가장 위에 두세요.
		 	
		 	request.setCharacterEncoding("utf-8");
		 	//
		 	//get으로 전송된 데이터를 받는 작업
		 	String user=request.getParameter("id");
			String pass=request.getParameter("pw");
			String nam=request.getParameter("nm");
			String Phone=request.getParameter("ph");
			String subject=request.getParameter("sub");
			String jsp=request.getParameter("jsp");
			String sql=request.getParameter("sql");
		 	//&
		 	//pw=1234
		 	//&
		 	//nm=testname
		 	//&
		 	//ph=testname
		 	//&
		 	//sub=java
		 	//&
		 	//jsp=jsp
		 	
		 	
		 	
		 	
		%>
		
		<%=user %><br>
		<%=pass %><br>
		<%=nam %><br>
		<%=Phone %><br>
		<%=subject %><br>
		<%=jsp %><br>
		<%=sql %>
	
	</body>
</html>