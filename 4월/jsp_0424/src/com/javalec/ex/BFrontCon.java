package com.javalec.ex;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do") // ★

public class BFrontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BFrontCon() {
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
		// 페이지 이동에 사용하는 변수

		String viewPage = null;

		System.out.println("actionDo 들어옴");
		request.setCharacterEncoding("utf-8");

		// url = http://localhost:8181/jsp_0424/insert

		// uri = /jsp_0424/insert

		// contextPath = jsp_0424

		String uri = request.getRequestURI();
		System.out.println(uri);

		String conPath = request.getContextPath();
		System.out.println(conPath);
		
		String com = uri.substring(conPath.length());
		// file명 = /insert
		System.out.println(com);

		if (com.equals("/insert.do")) {
			System.out.println("insert 페이지를 요청하였습니다.");
			// insert.jsp로 forwarding
			// dao 메소드 호출해서 값을 받아서 request.setAttribute
			request.setAttribute("insert_uri",uri);
			request.setAttribute("insert_conPath",conPath);
			request.setAttribute("insert_com",com);
			viewPage = "insert.jsp";
			
			
			
		} else if (com.equals("/update.do")) {
			System.out.println("update 페이지를 요청하였습니다.");
			request.setAttribute("update_uri",uri);
			request.setAttribute("update_conPath",conPath);
			request.setAttribute("update_com",com);
			// update.jsp로 forwarding
			viewPage = "update.jsp";
			
			
			
			
			
			
			
		} else if (com.equals("/select.do")) {
			
			
			
			
			
			
			System.out.println("select 페이지를 요청하였습니다.");
			
			ArrayList<MemberDto> list = new ArrayList<MemberDto>();
			MemberDao mdao = MemberDao.getinstance();
			list=mdao.getMembers();
			
			request.setAttribute("dtos",list);
			request.setAttribute("select_address",com);
			// select.jsp로 forwarding
			
			
			request.setAttribute("select_uri",uri);
			request.setAttribute("select_conPath",conPath);
			
			
			
			viewPage = "select.jsp";
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} else if (com.equals("/delete.do")) {
			System.out.println("delete 페이지를 요청하였습니다.");
			request.setAttribute("delete_uri",uri);
			request.setAttribute("delete_conPath",conPath);
			request.setAttribute("delete_com",com);
			// delete.jsp로 forwarding
			viewPage = "delete.jsp";
		}
		
		
		
		

		
		RequestDispatcher dispatch =  request.getRequestDispatcher(viewPage);
		dispatch.forward(request, response);
		
		
		
		
	}

}
