package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

/**
 * Servlet implementation class E0402_01
 */

@WebServlet("/E01")
public class E0402_01 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public E0402_01() {
		/* super(); */
	} // 생성자

	// 선처리 ★
	@PostConstruct
	public void postCon() {
		System.out.println("postCon - init()메소드보다 먼저 실행");
	}

	// 후처리 ★
	@PreDestroy
	public void preDe() {
		System.out.println("preDe - destory() 메소드보다 나중에 실행");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("servlet 생성시 최초 한번 init() 메소드가 실행");
		System.out.println("최초 실행시 처리해야 할 구문이 있다면 여기에 입력");
	}

	@Override
	public void destroy() {
		System.out.println("servlet 종료시 최초 한번 destory() 메소드 실행");
		System.out.println("종료시 servlet에서 처리해야 할 구문이 있다면 여기에 입력");
	}

	// 주소로 바로 접근하게 되거나 , form method="get"
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Action(request, response);

	}

	// form method="post"
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Action(request, response);

	}

	protected void Action(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("if you see this message, print is well :-)");

		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html; charset=utf-8");

		PrintWriter writer = response.getWriter();

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

		String[] hobby = request.getParameterValues("hobby");

		String major = request.getParameter("major");
		String address = request.getParameter("address");

		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<style>p{font-size:20px;color:red}</style>");
		writer.println("<body>");
		writer.println("<p>안녕하세요 ^^</p><p>" + name + "님 반값습니다</p>");
		writer.println("<p>id는 " + id + "임</p>");
		writer.println("<p>password는 " + pw + "임</p>");

		/* writer.println("<p>취미는 " + Arrays.toString(hobby) + "임</p>"); */

		writer.println("<p>이름은 " + name + "임</p>");

		switch (major) {
		case "kor":
			writer.println("<p>학과는 국문학과 임</p>");
			break;

		case "eng":
			writer.println("<p>학과는 영문학과 임</p>");
			break;

		case "math":
			writer.println("<p>학과는  수학과 임</p>");
			break;

		case "design":
			writer.println("<p>학과는 디자인과 임</p>");
			break;

		}

		// 취미 출력
		String hobby2 = "";
		writer.println("<p> 취미 : ");
		for (int i = 0; i < hobby.length; i++) {

			switch (hobby[i]) {

			case "read":
				hobby2 = "독서 ";
				break;
			case "cook":
				hobby2 = "요리 ";
				break;

			case "running":
				hobby2 = "러닝 ";
				break;

			case "swimming":
				hobby2 = "수영 ";
				break;
			}

			writer.println(hobby2 + " ");

		}

		writer.println("</p> <br>");

		/*
		 * writer.println("<p>주소는 " + address + "임</p>");
		 */

		switch (address) {
		case "seoul":
			writer.println("<p>주소는 서울임</p>");
			break;

		case "gyeonggi":
			writer.println("<p>주소는 경기임</p>");
			break;

		case "busan":
			writer.println("<p>주소는 부산임</p>");
			break;

		case "incheon":
			writer.println("<p>주소는 인천임</p>");
			break;

		}

		writer.println("</body>");
		writer.println("</html>");

		writer.close();

	}

}
