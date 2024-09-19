<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원가입</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<div id="wrap">
			<form method="get" action=join.jsp>
				<h1>회원가입</h1>
				<hr>
				<div class="left">
					<div>아이디</div>
					<hr>
					<div>전화번호</div>
					<hr>
					<div>비밀번호</div>
					<hr>
					<div>비밀번호확인</div>
					<hr>
					<div>전화번호인증</div>
					<hr>
					<div>재적교회(지역/교회명)</div>
					<hr>
					<div>연령대</div>
					<hr>
					<div>성별</div>
					
					
				
				</div>
				
				<div class="right">
					<div>
					
						<div class="inp"><input type="text" placeholder="아이디를 입력해 주세요" onblur="this.placeholder='아이디를 입력해 주세요'" onfocus="this.placeholder=''" name="id">
										 <input class="btn" type="button"  value="중복확인" name="chebtn"></div>
				
					</div>
				
				<hr>
			
						<div class="inp">   <input type="text" placeholder="-빼고 입력해주세요" onblur="this.placeholder='-빼고 입력해주세요'" onfocus="this.placeholder=''" name="ph"><br></div>
					   
				<hr>
				
				
						<div  class="inp"><input type="password" placeholder="비밀번호를 입력해 주세요" onblur="this.placeholder='비밀번호를 입력해 주세요'" onfocus="this.placeholder=''" name="pw"><br></div>
				<hr>		
						<div  class="inp"><input type="password" placeholder="일치하게 한번 더 입력해 주세요" onblur="this.placeholder='일치하게 한번 더 입력해 주세요'" onblur="this.pla" onfocus="this.placeholder=''" name="pw2"><br></div>
				<hr>	
					<div>
						<div  class="inp"><input type="password" placeholder="-빼고 입력해주세요" onblur="this.placeholder= '-빼고 입력해주세요'"onfocus="this.placeholder=''" name="ph2"	>
					 	 				  <input class="btn" type="button" value="인증번호받기" name="btn"><br></div>	   
					</div>
				<hr>
					
						<div  class="inp"><input type="text" placeholder="지역명과 재적교회명을 입력해주세요" onblur="this.placeholder='역명과 재적교회명을 입력해주세요'" onfocus="this.placeholder=''" name="where"><br></div>
						
		    
		       	 <hr>
			       		<div class="inp">
							 10대<input type="radio" value="10대" name="age">
							 20대<input type="radio" value="20대" name="age">
							 30대<input type="radio" value="30대" name="age">	  
							 40대<input type="radio" value="40대" name="age">
							 50대<input type="radio" value="50대" name="age">
							 60대<input type="radio" value="60대" name="age">
							 70대 이상<input type="radio" value="70대" name="age">
						        				
						</div>	
					<hr>
						<div class="inp">
							여성 <input type="checkbox" value="여성" name="gender">
							남성 <input type="checkbox" value="남성" name="gender">
						</div>
				</div>
				<hr>
				<div class="footer">
						    <input class="sbm" type="submit" value="전송" name="sub">				</div>
				</div>
				
			
			</form>
		
		
		</div>
	</body>
</html>