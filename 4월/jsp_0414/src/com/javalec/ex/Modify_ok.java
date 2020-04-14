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

@WebServlet("/Modify_ok")
public class Modify_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	HttpSession session;

	Connection c = null;
	Statement s = null;
	ResultSet r = null;

	String id, pw, name, phone1, phone2, phone3, gender;

	public Modify_ok() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet들어옴");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost들어옴");
		actionDo(request, response);

	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		session = request.getSession();

		id = (String) session.getAttribute("authUser");

		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");

		if (pw_check()) {
			
			System.out.println("pw비교 ok!");

			String sql = "update member2 set name='" + name + "', phone1='" + phone1 + "', phone2='" + phone2+ "', phone3='" + phone3 + "', gender='" + gender + "' where id='" + id + "'";
			System.out.println(sql);
			
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
				s = c.createStatement();
				int ch = s.executeUpdate(sql);
				
				if(ch==1) {
					response.sendRedirect("index.jsp");
					
				}else {
					
					response.sendRedirect("modify.jsp");
					
				}
				
			} 
			catch (Exception e) {
				e.printStackTrace();
				response.sendRedirect("modify.jsp");
			}
			
			finally {
				
				try {
					
					if(s !=null) s.close();
					if(c !=null) c.close();
					
				} 
				
				catch (Exception e2) {
					e2.printStackTrace();
					response.sendRedirect("modify.jsp");
				}
				
				
			}
			
		}//if
		
		else {
			response.setContentType("text/html; charset=utf-8"); 
			PrintWriter writer = response.getWriter();
			
			writer.println("<html><head></head><body>");
			writer.println("<script>alert('비밀번호가 틀립니다'); history.back(-1); </script>");
			writer.println("</body></html>");
			writer.close();
			
			/* response.sendRedirect("modify.jsp"); */
			
		}

	}

	// parameter 넘어온 pw와 섹션의 pw가 같은지 비교
	public boolean pw_check() {

		boolean check = false;
		String user_pw = (String) session.getAttribute("user_pw");
		if (user_pw.equals(pw)) {
			check = true;
		} else {
			check = false;
		}

		return check;
	}

}
