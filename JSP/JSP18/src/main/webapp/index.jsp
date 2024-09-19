<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.net.*" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>인클루드 확인</title>
	</head>
	<body>
		<div id="wrap">
			<jsp:include page="data.jsp">
				<jsp:param name="nm" value="이영준"></jsp:param>
				<jsp:param name="edit" value='<%=URLEncoder.encode("이영준", "utf-8") %>'></jsp:param>
			</jsp:include>
			<hr>
			<h3>이 내용은 index.jsp에 있던 내용입니다.</h3>
		</div>
	</body>
</html>