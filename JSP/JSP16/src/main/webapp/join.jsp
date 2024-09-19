<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원정보 입력페이지</title>
		<!-- 사용자한테 보이지 않는다 -->
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root";
			String db_pw="iotiot";
			
			request.setCharacterEncoding("utf-8");
			
			
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name=request.getParameter("nm");
			String email=request.getParameter("em");
			String phone=request.getParameter("ph");
			String address=request.getParameter("ad");
			
			String sql="insert into register (id, pass, name, email, phone, address)";
			sql+="values('"+id+"','"+pw+"','"+name+"','"+email+"','"+phone+"','"+address+"');";
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				stmt=conn.createStatement();
				stmt.execute(sql); //ResultSet이 없는 쿼리문(insert문)이므로 executeQuery사용 불가
				response.sendRedirect("member.jsp");
			}catch(Exception e){
				System.out.println("회원가입 중 오류 발생 :"+e);
			}finally{
				try{
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("회원가입 접속 해제중 오류발생 :"+ex);
				}
			}
		%>
			
			
	
	</body>
</html>