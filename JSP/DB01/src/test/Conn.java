package test;

import java.sql.*; //sql을 이용한 통신을 진행할 때 필요한 class들이 들어있음
import java.util.Scanner;

public class Conn {
	public static void main (String[] args) {
		Connection conn=null;   //데이터베이스와 연결할 통신회선
		Statement stmt=null;	//java에서 테이터베이스로 데이터를 보내는 객체
		ResultSet rs=null;	    //데이터베이스에서 java로 데이터를 가져오는 객체
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";   //접속경로 jdbc를 경유해서 mysql에 도달하는 방식으로 local host의 mysql번호를 적어주고 데이터중 sample을 사용할것이다.
		String user="root"; //데이터베이스 접속아이디
		String pw="iotiot"; //데이터베이스 접속 비밀번호
		Scanner sr= new Scanner(System.in);
		
//		try {
//			
//			conn=DriverManager.getConnection(url, user, pw); //회선연결
//			stmt=conn.createStatement();   //쿼리문을 전달해줄 객체 생성
			//ResultSet : 쿼리문의 결과로 반환되어 오는 객체(select에서만 쓴다.)
			//String sql="select * from student;";  //전달할 쿼리문
			//rs=stmt.executeQuery(sql);			  //전달 및 결과받아옴	
			
			//while(rs.next()) { //한줄의 데이터를 읽은 뒤 이터레이터를 아랫줄로 이동
				//rs.next()는 다음줄에 데이터가 있으면 true 반환, 없으면 false 반환
				//for(int i=1; i<=6; i++) {
					//System.out.print(rs.getString(i)+"\t");
				//}
				//System.out.println();
//			String num=rs.getString(1);  //데이터 가져올 때 index가 1부터 시작
//			String name=rs.getString(2);
//			String math=rs.getString(3);
//			String kor=rs.getString(4);
//			String ent=rs.getString(5);
//			String sum=rs.getString(6);
//			System.out.println(num+"\t"+name+"\t"+math+"\t"+kor+"\t"+ent+"\t"+sum);
			//}
			
//			System.out.println(num);
//			System.out.println(name);
//			System.out.println("접속 이상 없음");
//		}catch(Exception e){
//			System.out.println("접속 중 오류 발생 :"+e);
//			
//		}
//		
		
		
//		try {
//					
//			conn=DriverManager.getConnection(url, user, pw); //회선연결
//			stmt=conn.createStatement(); 
//			//insert문은 ResultSet이 없다.
//			//통상적으로 insert문은 사용자가 입력한 내용을 변수에 담아 전달하므로
//			//쿼리문으로 가동하여 Statement에게 전달한다.
//			String name="고희선";
//			String math="100";
//			String kor="100";
//			String ent="100";
//			String sum="300";
//			String sql="insert into student(name, math, kor, ent, sum) values(";
//			sql+="'"+name+"',"+math+","+kor+","+ent+","+sum+");";
//			System.out.println(sql);
//			
//			boolean result=stmt.execute(sql); // 화면에 보이지 않기때문에 false
//			System.out.println("실행경과 : "+result);
//			//stmt.execute(String sql) : return boolean, ResultSet의 여부를 반환,insert에 사용
//			//stmt.executeQuery(String sql) : return ResultSet, select에 사용
//			//stmt.executeUpdate(String sql) : return int, 영향을 받은 갯수를 반환, update delete에 사용
//		}catch(Exception e){
//			System.out.println("접속 중 오류 발생 :"+e);
//			
//		}finally {
//			try {
//				if(rs!=null) rs.close();
//				if(stmt!=null) stmt.close();
//				if(conn!=null) conn.close();
//			}catch(Exception ex){
//				System.out.println("접속 해제 중 오류 발생 :" +ex);
//			}//try종료
//		}//fially종료
//		
		
		try {
			
			conn=DriverManager.getConnection(url, user, pw); //회선연결
			stmt=conn.createStatement(); 
			System.out.println("이름을 입력해 주세요");
			String name;
			name=sr.next();
			
			int math;
			System.out.println("수학점수를 입력해 주세요");
			math=sr.nextInt();
			int kor;
			System.out.println("국어점수를 입력해 주세요");
			kor=sr.nextInt();
			int ent;
			System.out.println("영어점수를 입력해 주세요");
			ent=sr.nextInt();
			int sum;
			System.out.println("합계를 입력해 주세요");
			sum=sr.nextInt();
			String sql="insert into student(name, math, kor, ent, sum) values(";
			sql+="'"+name+"',"+math+","+kor+","+ent+","+sum+");";
			System.out.println(sql);
			
			boolean result=stmt.execute(sql); // 화면에 보이지 않기때문에 false
			System.out.println("실행경과 : "+result);
			//stmt.execute(String sql) : return boolean, ResultSet의 여부를 반환,insert에 사용
			//stmt.executeQuery(String sql) : return ResultSet, select에 사용
			//stmt.executeUpdate(String sql) : return int, 영향을 받은 갯수를 반환, update delete에 사용
		}catch(Exception e){
			System.out.println("접속 중 오류 발생 :"+e);
			
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(Exception ex){
				System.out.println("접속 해제 중 오류 발생 :" +ex);
			}//try종료
		}//fially종료
		
		
	}//main종료

}//class종료
