<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>이프문</title>
	</head>
	<body>
		<%
			if(true){
				out.print("<h1 style='color:red;'> 빨강</h1> <hr>");
				
			}
		
			String tag="";
			if(true){
				tag="<h1 style='color:red;'> 빨강</h1>";
			}
		%>
		<%=tag %>
		
		<hr>
		
		<%
			if(true){
			//여기는 주석이 안나온다
		%>
			<h1 style="color:red;"> 빨강</h1>
		<%
			}
		%>
		
		<hr>
		
		<!--EL과 쓰기 편리하다. taglibs불러온다. -->
		<!-- 주석을 달아봅니다. 여기에서는 태그형태로 주석이 노출된다.  -->
		<c:if test="true">
			<!-- test뒤에는 조건이 나와요 -->
			<h1 style="color:red;"> 빨강</h1>
		</c:if>
		
	</body>
</html>