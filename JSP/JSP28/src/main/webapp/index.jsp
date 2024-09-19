<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>EL과 JSTL</title>
	</head>
	<body>
		<%
			String var="Java단위"; 							//Scope 지정없는 Java데이터
			pageContext.setAttribute("page","페이지 단위");		//PageScope 지정
			request.setAttribute("request","리퀘스트 단위");	//RequestScope 지정
			session.setAttribute("session","세션단위");		//SessionScope 지정
			application.setAttribute("app", "어플리케이션 단위");	//ApplicationScope 지정
			
		%>
		<h1>EL의 출력</h1>
		\${var } : ${var }<br><!-- 자바의 일반 변수는 scope지정이 되지 않으면 EL로 참조 불가 -->
		\${page } :${page }<br>
		\${request }:${request }<br>
		\${session }:${session }<br>
		\${app }:${app }<br>
		
		<c:set var="page" value="페이지 단위2" scope="page"></c:set>
		<c:set var="request" value="리퀘스트 단위2" scope="request"></c:set>
		<c:set var="session" value="세션 단위2" scope="session"></c:set>
		<c:set var="app" value="어플리케이션 단위2" scope="application"></c:set>
		<h1>JSTL의 출력</h1>
		<c:out value="${page }"></c:out><br>
		<c:out value="${request }"></c:out><br>
		${session }<br>
		${app }<br>
		
	</body>
</html>