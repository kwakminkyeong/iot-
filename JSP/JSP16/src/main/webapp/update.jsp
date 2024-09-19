<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원정보 수정 처리기</title>
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root";
			String db_pw="iotiot";
			
			request.setCharacterEncoding("utf-8");
			String num=request.getParameter("number");
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name=request.getParameter("nm");
			String email=request.getParameter("em");
			String phone=request.getParameter("ph");
			String address=request.getParameter("ad");
			
			String sql="update register set id='"+id+"', pass='"+pw+"', name='"+name+"', email='"+email+"', phone='"+phone+"', address='"+address+"'";
			sql+=" where num="+num+";";
			
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				stmt=conn.createStatement();
				int result=stmt.executeUpdate(sql);//int의 리턴값을 가지고 있음.
				System.out.println("실행결과 변경된 내역의 수 :"+result);  
				response.sendRedirect("edit.jsp");
			}catch(Exception e){
				System.out.println("회원정보 수정 중 오류 발생 : "+e);
			}finally{
				try{
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("회원정보 수정 접속 해제 중 오류 발생 : "+ex);
				}
			}
			
			
			
			
			
			
			
		%>
		
	</body>
</html>