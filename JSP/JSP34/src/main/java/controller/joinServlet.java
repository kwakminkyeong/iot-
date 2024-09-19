package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

import beans.Member;
import DAO.MemberDAO;
import javax.servlet.http.*;



@WebServlet("/join.do")
public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//a태그를 클릭한 경우 실행되는 부분
		RequestDispatcher dis=request.getRequestDispatcher("register.jsp");
		dis.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form태그를  post method로 submit시킨 경우 실행되는 부분
		request.setCharacterEncoding("utf-8"); //post방식의 경우 한글이 깨질 수 있으므로 지정해야함.
		String name=request.getParameter("nm");
		String userid=request.getParameter("userid");
		String pwd=request.getParameter("pwd");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String admin=request.getParameter("admin");
		
		Member m=new Member();
		m.setName(name);
		m.setUserid(userid);
		m.setPwd(pwd);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAdmin(admin);
		
		//test 꼭 하고 넘어가기
		/*System.out.println(m.getName());
		System.out.println(m.getUserid());
		System.out.println(m.getPwd());
		System.out.println(m.getEmail());
		System.out.println(m.getPhone());
		System.out.println(m.getAdmin());*/
		
		MemberDAO mDAO=MemberDAO.getInstance();
		int result=mDAO.insertMember(m);
		HttpSession session=request.getSession();
		if(result==1) {
			session.setAttribute("userid",m.getUserid() );
			request.setAttribute("mag", "회원가입에 성공했습니다.");
		}else {
			request.setAttribute("msg","회원가입에 실패했습니다.");
		}
		RequestDispatcher dis=request.getRequestDispatcher("login.do");
		dis.forward(request, response);
	}

}
