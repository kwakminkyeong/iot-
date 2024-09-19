<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>받아온 데이터 확인</title>
	</head>
	<body>
		<%
			 request.setCharacterEncoding("utf-8");
		
			String b=request.getParameter("btn");
			String s=request.getParameter("sub");
			//동일한 name을 가진 여러 input이 데이터를 보낸 경우, 그중 최초의 하나만 인식된다. 데이터가 배열이 아니라서
			//request.getParameter(String name){return String value;}
			//String c=request.getParameter("cb");
			
			//동일한 name을 가진 여러 input들의 데이터를 배열 형대로 받아올 수 있다.
			String[] c=request.getParameterValues("cb");
		%>
		<h1>버튼으로부터의 데이터 : <%=b %></h1>
		<h1>서밋으로부터의 데이터 : <%=s %></h1>
		<!-- 배열객체를 출력하면 객체의 주소가 보이지 데이터가 보이는게 아니다. -->
		<h1>체크박스로부터의 데이터 : <%=c %></h1>
		
		<%
		if(c!=null){
			
			for(int i=0; i<c.length; i++){
				%>
				<h1>체크박스로부터의 데이터 : <%=c[i] %></h1>
				<%
			}
		}
		%>
	</body>
</html>