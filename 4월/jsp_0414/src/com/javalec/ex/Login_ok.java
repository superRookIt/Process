package com.javalec.ex;

import java.io.IOException;
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
import javax.websocket.SendResult;

@WebServlet("/Login_ok")
public class Login_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login_ok() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet으로 들어옴");
		actionDo(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost으로 들어옴");
		actionDo(request, response);

	}

	// 프로그램 구현
	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection c = null;
		Statement s = null;
		ResultSet r = null;

		String id, pw, id2, pw2, name, phone1, phone2, phone3, gender;

		id = request.getParameter("id");
		pw = request.getParameter("pw");

		String sql = "select * from member2 where id='" + id + "' and pw='" + pw + "'";

		// db에서 id,pw 검색 후 비교
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
            //. . . . 점으로
			
			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
			// : : : 따옴표로
			
			
			s = c.createStatement();
			r = s.executeQuery(sql); // select는 executeQuery/ insert,update,delete는 executeUpdate

			// id,pw가 있을때
			// 있으면 r에 들어옴

			if (r != null) {

				while (r.next()) {

					id2 = r.getString("id");
					pw2 = r.getString("pw");
					name = r.getString("name");
					phone1 = r.getString("phone1");
					phone2 = r.getString("phone2");
					phone3 = r.getString("phone3");
					gender = r.getString("gender");

					// 섹션 가지고 오기, servlet에선 이렇게 해야 함 ㅠㅠ
					HttpSession session = request.getSession();

					session.setAttribute("user_id", id2);
					session.setAttribute("user_pw", pw2);
					session.setAttribute("user_name", name);
					session.setAttribute("authUser", id2);

					response.sendRedirect("index.jsp");

				} // while

			} else {

				// id,pw가 없을때
				response.sendRedirect("index.jsp");

			}

		} catch (Exception e) {

			e.printStackTrace();
			response.sendRedirect("index.jsp");

		} finally {

			try {

				if (c != null)
					c.close();
				if (s != null)
					s.close();
				if (r != null)
					r.close();

			} catch (Exception e2) {

				e2.printStackTrace();
				response.sendRedirect("index.jsp");

			}
		}

	}
}
