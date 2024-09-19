<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>자바빈과 JSTL</title>
	</head>
	<body>
		<h1>자바방식</h1>
		<%
			
			beans.Student s1=new beans.Student();
			s1.setName("홍길동");
			s1.setAge("29");
			s1.setAddress("서울시 강북구");
		%>
		<%=s1 %>
		<h1>jsp액션태그 방식</h1>
		<jsp:useBean id="s2" class="beans.Student"></jsp:useBean>
		<jsp:setProperty name="s2" property="name" value="김철수"></jsp:setProperty>
		<jsp:setProperty name="s2" property="age" value="31"></jsp:setProperty>
		<jsp:setProperty name="s2" property="address" value="서울시 중구"></jsp:setProperty>
		<!-- name(객체).set필드명(value) -->
		<%=s2 %>
		
		<h1>JSTL방식</h1>
		<!--EL과 쓰기 편리하다. taglibs불러온다. -->
		<c:set var="s3" value="<%=new beans.Student()%>"></c:set>
		<c:set target="${s3 }" property="name" value="이영준"></c:set>
		<c:set target="${s3 }" property="age" value="19"></c:set>
		<c:set target="${s3 }" property="address" value="서울시 동대문구"></c:set>
		<!-- target(객체).set필드명(value) -->
		${s3 }<br>
		
		<a href="if.jsp">이프문 확인하러 가기</a>
	</body>
</html>