package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/AAA")
public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/* *X5,000,000 */
    /*a태그 또는 method="get"을 이용한 request의 경우 doGet()을 실행*/
	/*도메인 부분을 직접 변경하거나, 자바스크립트 location변경을 수행하는 경우 get으로 본다*/
	/*method="post"를 이용한 request의 경우 doPost()를 실행*/
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET방식으로 서블릿 실행");
		RequestDispatcher dis=request.getRequestDispatcher("/get.jsp");
		request.setAttribute("data", "doGet데이터");
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST방식으로 서블릿 실행");
		RequestDispatcher dis=request.getRequestDispatcher("/post.jsp");
		request.setAttribute("data", "doPost데이터");
		dis.forward(request, response);
	}

}
