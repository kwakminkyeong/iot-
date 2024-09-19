package test;

import java.sql.*; //데이터베이스와 자바를 연결하는 클래스들이 들어있는 경로

public class sample {
	public static void main(String[] args) {
		Connection conn=null; //회선 DAO
		Statement stmt=null;  //회선 내부에서 쿼리문을 데이터베이스로 전송하는 객체
		ResultSet rs=null; 	  //select문의 결과를 java로 전송하는 규격
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String user="root";
		String pw="iotiot";
		
		
		
		try {
			conn=DriverManager.getConnection(url, user, pw);	//회선객체 연결
			stmt=conn.createStatement();						//회선 내부 데이터 이전객체 생성
			
			String sql="select * from student order by sum desc;";		//쿼리문같이 생긴 String 문자열 -> Statement로 전달
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				Student s=new Student();
				s.setName(rs.getString("name"));
				System.out.println(s.getName());
			}
			
			
			
		}catch(Exception e){
			System.out.println("접속 중 오류 발생 : "+e);
			
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(Exception ex) {
				System.out.println("접속해제 중 오류 발생 : "+ex);
			}
		}
		
	}//main종료
}//class 종료
class Student{
	private int num;
	private String name;
	private int math;
	private int kor;
	private int ent;
	private int sum;
	//오른쪽 마우스키 source getters and setters DTO
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEnt() {
		return ent;
	}
	public void setEnt(int ent) {
		this.ent = ent;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
