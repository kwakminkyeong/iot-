<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>표현방법</title>
	</head>
	<body>
		<%
			//스크립트릿 : 내부에서는 Java언어를 사용할 수 있다.
			//html을 적으면 오류가 난다. 
			//prompt(); alert();자바스크립트 언어이다. 오류로 사용불가
			
			String c="<h1 style='color:orange;'>외부표현</h1>";
			out.print(c);
			String b="blue";
			
			//out.print("<h1 style='color:"+c+";'>외부표현</h1>"); //스크립트릿 밖에 적으라는 뜻
			
			//디자인 우선순의(높은것부터 표현)
			//1.사용자 디자인(장치를 사용하는 사람이 블루라이트 필터, 나이트모드, 화면밝기, 썬글라스, 모니터전원)
			//2.개발자 디자인(개발자가 직접 적어놓은 디자인 CSS)
			//	2-1. inline 디자인(태그에 직접 style을 적은 경우)
			//	2-2. stylesheet 디자인(link rel='stylesheet', <style>내부에 작성한 경우)
			//		2-2-1.아이디선탹자 디자인(#id)
			//		2-2-2.클래스선택자 디자인(.class)
			//		2-2-3.태그선택자 디자인(h1)
			//		2-2-4.전체선택자 디자인(*)
			//3.기본 디자인(적지 않아도 기본적으로 있는 디자인 h1태그) 
		%>
		<%=c %> 
		
		<h1 style="color:<%=b%>; text-align:center;">외부표현</h1>
		
		<%
		
		String[] arr={"red", "orange", "yellow", "green", "blue", "navy", "purple"}; 
		
		for(int i=0; i<7; i++){
			%>
			
			<h1 style="color:<%= arr[i%7]%>;">다음의 색상을 표현</h1>
			
			<%
		}//for문 종료
		%>
		
		
		
		
		
		
		
		
	</body>
</html>