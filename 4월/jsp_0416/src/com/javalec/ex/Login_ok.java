package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login_ok")
public class Login_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection c = null;
	Statement s = null;

	// 아이디 패스워드 비교해야되니까 resultset이 필요
	ResultSet r = null;

	String id, pw, sql, id1, pw1;

	public Login_ok() {
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

		id = request.getParameter("id");
		pw = request.getParameter("pw");

		sql = "select id,pw from lms_member where id='" + id + "' and pw='" + pw + "'";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
			s = c.createStatement();

			r = s.executeQuery(sql);
			// id, pw 데이터

			if (r.next()) { //★★

				// id,pw 데이터가 있는 경우
				while (r.next()) {

					id = r.getString("id");
					pw = r.getString("pw");

				}

				// 섹션 추가
				HttpSession session = request.getSession();

				session.setAttribute("user_id", id);
				session.setAttribute("user_pw", pw);
				session.setAttribute("authUser", id);

				response.sendRedirect("main.jsp");

			}

			else {

				response.setContentType("text/html; charset=utf-8");

				PrintWriter writer = response.getWriter();

				writer.println("<html><head></head><body>");
				writer.println("<script>alert('아이디 비밀번호가 틀립니다'); history.back(-1); </script>");
				writer.println("</body></html>");
				writer.close();

			}

		} catch (Exception e) {

			e.printStackTrace();
			String str;
			str = "<script type=\"text/javascript\">\r\n" + "alert(\"아이디,패스워드가 일치하지 않습니다. 다시 입력해주세요.\");\r\n"
					+ "location.href='login.jsp';\r\n" + "</script>";

			// \r\n : 단락을 나눠줌

			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			writer.println(str);
			writer.println("</body></html>");
			writer.close(); // ★

		} finally {

			try {

				if (s != null)
					s.close();
				if (c != null)
					c.close();
				if (r != null)
					r.close();

			} catch (Exception e2) {
				e2.printStackTrace();

				String str;
				str = "<script type=\"text/javascript\">\r\n" + "alert(\"아이디,패스워드가 일치하지 않습니다. 다시 입력해주세요.\");\r\n"
						+ "location.href='login.jsp';\r\n" + "</script>";

				// \r\n : 단락을 나눠줌

				PrintWriter writer = response.getWriter();
				writer.println("<html><head></head><body>");
				writer.println(str);
				writer.println("</body></html>");
				writer.close(); // ★

			}
		} // finally

	}

}
