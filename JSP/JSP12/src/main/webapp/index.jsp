<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//session : 서버 내부에 마련된 데이터를 저장할 수 있는 공간
			//세션을 이용하면 모든 페이지에서 데이터를 공유할 수 있다.
			//세션은 사용자마다 개별적으로 제작되어 사용자간의 데이터공유를 차단하는 효과가 있다.
			//세션에 저장된 데이터는 접속이 종료되어도 일정기간 보관되어 다양한 용도로 사용 가능하다.
			//*X5,000,000 session데이터는 [서버]에 저장된다. 리퀘스트,리스폰과는 관계가 없다.
			//세션은 [데이터타입에 상관없이] 데이터를 저장해 둘 수 있다. 세션은 기본적으로 지울 수 없게 만들어진다.
			//tomcat이 켜지면 자동으로 만들어진다.
			
			String str="session123456";
			session.setAttribute("msg", str);
		%>
		<h1>여기서 세션을 생성했습니다.index.jsp</h1>
		<a href="result.jsp">세션정보 확인하러가기</a>
	</body>
</html>