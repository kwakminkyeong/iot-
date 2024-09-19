<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원가입 페이지</title>
		<style>
			#wrap{
				width:500px;
				padding:50px;
				border: 10px solid lightgray;
				margin:0 auto;
			}
			
			span{
				display:inline-block;
				width:100px;
				height:30px;
				text-align:right;
				line-height:30px;
				
			}
			input{
				width:300px;
				height:20px;
				margin-left: 10px;
				
			}
			input:last-child{
				width:150px;
				height:50px;
				display:block;
				margin: 30px auto;
				font-weight:bold;
			}
			form{
				margin-top:50px;
			}
		</style>
	</head>
	<body>
		<div id="wrap">
			<h3>회원가입</h3><hr>
			<form method="post" action="join.jsp">
				<span>아이디 </span><input type="text" name="id"><br>
				<span>비밀번호 </span><input type="password" name="pw"><br>
				<span>이름 </span><input type="text" name="nm"><br>
				<span>이메일 </span><input type="text" name="em"><br>
				<span>연락처 </span><input type="text" name="ph"><br>
				<span>주소 </span><input type="text" name="ad"><br>
				<input type="submit" value="회원가입!">
			
			</form>
		</div>
	
	</body>
</html>