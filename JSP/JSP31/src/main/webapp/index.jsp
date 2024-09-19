<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSTL 반복문</title>
	</head>
	<body>
		<%
			String[] season={"봄","여름","가을","겨울"};
			//일반 for문 방식		
			for(int i=0; i<season.length; i++){
				%><h3 style="color:red;"><%=season[i] %></h3><%
			}
			
			//향상된 for문
			for(String str:season){
				%><h3 style="color:blue;"><%=str %></h3><%
			}
			
			pageContext.setAttribute("arr",season);
		%>
		<!-- varStatus : JSTL forEach가 가동하는 동안 var변수의 상태를 저장해둔 객체 -->
		<!-- varStatus.index : 0번부터 length-1번까지 존재하는 배열번호-->
		<!-- varStatus.count : 반복문의 반복 횟수를 알려주는 필드, int를 1부터 시작-->
		<!-- varStatus.first : 최초의 데이터인지를 판별, ,boolean값을 가지고 있음-->
		<!-- varStatus.last : 최후의 데이터인지를 판별, ,boolean값을 가지고 있음-->
		<c:forEach var="str" items="${arr }" varStatus="iter">
			<c:if test="${iter.first }">
				<div style="border:10px solid red;">
			</c:if>
			
			<h3 style="color:red;">${str }:${iter.index}</h3>
			<h3 style="color:blue;">${str }:${iter.count}</h3>
			<h3 style="color:green;">${str }:${iter.first}</h3>
			<h3 style="color:pink;">${str }:${iter.last}</h3>
			
			<c:if test="${iter.last }">
				</div>
			</c:if>
		</c:forEach>
		
		<%
			for(int i=0; i<=10; i+=2){
				out.print("<h2 style='color:red;'>"+i+"</h2>");
				
			}
		
		%>
		<c:forEach var="i" begin="0" end="10" step="2" varStatus="iter">
			<h3 style="color:blue;">${i}:${iter.count }</h3>
		
		</c:forEach>
		
		<%
			String data="봄, 여름, 가을, 겨울? 우기. 건기";
			String iot="iot. 융합, 프로그래밍? 학과";
			pageContext.setAttribute("dt", data);
		%>
		<c:forTokens var="test" items="${dt }" delims=",. ?">
			${test }<br>
		
		</c:forTokens>
	</body>
	
</html>