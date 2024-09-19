<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>EL과 Scope처리</title>
	</head>
	<body>
		<%
			//스코프 : 데이터가 사라지지 않고 존재할 수 있는 범위
			//스코프의 종류 *X5,000,000
			//1. pageScope : 현재 페이지에서 데이터를 유지,다른 jsp파일에서 사용 불가 /개발자가 만든 페이지
			//2. requestScope : Request에서 데이터를 유지, Request의 대상이된 jsp파일에서만 사용가능 /사용자가 만든 페이지
			//3. sessionScope : 단일 사용자의 모든 페이지에서 데이터를 유지, 다른 사용자는 사용 불가
			//4. applicationScope : app단위의 모든 페이지에 데이터를 유지, 모든 사용자가 동등한 데이터 획득
			
			//데이터에 스코프 범위를 지정하는 방법
			pageContext.setAttribute("nm", "page scope");  //EL로 뽑을 수 있다. 검색(데이터); Context_화면을 그리는 명세정보에 정보를 빼고 더할 수 있다.총괄적인 내용.앱개발에서 많이 쓰게된다.
			request.setAttribute("nm", "request scope");
			session.setAttribute("nm", "session scope");
			application.setAttribute("nm","application scope");
		%>
		<h1>기본형 : ${nm}</h1>
		<h1>\${pageScope.nm} : ${pageScope.nm}</h1>
		<h1>\${requestScope.nm } : ${requestScope.nm }</h1>
		<h1>\${sessionScope.nm } : ${sessionScope.nm }</h1>
		<h1>\${applicationScope.nm } : ${applicationScope.nm} </h1>
	</body>
</html>