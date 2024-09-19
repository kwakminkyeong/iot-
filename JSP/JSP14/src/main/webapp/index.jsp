<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>메인페이지</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
	<%
		String num=null;
		String name=null;
		String email=null;
		boolean login=false;
		if(session.getAttribute("login")!=null){
			login=(boolean)session.getAttribute("login");
			num=(String)session.getAttribute("num");
			name=(String)session.getAttribute("name");
			email=(String)session.getAttribute("email");
		}
		//out.print("<h1>로그인 정보 :"+login+"</ht>");
	%>
	
		<div id="wrap">
			<h1>테스트 사이트 입니다.</h1>
			<div class="menu">
				<ul>
					<li>메인페이지</li>
					<li>회원목록</li>
					<li>상품목록</li>
					<li>상품입력</li>
				
				</ul>
			
			</div>
			<div id="tab">
			<%
				if(!login){//로그인이 안됐을때
					%>
					<form method="post" action="login.jsp">
						<span>아이디</span><input type="text" name="id"><br>
						<span>비밀번호</span><input type="text" name="pw"><br>
						<input type="submit" value="로그인!">
					</form>
					
					
			<%
				}else{//로그인이 됐을떄
			%>
					<p><%=num %></p>
					<p><%=name %></p>
					<p><%=email %></p>
					<input type="button" value="로그아웃!" onclick="logout()">
					
			<%
				}
			
			%>
				
			
			</div>
			
		
		</div>
		<script>
			function logout(){
				location.href="logout.jsp"; //도메인창의 주소를 바꾼다.
			}
		</script>
		
		
	</body>
</html>