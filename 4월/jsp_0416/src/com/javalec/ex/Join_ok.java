package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join_ok")
public class Join_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection c = null;
	PreparedStatement p = null;

	String id, pw, name, email, address, phone, gender, news, sms;
	String birth, sql;

	int check;

	public Join_ok() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet 들어옴");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet 들어옴");
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");

		// request 한글처리 ★
		request.setCharacterEncoding("utf-8"); 
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		email = request.getParameter("email");
		address = request.getParameter("address");
		phone = request.getParameter("phone");
		birth = request.getParameter("birth");
		gender = request.getParameter("gender");
		news = request.getParameter("news");
		sms = request.getParameter("sms");

		sql = "insert into lms_member values(?,?,?,?,?,?,?,?,?,?)";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle","ora_user","1234");
			p=c.prepareStatement(sql);
			p.setString(1,id);
			p.setString(2,pw);
			p.setString(3,name);
			p.setString(4,email);
			p.setString(5,address);
			p.setString(6,phone);
			p.setString(7,birth);
			p.setString(8,gender);
			p.setString(9,news);
			p.setString(10,sms);
			check=p.executeUpdate();
			
			if(check==1) {
				response.sendRedirect("main.jsp");
			}else {
				
				response.setContentType("text/html; charset=utf-8");

				PrintWriter writer = response.getWriter();

				writer.println("<html><head></head><body>");
				writer.println("<script>alert('저장되지 않았습니다 다시 시도해주세요'); history.back(-1); </script>");
				writer.println("</body></html>");
				writer.close();
				
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(c!=null) c.close();
				if(p!=null) p.close();
				

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
