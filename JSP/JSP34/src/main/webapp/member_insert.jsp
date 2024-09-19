<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.time.*" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원가입 처리기</title>
	</head>
	<body>
		<%
		 	Connection conn=null;
			//Statement stmt=null;
			PreparedStatement pstmt=null; //준비된statement 선준비로 가공처리만해서 사용한다.
			
			String url="jdbc:mysql://127.0.0.1:3306/member00";
			String db_id="root";
			String db_pw="iotiot";
			
			//PreparedStatment : 기존의 Statement방식 쿼리문이 가진 불편을 해결하기 위함
			//패러미터가 들어가야 할 자리에 ?를 기호로 사용하여 연결처리
			//String sql="insert into member00(name, userid, pwd, email, phone, admin) values(";
			String sql="insert into member00(name, userid, pwd, email, phone, admin) values(?,?,?,?,?,?);";
			
			
			request.setCharacterEncoding("utf-8");
			String name=request.getParameter("nm");
			String userid=request.getParameter("userid");
			String pwd=request.getParameter("pwd");
			String email=request.getParameter("email");
			//String insTime=LocalDateTime.now().toString();
			String phone=request.getParameter("phone");					
			String admin=request.getParameter("admin");
			//sql+="'"+name+"','"+userid+"','"+pwd+"','"+email+"','"+phone+"','"+admin+"');";
			//System.out.println(sql);
			//out.print(sql);
			
			try{//회선을 연결한다
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				//stmt=conn.createStatement();
				//PreparedStatement.set():index번호는 1부터 시작한다.
				pstmt=conn.prepareStatement(sql); //Statement를 준비하라
				pstmt.setString(1,name);
				pstmt.setString(2,userid);
				pstmt.setString(3,pwd);
				pstmt.setString(4,email);
				pstmt.setString(5,phone);
				pstmt.setString(6,admin);
				//stmt.execute(sql);
				pstmt.execute(); //PreparedStatement는 제작시 sql이 주어지기 때문에 실행시 별도의 쿼리문을 부여치 않는다.
				
				
			}catch(Exception e){
				System.out.println("회원가입 접속 중 오류발생 : "+e);
			}finally{
				try{//꺼꾸로 닫아준다.안닫혀있으면 여러가지 문제의 원인이 된다.
					//if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("회원가입 접속 해제 중 오류발생 :"+ex);
				}
			}
			
		%>
	</body>
</html>