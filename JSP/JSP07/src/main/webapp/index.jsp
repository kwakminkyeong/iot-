<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>값을 전송하는 여러 태그들</title>
	</head>
	<body>
		
		<!-- 객체를 다룰 수 있는 서버 통켓 .리퀘스트 거치면 화면이 바뀐다.적었던 데이터가 소실되는 것이 단점 동기화 회전방식을 끊어버리는 비동기식 방식(ajax)-->
		<!-- input데이터전송이 가능 하니까 name을 가질 수 있다. p태크는 name을 가질 수 없다. value가 없다->데이터를 보낼 수 없다. -->
		
		
		<div id="wrap">
			
			<form method="post" action="data.jsp">
				<p>일반 p태그의 값 전송처리</p>
				<input type="text" value="input태그의 값 전송처리" name="tx">
				<input type="hidden" name="hi"> 
				<input type="submit" value="전송!">
			
			
			</form>
		
		</div>
		<!-- <select> <!-- 동시선택이 안된다. check box가 활용도가 많다 -->
			<option>봄</option>
			<option>여름</option>
			<option>가을</option>
			<option>겨울</option>
			
		
		</select> -->
		<script>
			//document :지금 보고 있는 문서 자체
			//getElementsByTagName (String tag_name) :태그이름을 기준으로 문서 내부에서 요소들을 가져옴.....리턴타입이 여러개 들어가 있는 배열. document 객체를 수행하는 동작.메서드
			//var i=document.getElementsByTagName("p")[0].i.innerHTML);
			//i.innerHTML="메서드로 넣어봤자 말이 안된다.리턴타입으로 받을려면 매개변수로 받아야 한다."
			//console.log(i[0].value);
			
			console.log(document.getElementsByTagName("p")[0].innerHTML);
			console.log(document.getElementsByTagName("input")[0].value);
			document.getElementsByTagName("input")[1].value=document.getElementsByTagName("p")[0].innerHTML;
			
			//어떤태그들은 값을 전송할 수 없는 것들이 있다.
			//그런 값들은 input type="hidden"에 넣어서 전송해주면 된다.
		</script>
	</body>
</html>