<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>자바빈의 사용</title>
	</head>
	<body>
		<!-- class 부분에는 객체를 생성할 class명을 적는다. -->
		<!-- id부분은 객체의 이름을 적는다. -->
		<!-- scope부분에는 객체가 유지도리 범위를 적는다. -->
		<!-- jsp:useBean이 실행되면 객체를 생성한것과 같은 효과를 가진다. -->
		<jsp:useBean class="beans.Student" id="s" scope="page"></jsp:useBean>  <!--액션태그라고 한다. 자바빈을 사용할꺼에요.자바가 돌아가는 서버에서만 사용해야한다.객체를 만들어준다.beans.Student s=new beans.Student(); -->  
		 
		<%
			//beans.Student s=new beans.Student();
			s.setName("이영준");
		%>
		<h1><%=s.getName()%></h1>
		<jsp:setProperty name="s" property="age" value="29"></jsp:setProperty> <!--액션태그라고 한다.Property:필드에 들어가는 특정값  name="s":목적지   s.setAge(29); 프레임웍-->
		<%
			s.setAge(29);
		%>
		<h1><jsp:getProperty name="s" property="age"></jsp:getProperty></h1>
		
		<%
			s.getAge();
		%>
		
		<!-- name부분에는 생성된 객체의 이름(id)을 적는다. -->
		<!-- property에는 참조할 필드의 이름을 적는다. -->
		<!-- value에는 매개변수에 들어갈 값을 적는다. -->
		<!-- setProperty는 setField(value)실행시키고 getPropterty는 getField()실행  필드타입을 자동으로 잡는다. 문제가 있다.-->
		
		
		<!-- scope범위(데이터가 유지되는 범위) -->
		<!-- page : 단일 페이지 내에서만 유지 -->
		<!-- request : 1회의 request범위에서 유지 -->
		<!-- session : session이 만료되기 전까지 단일 사용자에게 유지 -->
		<!-- application : 모든 페이지 모든 사용자에게 유지 -->
	</body>
</html>