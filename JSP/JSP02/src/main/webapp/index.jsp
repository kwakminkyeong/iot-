<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>스크립트릿</title>
	</head>
	<body>
		<h1>태그에 입력한 내용입니다.</h1>
		<%
			out.print("<h1>자바로 입력한 내용입니다.</h1>"); //동적웹프로그램 계산도 가능하다
		%>
		<%
			//자바코드는 스크립트릿 기호 내부에 작성해야 한다.
			int a=10;
			int b=20;
			int sum=a+b;  //이 페이지를 벗어나면 사라진다.
		%>
		<h1>변수 a와 b의 합은 <%out.print(sum); %> 입니다.</h1> 
		<h2><%out.print(sum); %>  아래와 같이 축약해서 쓸 수 있다.</h2>
		<h2><%=sum %> ;을 넣으면 out.print(sum;)괄호안에 넣은거나 마찬가지다</h2>
		
		<!-- HTML의 주석은 다음과 같습니다. -->
		<%//일반 자바의 주석도 사용 가능합니다. %>
		<%--스크립트릿 전체를 주석으로 변경합니다. --%>
		
		<a href="page1.jsp">1번 페이지로 이동</a>
		<a href="page2.jsp">2번 페이지로 이동</a>
		<br>
		<%
			for(int i=1; i<3; i++){
				String tag="<a href='page"+i+".jsp'>"+i+"번 페이지로 이동</a>";
				out.print(tag);
			}
		%>
		
	</body>
</html>