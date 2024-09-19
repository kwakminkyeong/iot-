<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>데이터 전송실습</title>
		<link rel="stylesheet" href="css/style.css">
		<script src="js/script.js"></script>
		
		
	</head>
	<body>
		<div id="wrap">
			<table>
				<tr>
					<td>상품명</td>
					<td>가격</td>
					<td>수량</td>
				</tr>
			</table>
			<ul>
				<li>컴퓨터</li>
				<li>1000000</li>
				<li>
					<select>
						<option>0</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
				</li>
			</ul>
			<div class="box">
				<div>스마트폰</div>
				<div>1500000</div>
				<div>
					<select>
						<option>0</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
				</div>
			
<!-- after --></div>    <!--.box 끝  -->
				<div id="result">
					<form method="post" action="pay.jsp">
						<h1>결제총액</h1>
						<h1>0원</h1>
						<input type="hidden" name="hid1" value="0">
						<input type="hidden" name="hid2" value="0">
						<input type="submit" value="결제하기">
					</form>
				</div>
		
		
		</div><!-- #warp 끝 -->
		
		
		
		
	</body>
</html>