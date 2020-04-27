package com.javalec.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")

public class Bfront extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bfront() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet 들어옴");
		actionDo(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost 들어옴");
		actionDo(request, response);

	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String viewpage = null;

		Bcommand comm = null;

		String uri = request.getRequestURI();// URL은 안됨
		// jsp_0427/list.do

		String conPath = request.getContextPath();

		String com = uri.substring(conPath.length());

		// 호출 페이지
		if (com.equals("/list.do")) {

			/* Blistcommand bcomm=new Blistcommand(); */

			comm = new Blistcommand();
			comm.execute(request, response);
			viewpage = "list.jsp";
			

		} else if (com.equals("/content_view.do")) {

			/* comm = new BContentcommand(); */
			
			comm.execute(request, response);
			viewpage = "content_view.jsp";

		}

		else if (com.equals("/write_view.do")) {

			/* comm = new BWritecommand(); */
			
			comm.execute(request, response);
			viewpage = "write_view.jsp";

		}
		
		else if (com.equals("/reply_view.do")) {

			/* comm = new BReplyViewcommand(); */
			
			comm.execute(request, response);
			viewpage = "reply_view.jsp";

		}
		
		

		// 호출한 페이지 request객체와 함께 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewpage);
		dispatcher.forward(request, response);

	}

}// class
