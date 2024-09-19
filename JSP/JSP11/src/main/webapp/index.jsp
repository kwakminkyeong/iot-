<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>데이터 공유기법</title>
	</head>
	<body>
		<h1>여기서 쿠키를 굽습니다.</h1>
		<a href="view1.jsp">쿠키내용 확인하러 가기</a><br>
		<a href="view2.jsp">쿠키값 공유 확인</a>
		
		<%
		
		
			//Cookie : 페이지가 종료되더라도 웹브라우저에 남아있는 기록.공용컴퓨터에서 사용하면 안된다.
			//웹브라우저를 종료할지라도 기록이 남아 있어서 재접속 시에도 사용이 가능하다. 보안성이 없다.
			//*X5,000,000 쿠키의 저장위치는 [클라이언트]다.리퀘스트와 리스폰으로 주고 받는다.
			//리퀘스트는 변수에 담아서 전달한다. 변수는 자기가 선언된 중괄호를 벗어나면 사라진다.네이티브어플리케이션 / 서버어플리케이션. GPS클리이언트에서 받아야한다(네이티브). 데이터중요 클라이언트의 환경에 전혀 영향을 받지 않는다(서버어플리케이션) 하이브리드: webapp -->
		
		
			//Cookie("쿠키이름", "저장할 정보");
			Cookie ck=new Cookie("data","cookiedata123456");
			//쿠키의 존재 시간을 지정 : 초단위로 지정
			ck.setMaxAge(60*60);
			//쿠키를 클라이언트로 전송해 주어야 한다.
			response.addCookie(ck);
		
		
		%>
		
		
		
		
		
	</body>
</html>