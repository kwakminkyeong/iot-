<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>세션데이터 확인 페이지</title>
	</head>
	<body>
		<h1>세션 데이터를 확인합니다.</h1>
		<h1>현재위치는 view.jsp입니다.</h1>
		<%
		 	String str=(String)session.getAttribute("key");
		
			//세션 생성시간 확인
			long time=session.getCreationTime();
			
			//세션에 최종으로 접근한 시간 금융권에서 화면만 틀어만 놓고 세션쪽의 데이터를 한번도 받아가지 않으면 자동로그아웃되고 최종접속시간을 말한다.
			long last=session.getLastAccessedTime();
			
			//세션이 활동할 수 있는 기간 지정.동기화처리만 끊어주는 것
			session.setMaxInactiveInterval(60*60);
			
			//세션 활동 가능 시간 확인
			int interval=session.getMaxInactiveInterval();
			
			//세션 종료: 로그아웃 기능을 구현할 때 사용한다.1대1 매칭값만 지워준다. 로그아웃버튼에 붙어있다.
			session.invalidate();
		%>
		<h2>세션에 저장된 정보 :<%=str %></h2>
		<h2>세션 생성시간 : <%=time %></h2>
		<h2>세션 최종사용시간 : <%=last %></h2>
		<h2>세션 유지기간(초) : <%=interval %></h2>
	</body>
</html>