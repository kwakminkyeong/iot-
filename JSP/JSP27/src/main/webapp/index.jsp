<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>JSTL</title>
	</head>
	<body>
		<%
			//JSP server page Standard Tag Library  업계에서는 표준 라이브러리
			//jstl을 사용하기 위해서는 tag라이브러리를 불러와야한다. <c></c>
			//url : uniform resource locator, 해당 자료의 위치를 표기하는 방법, 사이트의 도메인과 동일
			//urn : uniform resource name, 해당 자료의 이름
			//uri : uniform resource identifier, 해당자료의 고유 식별자, 변수명과 같은 고유한 이름	
			//      <div id="http://java.sun.com/jsp/jstl/core"></div>
			
			//기본기능	: core     : c 		: http://java.sun.com/jsp/jstl/core
			//형식변환	: format   : fmt 	: http://java.sun.com/jsp/jstl/fmt
			//DB조작	: sql      : sql 	: http://java.sun.com/jsp/jstl/sql
			//XML조작	: xml      : x 		: http://java.sun.com/jsp/jstl/xml
			//함수처리	: function : fn		: http://java.sun.com/jsp/jstl/fn
			
			
		%>
		<!--  c:out 값을 출력한다 -->
		<c:out value="jstl출력"></c:out><br>
		${"EL출력" }<br>
		<%="Scriptlet 출력" %><br>
		<%out.print("java 출력"); %><br>
		<!-- c:set 값을 입력한다 -->
		<c:set var="test" value="jstl로 저장한 값" scope="page"></c:set>
		${test }
	</body>
</html>