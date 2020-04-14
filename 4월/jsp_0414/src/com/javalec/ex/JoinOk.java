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

@WebServlet("/JoinOk")
//form action에 JoinOk.java까지 입력하지 말고 JoinOk만 입력하기


public class JoinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JoinOk() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet으로 들어옴");
		actionDo(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost로 들어옴");
		actionDo(request, response);

	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id, pw, name, phone1, phone2, phone3, gender;

		Connection con = null;
		Statement stmt = null;

		/* ResultSet rs=null; : select 구문에서만 넣음 */

		request.setCharacterEncoding("UTF-8");

		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");

		String sql = "insert into member2 values('" + id + "','" + pw + "','" + name + "','" + phone1 + "','" + phone2
				+ "','" + phone3 + "','" + gender + "')";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
			stmt = con.createStatement();

			// 저장 ok->1, 저장x ->0
			int result = stmt.executeUpdate(sql);
			// executeUpdate ★★★★★

			// 저장결과 페이지 분기
			if (result == 1) {
				response.sendRedirect("joinResult.jsp");

			}

			else {

				PrintWriter writer = response.getWriter();
				writer.println("<html><head>");
				writer.println("<meta charset='utf-8'></head><body>");
				writer.println("<script>alert('저장이 되지 않았습니다. 다시 입력해 주세요');");
				writer.println("location.href('join.html'); </script>");
				writer.println("</body></html>");

				response.sendRedirect("join.html");
			}

		} catch (Exception e) {
			e.printStackTrace();
			
			PrintWriter writer = response.getWriter();
			response.setContentType("text/html;charset=utf-8");//★★★
			writer.println("<html><head>");
			writer.println("<meta charset='utf-8'></head><body>");
			writer.println("<script>alert('저장이 되지 않았습니다. 다시 입력해 주세요');");
			writer.println("location.href('join.html'); </script>");
			writer.println("</body></html>");

			response.sendRedirect("join.html");

		}

		finally {

			try {

				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally

	}//actionDo

}
