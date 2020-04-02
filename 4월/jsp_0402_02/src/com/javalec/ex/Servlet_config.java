package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebInitParam;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.WSService.InitParams;

@WebServlet("/SC")
/*
@WebServlet(urlPatterns= {"/SC"},initParams ={@WebInitParam(name="id",value="admin"),@WebInitParam(name="pw",value="1234")})
*/
public class Servlet_config extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	private void postCon() {
		System.out.println("서블릿 최초 실행시 postCon()메소드 한번 실행 - init()보다 먼저 실행");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("서블릿 최초 실행시 init()메소드 한번 실행");
	}

	@Override
	public void destroy() {
		System.out.println("서블릿 종료시 destory()메소드 한번 실행");
	}
	
	@PreDestroy
     private void preDe() {
    	 System.out.println("서블릿 종료시 preDe()메소드 한번 실행 - destory()보다 나중에 실행");
     }
	
	public Servlet_config() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet()메소드 실행");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head></head>");
		writer.println("<body>");
		writer.println("<p>서블릿 생명주기 테스트</p>");
		writer.println("context-param 파라미터 : " + getServletContext().getInitParameter("id") + "<br>");
		writer.println("context-param 파라미터 : " + getServletContext().getInitParameter("pw"));

		/*
		 * writer.println("init파라미터 : " + getInitParameter("id"));
		 * writer.println("init파라미터 : " + getInitParameter("pw"));
		 */

		writer.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
