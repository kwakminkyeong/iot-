<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원 조회 페이지</title>
		<style>
		*{
			margin:0 auto;
			
			border-spacing:0px;
		}
		td,th {
			border:1px solid black;
			text-align:center;
			height:25px;
		}
		th{
			width:150px;		
			height:40px;
			background-color: lightgray;
		}
		</style>
		
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/member00";
			String db_id="root";
			String db_pw="iotiot";
			String sql="select * from member00;";
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				//out.print("<h1>접속 이상없음!</h1>");
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				out.print("<table>");
				out.print("<tr>");
				out.print("<th>회원번호</th>");
				out.print("<th>이름</th>");
				out.print("<th>아이디</th>");
				out.print("<th>비밀번호</th>");
				out.print("<th>이메일</th>");
				out.print("<th>연락처</th>");
				out.print("<th>관리자여부</th>");
				out.print("</tr>");
				while(rs.next()){
					out.print("<tr>");
					out.print("<td>"+rs.getString("num")+"</td>");
					out.print("<td>"+rs.getString("name")+"</td>");
					out.print("<td>"+rs.getString("userid")+"</td>");
					out.print("<td>"+rs.getString("pwd")+"</td>");
					out.print("<td>"+rs.getString("email")+"</td>");
					out.print("<td>"+rs.getString("phone")+"</td>");
					out.print("<td>"+rs.getString("admin")+"</td>");
					out.print("</tr>");
				}
				out.print("</table>");
			}catch(Exception e){
				System.out.println("회원목록 조회 접속중 오류발생 : "+e);
			}finally{
				try{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("회원목록 조회 해제중 오류발생 : "+ ex);
				}
			}
		%>
	</body>
</html>