<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>데이터베이스 연결 테스트</title>
		<style>
		td{
						border:1px solid black;
						height:30px;
					 }
		</style>
	</head>
	<body>
		<%
			Connection conn=null; //데이터베이스와 자바간 접속 회선  //import가 안되어 있으면 에러난다
			Statement stmt=null;  //회선을 이동하면서 쿼리문을 전달해줄 객체
			ResultSet rs=null;	  //select쿼리문의 결과가 있는 경우 가져올 때의 규격 *X5,000,000_ResultSet은 select문에만 있다.
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String user="root";
			String pw="iotiot";
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, user, pw);
				stmt=conn.createStatement();
				String sql="select * from register;";
				rs=stmt.executeQuery(sql);  //쿼리문이 select인 경우 ResultSet에 담아서 결과를 확인한다.
				System.out.println(rs);
				out.print("<table>");
				while(rs.next()){
					out.print("<tr>");
					out.print("<td>"+rs.getString("num")+"</td>");
					out.print("<td>"+rs.getString("id")+"</td>");
					out.print("<td>"+rs.getString("pass")+"</td>");
					out.print("<td>"+rs.getString("name")+"</td>");
					out.print("<td>"+rs.getString("email")+"</td>");
					out.print("<td>"+rs.getString("phone")+"</td>");
					out.print("<td>"+rs.getString("address")+"</td>");
					out.print("</tr>");
					/* out.print("<h1>");
					out.print(rs.getString("id"));
					out.print(rs.getString("pass"));
					out.print(rs.getString("name"));
					out.print("</h1");*/
				}
				out.print("</table>");
			}catch(Exception e){
				out.print("<h1>접속 중 오류 발생</h1>");
				System.out.println(e);
				
			}
		%>
	</body>
</html>