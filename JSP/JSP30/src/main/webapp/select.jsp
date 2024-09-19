<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>선택색상구현</title>
	</head>
	<body>
		<p>일반 자바 방식</p>
		<%
			request.setCharacterEncoding("utf-8");
		
			String color=request.getParameter("color");
			int num=Integer.parseInt(color);
			
			
			if(num==1){
				//out.print("<p style='color:red;'>빨강선택</p>");
		%>
				<p style='color:red;'>빨강</p>

		<%
			}else if(num==2){
		%>		
				<p style='color:orange;'>주황</p>
		<%		
			}else if(num==3){
		%>		
				<p style='color:yellow;'>노랑</p>
		<%		
			}else if(num==4){
		%>		
				<p style='color:green;'>초록</p>
		<%		
			}else if(num==5){
		%>		
				<p style='color:blue;'>파랑</p>
		<%		
			}else if(num==6){
		%>		
				<p style='color:navy;'>남색</p>
		<%		
			}else if(num==7){
		%>		
				<p style='color:purple;' >보라</p>
		<%		
			}
		
		%>
		
		
		<p>JSTL 방식</p>
		<%--<c:if test="${param.color==1 }">
			<p style='color:red;'>빨강선택</p>
		</c:if>   --%>
		
		<c:choose> <%--여러개의 if문을 사용할때 --%>
			<c:when test="${param.color==1 }">
				<p style='color:red;'>빨강</p>
			</c:when>  <%--언제 실행해 --%>
			<c:when test="${param.color==2 }">
				<p style='color:orange;'>주황</p>
			</c:when>
			<c:otherwise>
				<p style='color:gray;'>그런색 없어!</p>
			</c:otherwise>
		</c:choose>
	</body>
</html>