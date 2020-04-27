package com.javalec.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 생성자
	public Controller() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet");
		actionDo(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);

	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String viewpage = null;

		String uri = request.getRequestURI();

		String conPath = request.getContextPath();

		String con = uri.substring(conPath.length());

		if (con.equals("/select.do")) {

		
			
			viewpage = "select.jsp";

		} else if (con.equals("/insert.do")) {
			
			

		}
		
		
		
		
		RequestDispatcher dispatch = request.getRequestDispatcher(viewpage);
		dispatch.forward(request, response);
		
		

	}

}//class
