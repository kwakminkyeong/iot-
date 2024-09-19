<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>서블릿 패러미터 전송</title>
	</head>
	<body>
		<h1>다음의 패러미터를 전송합니다.</h1>
		첫번째 패러미터 : <input type="text" id="first"><br>
		두번째 패러미터 : <input type="text" id="second"><br>
		마지막 패러미터 : <input type=text" id="last"><br>
		<input type="button" value="GET방식 전송" onclick="requestDoGet()"><br>
		<h2>서버 response</h2>
		<div id="serverResponse"></div>
		
		<script>
			var XHR;
			function createHMLHttpRequest(){
				if(window.ActiveXObject){
					XHR=new ActiveXObject("Microsoft.XMLHTTP");
				}else if(window.XMLHttpRequest){
					XHR=new XMLHttpRequest();
				}
			}
			
			//Get방식으로 request처리 함수
			function requestDoGet(){
				createHMLHttpRequest();
				var dataString="Test?";
				XHR.onreadystatechange=handleStateChange;
				XHR.open("GET", dataString, true);
				XHR.send(null);
			}
			//Post방식으로 request처리 함수
			function requestDoPost(){
				
			}
			//readyState의 변동시마다 동작할 함수
			function handleStateChange(){
				if(XHR.readyState==4){
					if(XHR.status==200){
						console.log("동작 이상 없음");
					}
				}
			}
		</script>
	</body>
</html>