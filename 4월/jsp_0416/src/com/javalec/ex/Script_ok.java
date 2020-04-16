package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Script_ok")
public class Script_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Script_ok() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet 들어옴");
		actionDo(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost로 들어옴");
		actionDo(request, response);

	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		String str;
		str = "<script type=\"text/javascript\">\r\n" + "alert(\"아이디,패스워드가 잘못되었습니다. 다시 입력해주세요.\");\r\n"
				+ "location.href='script_link.html';\r\n" + "</script>";

		// \r\n : 단락을 나눠줌

		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println(str);
		writer.println("</body></html>");
		writer.close(); // ★

		/*
		 * PrintWriter writer = response.getWriter(); writer.println("<html><head>");
		 * writer.println("<meta charset='utf-8'></head>"); writer.println("<body>");
		 * writer.println("<script>");
		 * writer.println("alert('데이터가 잘못 입력되었습니다 다시 입력해주세요.');");
		 */

		// writer.println("history.back(-1);");
		// writer.println("location.href('index.html');")

		/*
		 * writer.println("</script>"); writer.println("</body></html>");
		 */

	}

}
