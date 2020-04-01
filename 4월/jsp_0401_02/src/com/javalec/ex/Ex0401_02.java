package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex1")
public class Ex0401_02 extends HttpServlet { // ctrl + t 누르면 상속 내역이 나옴
	private static final long serialVersionUID = 1L;

	// 주소로 바로 접근시
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // doGet 메소드

		System.out.println("doGet으로 열림");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

		// html 문서로 작성이 됨
		response.setContentType("text/html; charset=utf-8");

		// html 화면으로 출력을 해주는 객체( writer )
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>servlet 페이지</title>");
		writer.println("<head></head>");
		writer.println("<body>");
		writer.println("<h1>doGet 로그인페이지</h1>");
		writer.println("<p> id : " + id + "</p>");
		writer.println("<p> pw : " + pw + "</p>");
		writer.println("<p> name : " + name + "</p>");
		writer.println("<p>로그인하기 위해서 form태그로 화면을 작성함</p>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // doPost 메소드

		System.out.println("doPost로 열림");

		request.setCharacterEncoding("utf-8");// 안하면 한글 깨져서 나옴!!

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

		// html 문서로 작성이 됨
		response.setContentType("text/html; charset=utf-8");

		// html 화면으로 출력을 해주는 객체( writer )
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>servlet 페이지</title>");
		writer.println("<head></head>");
		writer.println("<body>");
		writer.println("<h1>doPost 로그인페이지</h1>");
		writer.println("<p> id : " + id + "</p>");
		writer.println("<p> pw : " + pw + "</p>");
		writer.println("<p> name : " + name + "</p>");
		writer.println("<p>로그인하기 위해서 form태그로 화면을 작성함</p>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

}
