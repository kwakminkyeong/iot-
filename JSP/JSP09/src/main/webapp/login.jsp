<%@ page language="java" contentType="text/html; charset=utf-8" 
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>로그인 결과화면</title>
		
		
	</head>
	<body>
	<%
		request.setCharacterEncoding("utf-8");
	
		//간이 로그인을 위한 관리자 아이디
		String user="admin";
		String pw="1234";
		
	 	String id=request.getParameter("id");
	 	String pass=request.getParameter("pass");
	 	System.out.println("아이디 : "+id);
	 	System.out.println("비밀번호 :"+pass); //자바의 코솔은 서버에 프린트되어 사용자는 볼 수 없다.
	 	
	 	//String 데이터는 ==로 비교하지 않는다!
	 	//주소가 아닌 값을 기준으로 비교하는 String.equalse(String)메서드를 이용해서 비교한다.
	 	if(user.equals(id) && pw.equals(pass)){
	 		session.setAttribute("login","로그인성공!"); //페이지가 모두 공유하는 별도 저장공간에 데이터 저장.데이터가 object타입
 			response.sendRedirect("main.jsp");
 			
	 	}else{
 	%>	
	 		<h1>로그인 실패!</h1>
	 		<a href='index.jsp'>로그인 페이지로 돌아가기</a>
 	<%	
	 	}
	 	
	 %>
	 <script>
	 	console.log("입력아이디 : "+"<%=id%>");
	 </script>
	</body>
</html>