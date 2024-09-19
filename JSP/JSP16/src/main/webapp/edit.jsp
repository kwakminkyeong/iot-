<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원 정보 수정</title>
		<style>
			#wrap{
				width:800px;
				padding:50px;
				border: 10px solid lightgray;
				margin:0 auto;
			}
			table{
			
				margin:0 auto;
				margin-top:50px;
			}
			td, th{
				border:1px solid black;
				padding:10px;
				text-align:center;
			
			}
			span{
				display:inline-block;
				width:200px;
				height:30px;
				text-align:right;
				line-height:30px;
				
			}
			input{
				width:300px;
				height:20px;
				margin-left: 10px;
				
			}
			input:last-child{
				width:150px;
				height:50px;
				display:block;
				margin: 30px auto;
				font-weight:bold;
			}
			form{
				width:730px;
				margin:0 auto;
				margin-top:50px;
			}
		</style>
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root";
			String db_pw="iotiot";
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				stmt=conn.createStatement();
				String sql="select * from register;";
				System.out.println(sql);  //실제로 동작하는 쿼리문의 모양을 보기 위함.
				rs=stmt.executeQuery(sql);
				//리절트셋 내부의 내용을 화면으로 출력
		%>
					<div id="wrap">
					<h3>회원 정보 수정</h3><hr>
						<table>
							<tr>
								<th>회원번호</th>
								<th>아이디</th>
								<th>비밀번호</th>
								<th>이름</th>
								<th>이메일</th>
								<th>연락처</th>
								<th>주소</th>
							</tr>
				
		<%
				while(rs.next()){
					String num=rs.getString("num");
					String id=rs.getString("id");
					String pass=rs.getString("pass");
					String name=rs.getString("name");
					String email=rs.getString("email");
					String phone=rs.getString("phone");
					String address=rs.getString("address");
		 %>
						<tr>
							<td><%=num %></td>
							<td><%=id %></td>
							<td><%=pass %></td>
							<td><%=name %></td>
							<td><%=email %></td>
							<td><%=phone %></td>
							<td><%=address %></td>
						
						</tr>
					
		<%
				}//while끝
				
		%>
					</table>
					<form method="post" action="update.jsp">
						변경하실 회원의 번호를 입력해 주세요  <input type="text" name="number">
						<fieldset>
							<legend>수정사항 입력</legend>
							<span>회원 아이디 변경</span><input type="text" name="id"><br>
							<span>회원 비밀번호 변경</span><input type="text" name="pw"><br>
							<span>회원 이름 변경</span><input type="text" name="nm"><br>
							<span>회원 이메일 변경</span><input type="text" name="em"><br>
							<span>회원 연락처 변경</span><input type="text" name="ph"><br>
							<span>회원 주소 변경</span><input type="text" name="ad"><br>
						</fieldset>
						<input type="submit" value="수정하기!">
					</form>
				</div>
				
		<%
			}catch(Exception e){
				System.out.print("접속 중 오류 발생 : "+e);
			}finally{
				try{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.print("접속 중 오류 발생 : "+ex);
				}
			}
		%>
	</body>
</html>