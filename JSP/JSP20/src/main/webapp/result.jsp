<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="data.Student" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>최종확인 페이지</title>
	</head>
	<body>
		<h1>여기는 result.jsp파일입니다.</h1>
		<%
			request.setCharacterEncoding("utf-8");
			/*String name=request.getParameter("nm");
			String kor=request.getParameter("kr");
			String eng=request.getParameter("en");
			String math=request.getParameter("mt");*/
			
			Student stu=(Student)session.getAttribute("obj");
			
			/*session.setAttribute("nm", name);
			session.setAttribute("kr", kor);
			session.setAttribute("en", eng);
			session.setAttribute("mt", math);*/
			
			//int sum=stu.kor+stu.eng+stu.math; data.jsp에 메서드를 만들었기 때문에 필요헝ㅄ어진다.


		%>
		<h2>전송결과</h2>
		<p>이름 : <%=stu.name %></p>
		<p>국어 : <%=stu.kor %></p>
		<p>영어 : <%=stu.eng %></p>
		<p>수학 : <%=stu.math %></p>
		<p>총점 : <%=stu.sum() %></p>
		<p>평균 : <%=stu.avr() %></p>
		<p>객체 : <%=stu %></p>
	</body>
</html>