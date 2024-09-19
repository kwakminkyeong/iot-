<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="data.Student" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>넥스트</title>
	</head>
	<body>
		<h1>여기는 next.jsp파일입니다.</h1>
		<%
			request.setCharacterEncoding("utf-8");
			/*String name=request.getParameter("nm");
			String kor=request.getParameter("kr");
			String eng=request.getParameter("en");
			String math=request.getParameter("mt");  객체 데이터에 입력하므로 삭제*/
			
			//객체에 데이터 입력
			Student s=new Student();
			s.name=request.getParameter("nm");
			s.kor=Integer.parseInt(request.getParameter("kr"));
			s.eng=Integer.parseInt(request.getParameter("en"));
			s.math=Integer.parseInt(request.getParameter("mt"));
			
			//세션에 데이터 추가
			//session에 데이터가 저장되는 규격은 Object이므로
			//모든 객체를 저장할 수 있다.
			session.setAttribute("obj", s);
			
			/*session.setAttribute("nm", name);
			session.setAttribute("kr", kor);
			session.setAttribute("en", eng);
			session.setAttribute("mt", math);*/

		%>
		<h2>전송결과</h2>
		<p>이름 : <%=s.name %></p>
		<p>국어 : <%=s.kor %></p>
		<p>영어 : <%=s.eng %></p>
		<p>수학 : <%=s.math %></p>
		<a href="result.jsp" onclick="sub()">최종확인 페이지로 이동</a>
		
		<!-- <form id="data" method="post" action="result/jsp">
			<input type="hidden" name="nm">
			<input type="hidden" name="kr">
			<input type="hidden" name="en">
			<input type="hidden" name="mt">
		</form> -->
		<script>
			var data=document.getElementById("data");
			data.nm.value="<%=s.name%>";
			data.kr.value="<%=s.kor%>";
			data.en.value="<%=s.eng%>";
			data.mt.value="<%=s.math%>";
			console.log(data);
			
			function sub(){
				data.submit();
			}
		</script>
	</body>
</html>