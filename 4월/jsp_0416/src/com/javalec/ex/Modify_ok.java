package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Modify_ok")
public class Modify_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection c=null;
	PreparedStatement p=null;
	
	String id, pw, name, email, address, phone, gender, news, sms;
	String birth, sql;

	int check;
	
	
	public Modify_ok() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Modify_ok doGet 들어옴");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Modify_ok doPost 들어옴");
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
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
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
			sql="update lms_member set email=?, name=?, pw=?, address=?, phone=?, birth=? , gender=?, news=?, sms=? where id=?";
			p=c.prepareStatement(sql);
			
			p.setString(1,email);
			p.setString(2,name);
			p.setString(3,pw);
			p.setString(4,address);
			p.setString(5,phone);
			p.setString(6,birth);
			p.setString(7,gender);
			p.setString(8,news);
			p.setString(9,sms);
			p.setString(10,id);
			check = p.executeUpdate();
			
			if(check==1) {
				
				response.sendRedirect("main.jsp");
				
			}else {

				PrintWriter writer = response.getWriter();

				writer.println("<html><head></head><body>");
				writer.println("<script>alert('수정되지 않았습니다 다시 시도해주세요'); history.back(-1); </script>");
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
