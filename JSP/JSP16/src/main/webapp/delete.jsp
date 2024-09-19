<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원정보 삭제 페이지</title>
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root";
			String db_pw="iotiot";
			
			request.setCharacterEncoding("utf-8");
			String number=request.getParameter("del");
			
			String sql="delete from register where num="+number+";";
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				stmt=conn.createStatement();
				int result=stmt.executeUpdate(sql);
				System.out.println("삭제된 회원 수 :"+result);
				response.sendRedirect("member.jsp");
			}catch(Exception e){
				System.out.println("회원삭제 중 오류발생 :"+e);
			}finally{
				try{
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("회원삭제 접속 해제중 오류발생 :"+ex);
				}
			}
		%>
	</body>
</html>