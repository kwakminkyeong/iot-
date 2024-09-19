<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>AJAX</title>
	</head>
	<body>
		<form action="#">
			<input type="text">
			<input type="button" value="테스트!" onclick="startRequest()">
		</form>
		<div id="result"></div>
		
		<script>
			var XHR;
			
			//XHR 변수 내부에 Request를 수행할 수 있는 객체를 생성하는 기능
			function createXMLHttpRequest(){
				if(window.ActiveXObject){
					XHR=new ActiveXObject("Microsoft.XMLHTTP");
				}else if(window.XMLHttpRequest){
					XHR=new XMLHttpRequest();
				}
				console.log(XHR);
			}
			
			//readyState값이 변동될 때마다 수행할 함수 생성
			function handleStateChange(){
				if(XHR.readyState==4){		//통신이 정상적으로 수행 완료된 경우
					if(XHR.status==200){	//통신의 목적지가 존재하는 경우200. 목적지가 없는 경우 404
						console.log(XHR.responseText);
						document.getElementById("result").innerHTML=XHR.responseText;
					}
				}
			}
			
			//실제로 통신을 수행해 줄 함수
			function startRequest(){
				createXMLHttpRequest();	//통신데이터를 전송해줄 Request를 생성
				XHR.onreadystatechange=handleStateChange; //readyState값 변동시 수행할 함수 입력
				XHR.open("GET","data.xml", true); //통신회선연결(방식, 목적지, 비동기여부)
				XHR.send(null);
			}
		</script>
	</body>
</html>