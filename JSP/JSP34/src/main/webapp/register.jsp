<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원 가입</title>
	</head>
	<body>
		<h1>여기는 회원가입 페이지 입니다.</h1>
		<h4>*는 필수 입력입니다. </h3>
		<form method="post" action="join.do " name="frm">
			<table>
				<tr>
					<td>*이름</td>
					<td><input type="text" name="nm"></td>
				</tr>
				<tr>
					<td>*아이디</td>
					<td>
					<input type="text" name="userid">
					<input type="hidden" name="reid">
					<input type="button" value="중복확인" onclick="idCheck()">
					
					</td>
				</tr>
				<tr>
					<td>*비밀번호</td>
					<td>
						<input type="password" name="pwd">
					</td>
				</tr>
				<tr>
					<td>*비밀번호 확인</td>
					<td>
						<input type="password" name="pwd_check">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>연락처</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td>등급</td>
					<td>
					<input type="radio" name="admin" value="1">관리자<br>
					<input type="radio" name="admin" value="0">일반회원
					</td>
				</tr>	
				<tr>
					<td>입력</td>
					<td>
						<input type="submit" value="회원가입" onclick="return joinCheck()">
						<input type="reset" value="초기화"> <!-- 수정페이지에서 많이 사용된다. -->
					</td>
				</tr>
			</table>
			
		</form>
		<script>
			//아이디 중복체크
			function idCheck(){
				if(document.frm.userid.value==""){
					alert("아이디를 입력해 주세요");
					document.frm.userid.focus();
					return;
				}
				var url="idCheck.do?userid="+document.frm.userid.value;
				var popupX=(window.screen.width/2)-(450/2); //X좌표 구하기. 기본좌표는 좌측상단이다.
				var popupY=(window.screen.height/2)- (200/2);
				window.open(url,"_blank_1", "toolbar=no, menubar=no,resizable=no, width=450, height=200, left=" +popupX+ ", top=" +popupY);
			}
			//회원가입 유효성 검사기능	
			function joinCheck(){
				if(document.frm.nm.value.length==0){ //length : 입력한 글자수
					alert("이름은 필수로 입력하셔야 합니다.");
					document.frm.nm.focus();
					return false;
				
				}
				if(document.frm.nm.value.length<4){
					alert("이름 문자4개이상의 조합이어야합니다.");
					document.frm.nm.focus();
					return false;
				}
				if(document.frm.userid.value.length==0){
					alert("아이디는 필수로 입력하셔야합니다.");
					document.frm.userid.focus();
					return false;
				}
				if(document.frm.userid.value.length<4){
					alert("아이디는 문자4개이상의 조합이어야합니다.");
					document.frm.userid.focus();
					return false;
				}
				if(document.frm.reid.value.length==0){
					alert("아이디 중복확인을 해주셔야 합니다.");
					document.frm.userid.focus();
					return false;
				}
				if(document.frm.pwd.value==""){
					alert("비밀번호는 필수로 입력하셔야 합니다.");
					document.frm.pwd.focus();
					return false;
				}
				if(document.frm.pwd.value!=document.frm.pwd_check.value){
					alert("비밀번호가 일치하지 않습니다.");
					document.frm.pwd.focus();
					return false;
				}
			}//회원가입 유효성 검사기능 종료
		</script>
	</body>
</html>