package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form_ok
 */
@WebServlet("/F_ok")

public class Form_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

		System.out.println("객체 생성시 init() 메소드 실행");
	}

	public void destroy() {

		System.out.println("객체 종료시 destroy() 메소드 실행");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet() 메소드 실행");

		// [form]의 [name] 값
		// name, id, pw, hobby[복수], major, address

		String name = request.getParameter("name");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		String[] hobby = request.getParameterValues("hobby");
		//<%= Arrays.toString(request.getParameterValues("hobby"))%> jsp에 할땐
		// 값을 복수로 받음, 객체는 배열로

		String major = request.getParameter("major");
		String address = request.getParameter("address");

		// server.xml에서 utf-8 해줘야 한글 안깨짐 ^^

		response.setContentType("text/html; charset=utf-8");
		// html로 돌려준다

		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body>");
		writer.println("<br>");
		writer.println("이름 : " + name + "<br>");
		writer.println("아이디 : " + id + "<br>");
		writer.println("패스워드 : " + pw + "<br>");

		writer.println("취미 : " + Arrays.toString(hobby) + "<br>");
		// arrays.toString 배열에 있는걸 다 찍어줌

		/*
		 * for(int i=0;i<hobby.length;i++) { writer.println(hobby[i]); }
		 */

		writer.println("전공 : " + major + "<br>");
		writer.println("주소 : " + address + "<br>");
		writer.println("</body></html>");

		writer.close();// 닫아줘야 함

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("doPost() 메소드 실행");
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		String[] hobby = request.getParameterValues("hobby");
		// 값을 복수로 받음, 객체는 배열로

		String major = request.getParameter("major");
		String address = request.getParameter("address");

		// server.xml에서 utf-8 해줘야 한글 안깨짐 ^^

		response.setContentType("text/html; charset=utf-8");
		// html로 돌려준다

		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body>");
		writer.println("<br>");
		writer.println("이름 : " + name + "<br>");
		writer.println("아이디 : " + id + "<br>");
		writer.println("패스워드 : " + pw + "<br>");

		writer.println("취미 : " + Arrays.toString(hobby) + "<br>");
		// arrays.toString 배열에 있는걸 다 찍어줌

		/*
		 * for(int i=0;i<hobby.length;i++) { writer.println(hobby[i]); }
		 */

		writer.println("전공 : " + major + "<br>");
		writer.println("주소 : " + address + "<br>");
		writer.println("</body></html>");

		writer.close();// 닫아줘야 함

	}

}
