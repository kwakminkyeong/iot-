<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.text.*" %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>결제 페이지</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String comp=request.getParameter("hid1");//컴퓨터 몇대인지 확인
			String phone=request.getParameter("hid2");
			System.out.println("컴퓨터 : "+comp);
			System.out.println("스마트폰 : "+phone);
			
			if(comp==null || phone==null){
				out.print("<h1 style='color:red;'>잘못된 경로로 접근하셨습니다.</h1>");
			}else if(comp.equals("0") && phone.equals("0")){
				out.print("<h1 style='color:blue;'>구매하신 상품이 없습니다.</h1>");
			}else{
				int price1=Integer.parseInt(comp)*1000000;
				int price2=Integer.parseInt(phone)*1500000;
				int result=price1+price2;
				//천단위 구분기호를 적는 법
				DecimalFormat df=new DecimalFormat("#,###");
				String change=df.format(result);
				
				System.out.println("컴퓨터 구매 수 : "+comp);
				System.out.println("컴퓨터 구매 금액 : "+price1);
				System.out.println("스마트폰 구매 수 : "+phone);
				System.out.println("스마트폰 구매 금액 : "+price2);
				System.out.println("구매 총액 : "+change);
				
				
			}
			
		%>
		<h1>컴퓨터 구매 수 : <%=comp %></h1>
		<h1>컴퓨터 구매 금액 : <%= %></h1>
		<h1>스마트폰 구매 수 : <%=phone %></h1>
		<h1>스마트폰 구매 금액 : <%= %></h1>
		<h1>구매 총액 : <%= %></h1>
	</body>
</html>