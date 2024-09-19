package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Test")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("doGet 실행, 서블릿의 get을 받아 동작하는 부분 실행");
		//AJAX는 화면 전환 없이 데이터만 주고바든 기능이므로
		//AJAX의 목적지가 되는 서블릿의 화면전환기능을 가지면 안되다.
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("doGet 실행, 서블릿의 post를 받아 동작하는 부분 실행");

	}

}
