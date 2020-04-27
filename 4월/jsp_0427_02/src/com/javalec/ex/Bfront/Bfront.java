package com.javalec.ex.Bfront;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BContentcommand;
import com.javalec.ex.BCommand.BListcommand;

@WebServlet("*.do")

public class Bfront extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bfront() {

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

		System.out.println("actionDo 호출");

		String pageview = null;

		BCommand bcom = null;

		// 페이지 확인
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		if (com.equals("/list.do")) {

			// BListcommand 메소드 호출
			bcom = new BListcommand();
			bcom.execute(request, response);
			pageview = "list.jsp";

		}

		else if (com.equals("/content_view.do")) {

			bcom = new BContentcommand();
			bcom.execute(request, response);
			pageview = "content_view.jsp";

		}

		else if (com.equals("/write.do")) {

			bcom = new BWritecommand();
			bcom.execute(request, response);
			pageview = "list.do";

		}
		
		else if (com.equals("/write_view.do")) {
			pageview = "write_view.jsp";
		}
		
		
		
		
		
		
		
		
		

		// forward
		RequestDispatcher dispatch = request.getRequestDispatcher(pageview);
		dispatch.forward(request, response);

	}

}
