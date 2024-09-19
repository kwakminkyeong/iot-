<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>로그인페이지</title>
	</head>
	<body>
		<h1>여기는 로그인 페이지 입니다.</h1>
		<form method="post" action="login.do" name="frm">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userid"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pw"></td>
				</tr>
				<tr>
					<td colspan="3">
						<input type="submit" value="로그인" onclick="return check()">
						<input type="reset" value="취소" >
						<input type="button" value="회원가입" onclick="reg()">
					
					</td>
				</tr>
				
				
			</table>
		
		</form>
		<script>
			function reg(){
				location.href="register.jsp";
			}
			function check(){
				if(document.frm.userid.value.length==0){
					alert("아이디를 입력하셔야 합니다.");
					frm.userid.focus();
					return false;
					
				}
				if(document.frm.pw.value == ""){
					alert("비밀번호를 입력하셔야 합니다.");
					frm.pw.focus();
					return false;
				}
				
				return true;
			}
		</script>
	</body>
</html>