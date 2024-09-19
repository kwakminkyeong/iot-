<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>포맷태그 사용</title>
	</head>
	<body>
		<c:set var="num" value="5000000" scope="page"></c:set>
		fmt : number : <fmt:formatNumber value="${num }" type="number"></fmt:formatNumber><br>
		fmt : number 구분기호 없음 : <fmt:formatNumber value="${num }" type="number" groupingUsed="false"></fmt:formatNumber><br>
		fmt : percent %표기 : <fmt:formatNumber value="0.5" type="percent"></fmt:formatNumber><br>
		fmt : currency 단위표기 : <fmt:formatNumber value="5000" type="currency"></fmt:formatNumber><br>
		fmt : currency 단위변경 : <fmt:formatNumber value="5000" type="currency" currencySymbol="$"></fmt:formatNumber><br>
		fmt : pattern 서식표기 : <fmt:formatNumber value="1234.567" pattern="000000,000.0#"></fmt:formatNumber><br> <!-- 세무사업무 회계서식에서 많이 사용 -->
		<!-- 0.0# : .아래로 0이 붙은 자릿수까지 표현하며 #자리는 데이터가 있는 경우에만 표현한다. -->
		<!-- 0,00 : 뒤에서 두자리마다 ,를 이용해서 구별한다는 의미 -->
		<!-- 0,0.0# : 정수부분은 뒤에서 매 자리마다 ,을 이용해서 구별하며 소수부분은 둘째자리까지 표기하되 #자리는 데이터 없으면 생략 -->
		<hr>
		<c:set var="date" value="<%=new java.util.Date() %>" scope="page"></c:set> <!-- java.util.Date() : serverTime날짜정보가 들어있다. -->
		\${date } : ${date}<br>
		
		fmt : formatDate 기본형태 : <fmt:formatDate value="${date }"></fmt:formatDate><br> <!--그냥 써도 나라별로 반감이 없다.-->
		fmt : time : <fmt:formatDate value="${date }" type="time"></fmt:formatDate><br>
		fmt : both : <fmt:formatDate value="${date }" type="both"></fmt:formatDate><br>
		fmt : pattern : <fmt:formatDate value="${date }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"></fmt:formatDate><br>
		
		
		
	</body>
</html>