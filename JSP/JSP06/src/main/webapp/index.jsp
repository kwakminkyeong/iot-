<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원가입</title>
		<style>
			*{
				font-weight:bold;
				color:#222222;
			}
			#wrap{
				width:300px;
				border:2px solid gray;
				margin:0 auto;
				padding:30px;
			}
			input[name="id"]{
				width:210px;
				margin-left:48px;
				margin-top: 15px;
			}
			input[name="pw"]{
				width:210px;
				margin-top: 15px;
			}
			input[name="nm"]{
				width:210px;
				margin-left:32px;
				margin-top: 15px;
			}
			input[name="ph"]{
				width:210px;
				margin-left:16px;
				margin-top: 15px;
				
			}
			
			input[type="submit"]{
				width:100px;
				height:40px;
				display:block;
				margin: 0 auto;
				margin-top: 30px;
				border:1px solid gray;
				border-radius:8px;
				background-color:#EBF6FF;
			}
			
			fieldset{
				margin-top:20px;
				border-radius:8px;
			}
		
		</style>
	</head>
	<body>
		<!-- form태그는 submit일 눌렸을 때 내부의 input을 전송한다. -->
		<!-- 전송 목적지는 action위치이며 방식은 method를 따른다. -->
		<!-- 전송 데이터는 name=value의 형태로 가공되어 request를 통해 전송된다. -->
		
		<!-- *X5,000,000 -->
		<!-- get방식은 도메인 뒤로 데이터가 그대로 노출되는 방식 -->
			<!-- 개발자가 데이터의 전송여부를 파악하기 쉽고 개발편의가 대단히 높음 -->
			<!-- 보낼 수 있는 데이터의 길이가 짧고, 문자로 표현하기 어려운 데이터는 전송할 수 없다. -->
		<!-- post방식은 보이지 않는 공간에 데이터를 담아서 전송하는 방식 -->
			<!-- 개발자는 데이터를 별도로 확인하기 전까지 전송여부를 파악할 수 없다. -->
			<!-- 데이터보안이 가능하고 객체를 전달할 수 있다는 장점을 가진다. -->	
			<!-- 한글이 깨지는 단점이 있다. 이유는 초기request에 utf-8을 주지 않았다 -->
		<div id="wrap">
			<form method="post" action="dest.jsp">
				<h1>회원가입</h1>
				<hr>
				ID : <input type="text" placeholder="아이디를 입력해 주세요" name="id"> <br>
				비밀번호 : <input type="password" placeholder="비밀번호를 입력해 주세요" name="pw"><br>
				이름 : <input type="text" placeholder="이름을 입력해 주세요" name="nm"><br>
				연락처 : <input type="text" placeholder="- 빼고 입력해주세요" name="ph"><br>
				<fieldset>
					<legend>관심분야</legend>
					JAVA<input type="radio" value="java"  name="sub">
					HTML<input type="radio" value="html" name="sub">
					JAVASCRIPT<input type="radio" value="js" name="sub">
				</fieldset>
				
				<fieldset>
					<legend>수강과목</legend>
					JSP<input type="checkbox" value="jsp" name="jsp">
					SQL<input type="checkbox" value="sql" name="sql">
				</fieldset>
				
				<input type="submit" value="회원가입" >
			</form>
		</div>
	
	</body>
</html>