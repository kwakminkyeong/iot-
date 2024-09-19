<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>AJAX</title>
	</head>
	<body>
		<h1>Asynchronous Javascript And Xml</h1>
		<input type="button" value="테스트!" onclick="startRequest()">
		
		<script>
			//XMLHttpRequest : Http통신규격을 이용해서 XML의 데이터를 통신하는 기법
			//과거 일부 인터넷 브라우저에서 ActiveX의 형식으로 제공된 내용
			//W3C 표준이 아니므로 브라우저마다 다른 방식으로 구현되었다.
			//IE계열의 브라우저에서는 ActiveXObject방식으로 구현되었고
			//타계열의 브라우저에서는 XMLHttpRequest의 형태로 구현되었다.(네이버)
			
			//XMLHttpRequest 용어정리
			//send() : Request에 담긴 데이터를 특정 위치로 통신연결하는 명령어
			//		   get방식의 경우 위치정보에 데이터가 포함되므로 전송데이터는 null로 전송 *X5,000,000
			//		   post방식의 경우 데이터를 포함시켜서 전송해줘야한다.	
			//readyState : 요청 상태값이 저장되어 있는 변수
			// 0 : uninitialized, 초기화되지 않은 상태
			// 1 : loading, 데이터를 읽고있는 상태
			// 2 : loaded, 모든 정보를 읽은 상태
			// 3 : interactive, 해당정보를 보내고 response를 받아오는 과정
			// 4 : complete, 모든 요청이 완료된 상태
			//onreadystatechange : readyState의 값이 변동될 때마다 실행될 함수를 저장하는 공간.  총 4번 변경, 넣어두기만하면 자동실행된다.
			//responseText : 응답받은 데이터를 String으로 표현
			//responseXML : 응답받은 데이터를 XML로 표현
			
			
			
			
			var XHR;
			function createXMLHttpRequest(){
				if(window.ActiveXObject){//해당 브라우저가 IE(MS)계열의 브라우저인지를 체크
					XHR=new ActiveXObject("Microsoft.XMLHTTP");
					
					
				}else if(window.XMLHttpRequest){ //해당 브라우저가 타계열의 브라우저인지 체크
					XHR=new XMLHttpRequest();
				}
			}
		
			//AJSX요청처리를 진행해줄 함수
			function startRequest(){
				createXMLHttpRequest();
				XHR.onreadystatechange=handleStateChange;
				console.log("request 이전"+XHR.readyState);
				XHR.open("GET","data.xml", true);   //true비동기식 통신 0,1실행
				console.log("request 이후" + XHR.readyState);
				XHR.send(null); //2, 3, 4실행
				
			}
			//readyState값이 변돌될 때마다 실행될 함수
			function handleStateChange(){
				if(XHR.readyState==4){//response가 도착했다면
					if(XHR.status==200){//200 정상동작 코드
						alert("다음의 정보 전달 : "+XHR.responseText);
					}
					
				}
			}
			
		</script>
		
	</body>
</html>