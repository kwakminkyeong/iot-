<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>로그인 처리 페이지</title>
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root"; //데이터베이스 접속시 사용하는 id값
			String db_pw="iotiot";
			
			request.setCharacterEncoding("utf-8");
			String user=request.getParameter("id");//리퀘스트로 들어온  name=id값
			String pass=request.getParameter("pw"); //input으로 들어온 값
			
			out.print("<h1>"+user+","+pass+"</h1>");
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				String sql="select * from register where id='"+user+"';";
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()){
					String num=rs.getString("num");
					String name=rs.getString("name");
					String pw=rs.getString("pass");//데이터베이스에서 가져온 값
					String email=rs.getString("email");
					String phone=rs.getString("phone");
					String address=rs.getString("address");
					if(pw.equals(pass)){
						System.out.print("<p>로그인 성공</p>");
						session.setAttribute("num",num);
						session.setAttribute("name",name);
						session.setAttribute("email",email);
						session.setAttribute("login",true); //key, value
						
						
						
						/*out.print("<p>로그인 성공</p>");
						out.print("<p>"+num+"</p>");
						out.print("<p>"+name+"</p>");
						out.print("<p>"+pass+"</p>");
						out.print("<p>"+email+"</p>");
						out.print("<p>"+phone+"</p>");
						out.print("<p>"+address+"</p>");*/
					
					}else{
						out.print("<p>로그인실패</p>");
					}
				}
				//out.print("<h1>접속 이상 없음.</h>");
			}catch(Exception e){
				System.out.println("로그인 정보 확인 중 오류 발생 :" +e);
			}finally{
				try{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("로그인 정보 확인 해제 중 오류 발생 :" +ex);
				}
			}
			response.sendRedirect("index.jsp");
		
		%>
	</body>
</html>