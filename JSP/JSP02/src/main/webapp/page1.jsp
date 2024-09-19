<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>여기는 1페이지</title>
	</head>
	<body>
		<h1>여기는 1페이지입니다.</h1>
		<!-- 양수, 음수를 여부를 h3규격으로 출력하는 자바코드를 작성하시오 -->
		<%
			int number=-20;
			String str="<h3>";
			if(number>0){
				str+="양";
			}
			else{
				str+="음";
			}
			str+="수입니다.</3>";
			out.print(str);
		
		%>
		<%=str %>
		
		<%
			
			for(int i=1; i<=6; i++){
		%>
				<h<%=i %>>문자의 크기를 확인!!</h<%=i %>>
				
		<%	
			}
		%>
		
		
		<a href="index.jsp">메인페이지로 돌아가기</a> 
		<a href="page2.jsp">2페이지로 이동</a>
	</body>
</html>