<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>데이터전송실습</title>
		<link rel="stylesheet" href="css/style.css">
		
	</head>
	<body>
		<div id="wrap">
			<div class="list">
					<div class="title">
						<ul>
							<li>상품명</li>
							<li>가격</li>
							<li>수량</li>
						</ul>
					</div>
					<div class="comp">
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
					</div>
					<div class="smart">
						<ul>
							<li>스마트폰</li>
							<li>1500000</li>
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
					
					
					
					</div>
				</div>
			<form method="post" action="pay.jsp">
				<h1>결제총액</h1>
				<h1>0원</h1>
				<input type="hidden" name="comp" value="option">
				<input type="hidden" name="phone" value="0">
				<input type="submit" value="결제하기">
			
			</form>
		
		</div>
		
		<script>
		
		
		
		</script>
	
	</body>
</html>