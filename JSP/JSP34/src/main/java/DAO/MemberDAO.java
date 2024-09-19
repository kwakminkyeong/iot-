package DAO;
import java.sql.*;
import beans.Member;

public class MemberDAO {
	private MemberDAO(){
		
	}
	private static MemberDAO instance=new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	//커넥션 연결처리 메서드(이전에 각 페이지마다 수행했던 내용)
	public Connection getConnection() throws Exception{
		Connection conn=null;
		String url="jdbc:mysql://127.0.0.1:3306/member00";
		String db_id="root";
		String db_pw="iotiot";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url, db_id, db_pw);
		return conn;

	}
	
	//로그인처리 관련 메서드
	public int userCheck(String userid, String pwd) {
		//-1이면 아이디가 없는 경우(아이디를 잘못 적었거나 회원가입이 되지 않은 경우), ResultSet이 Empty인 경우
		//1이면 아이디가 있고 비밀번호도 일치하는 경우
		//0이면 비밀번호가 null이거나 입력값과 다른 값을 입력한 경우
		int result=-1; //result의 성공값 실패값
		String sql="select pwd from member00 where userid=? ";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("pwd").equals(pwd) && rs.getString("pwd")!=null) {
					//사용자가 입력한 비밀번호와 데이터베이스의 비밀번호가 일치하며 또한 데이터베이스 내부의 비밀번호가 공란이 아닐 것
					result=1;
				}else {
					//사용자가 입력한 비밀번호와 데이터베이스의 비밀번호가 일치하지 않거나 테이터베이스 내부 비밀번호가 공란인 경우
					
					result=0;
					
				}
			}else {//ResultSet의 내용물이 Empty인 경우
				result=-1;
				
			}
			
		}catch(Exception e){
			System.out.println("로그인 접속 중 오류발생 :"+e);
		}finally{
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {
				System.out.println("로그인 접속 해제 중 오류발생 : "+ex);
			}
		}
		return result;
	}//로그인처리 메서드 종료
	
	//단일 사용자 정보 조회 메서드
	public Member getMember(String userid) {
		Member m=null;
		String sql="select * from member00 where userid=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				m=new Member();
				m.setNum(rs.getString("num"));
				m.setName(rs.getNString("name"));
				m.setUserid(rs.getString("userid"));
				m.setPwd(rs.getString("pwd"));
				m.setEmail(rs.getString("email"));
				m.setPhone(rs.getString("phone"));
				m.setAdmin(rs.getString("admin"));
			}
		}catch(Exception e) {
			System.out.println("단일회원 정보 조회 접속 중 오류발생 : "+e);
			
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {
				System.out.println("단일회원 정보 조회 접속 해제 중 오류발생 : "+ex);
			}
		}
		return m;
	}//단일사용자 정보 조회 메서드 종료
	
	//아이디 중복확인 처리
	public int confirmID(String userid) {
		//1이면 아이디가 경우
		//-1이면 아이디가 없는 경우
		int result=-1;
		String sql="select userid from member00 where userid=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				result=1;
	
			}else {
				result=-1;
			}
		}catch(Exception e){
			System.out.println("아이디 중복확인 접속 중 오류발생 : "+e);
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				
			}catch(Exception ex){
				System.out.println("아이디 중복확인 접속 해제 중 오류발생 : " +ex);
			}
		}
		
		return result;
	}//아이디 중복처리 확인 종료
	
	//회원가입
	public int insertMember(Member m) {
		//1이면 회원가입에 문제가 없었고
		//-1이면 회원가입시 문제 발생
		int result=-1;
		String sql="insert into member00(name, userid, pwd, email,phone, admin) values(?,?,?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,m.getName());
			pstmt.setString(2,m.getUserid());
			pstmt.setString(3,m.getPwd());
			pstmt.setString(4,m.getEmail());
			pstmt.setString(5,m.getPhone());
			pstmt.setString(6,m.getAdmin());
			result=pstmt.executeUpdate(); //성공적인 입력의 경우 1이 입력됨
			
		}catch(Exception e) {
			System.out.println("회원가입 접속 중 오류 발생 : "+e);
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception ex) {
				System.out.println("회원가입 접속 중 오류 발생 : "+ex);
			}
		}
		
		return result;
		
	}//회원가입종료
	
	
}//class종료
