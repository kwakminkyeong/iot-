<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>AJAX와 DOM</title>
	</head>
	<body>
		<form action="#">
			<input type="button" value="iot과목조회" onclick="startRequest('iot')">
			<input type="button" value="web과목조회" onclick="startRequest('web')">
			<input type="button" value="app과목조회" onclick="startRequest('app')">
		</form>
		
		<div id="result">
		
		</div>
		
		<script>
			var XHR;
			var type=" "; //함수 실행 시 매개변수의 값을 저장하기 위한 용도
			function creatXMLHttpRequest(){
				if(window.ActiveXObject){
					XHR=new ActiveXObject("Microsoft.XMLHTTP");
				}else if(window.XMLHttpRequest){
					XHR=new XMLHttpRequest();
				}
			}
			function startRequest(requestType){
				 type=requestType;
				 creatXMLHttpRequest();
				 XHR.onreadystatechange=handleStateChange;
				 XHR.open("GET","data.xml", true);
				 XHR.send(null);
			}
			//startRequest();
			function handleStateChange(){ //readyState변경 시 마다 실행
				//console.log(XHR.readyState);
				if(XHR.readyState==4){ 	//통신연결 완료시
					if(XHR.status==200){//통신목적지 존재확인 시
							list();
					}					
				}
				
			}
			
			//iot관련 과목만 출력하는 함수
			function list(){
				var DOC=XHR.responseXML;
				var iot=DOC.getElementsByTagName(type)[0];
				var subjects=iot.getElementsByTagName("subject");
				//console.log(subjects);
				for(let i=0; i<subjects.length; i++){
					console.log(subjects[i].childNodes[0].nodeValue);
				}
			}
		
		</script>
	
	</body>
</html>