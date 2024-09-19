package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


import DAO.MemberDAO;
import beans.Member;

@WebServlet("/login.do")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher dis=request.getRequestDispatcher("/login.jsp");
		
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userid=request.getParameter("userid");
		String pwd=request.getParameter("pw");
		MemberDAO mDAO=MemberDAO.getInstance();
		int result=mDAO.userCheck(userid, pwd);
		System.out.println("동작결과 : "+result);
		
		String url="login.jsp";
		
		if(result==1) {
			//로그인 성공 : 회원정보를 가져와서 세션에다 세팅
			Member m=mDAO.getMember(userid);
			HttpSession session=request.getSession();
			session.setAttribute("loginUser",m);
			request.setAttribute("msg","로그인에 성공하셨습니다." );
			url="main.jsp";
		}else if(result==0) {
			//비밀번호 틀림
			request.setAttribute("msg", "비밀번호가 맞지 않습니다.");
		}else if(result==-1) {
			//회원가입 안됨
			request.setAttribute("msg", "존재하지 않는 회원입니다");
		}
		RequestDispatcher dis=request.getRequestDispatcher(url);
		dis.forward(request, response);
	}

}
