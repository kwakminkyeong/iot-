<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>스코프 처리 확인</title>
	</head>
	<body>
		<%
			pageContext.setAttribute("page", "page단위의 데이터"); //톰캣이 만들어준 객체를 사용하고 있다.
			session.setAttribute("sess", "session단위의 데이터");
			application.setAttribute("app", "application단위의 데이터");
		%>
		<h1>\${page } : ${page }</h1>
		<h1>\${req } : ${req }</h1>
		<h1>\${sess } : ${sess }</h1>
		<h1>\${app } : ${app }</h1>
		
		<a href="index.jsp">page단위 scope확인</a><br>
		<a href="#" onclick="sub()">request단위 scope확인</a><br>
		<a href="session.jsp">session단위 scope확인</a><br>
		<a href="application.jsp">application단위 scope확인</a>
		
		<form method="post" action="request.jsp">
			<input type="hidden" name="req" value="request단위의 데이터">
		</form>
		<script>
			let fm=document.getElementsByTagName("form")[0];
			function sub(){
				fm.submit();
			}
			
		</script>
	</body>
</html>