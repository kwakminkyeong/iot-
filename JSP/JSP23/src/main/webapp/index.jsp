<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>EL의 사용</title>
	</head>
	<body>
		<!-- EL : Expression Language, 표현언어 -->
		<!-- 줄임말을 통해 코드의 가독성을 확보하는 방법 -->
		
		<%
			//Java 코드를 직접 출력하는 방법
				out.print("TEST<br>");
			%>
			
			<%--스크립트릿 표현식을 사용하는방법 --%>
			<%="TEST<br>" %>
			
			${"TEST" }<br><!-- EL을 사용하는 방법 -->
			
			<hr>
			<!-- EL의 종류 -->
			정수형 : ${10 }<br>
			실수형 : ${5.6}<br>
			문자열형 : ${"iot 융합프로그래밍" }<br>
			논리형 : ${true }<br>
			null : ${null }<br> <!-- null은 값이 표시되지 않는다 -->
			<hr>
			<!-- EL의 산술연산 : 자료타입을 마음대로 잡는다. 역으로 이용할 수 있다.-->
			\${1+2} : ${1+2}<br>
			\${3-4} : ${3-4}<br>
			\${5*6} : ${5*6}<br>
			\${7/8} : ${7/8}<br>
			\${9%10} : ${9%10}<br>
			
			\${7 div 8 } : ${7 div 8 }<br>
			\${9 mod 10 } : ${9 mod 10 }<br>
			<hr>
			<!-- EL의 비교연산(관계연산) : 계산의 결과가 참 또는 거짓으로 나온다.-->
			\${1==2} : ${1==2 }<br>
			\${1 eq 2} : ${1 eq 2 }<br>
			\${3!=4 } : ${3!=4 }<br>
			\${3 ne 4 } : ${3 ne 4 }<br>
			\${5<6 } : ${5<6 }<br>
			\${5 lt 6} : ${5 lt 6 }<br>
			\${7>8 } : ${7>8 }<br>
			\${7 gt 8 } : ${7 gt 8 }<br>
			\${9<=10 } : ${9<=10 }<br>
			\${9 le 10 } : ${9 le 10 }<br>
			\${11>=12 } : ${11>=12 }<br>
			\${11 ge 12 } : ${11 ge 12 }<br>
			<hr>
			<!--논리연산 -->
			\${true && false } : ${true && false }<br>
			\${true || false } : ${true || false }<br>
			\${!true } : ${!true}<br>
			<hr>
			<!-- null확인연산 -->
			\${empty null } : ${empty null }<br>
		
		<%--<script>
						
			var A="안녕하세요";
			console.log("들어간 내용은 "+A+" 입니다.");
			console.log('이것처럼 ${A}사용도 가능합니다.'); //직접 참조 ${} EL이 이렇게 생겼다.
			
			
		</script>  --%>
	</body>
</html>