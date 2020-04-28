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
import com.javalec.ex.BCommand.BDeletecommand;
import com.javalec.ex.BCommand.BListcommand;
import com.javalec.ex.BCommand.BModifyOkcommand;
import com.javalec.ex.BCommand.BModifycommand;
import com.javalec.ex.BCommand.BReplyOkcommand;
import com.javalec.ex.BCommand.BReplycommand;
import com.javalec.ex.BCommand.BWritecommand;

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

		request.setCharacterEncoding("utf-8");

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

		else if (com.equals("/write_view.do")) {

			pageview = "write_view.jsp";

		} // 리스트에서

		else if (com.equals("/write.do")) {

			bcom = new BWritecommand();
			bcom.execute(request, response);
			pageview = "list.do";

		} 

		else if (com.equals("/delete.do")) {

			bcom = new BDeletecommand();
			bcom.execute(request, response);
			pageview = "list.do";

		}

		else if (com.equals("/modify.do")) {

			bcom = new BModifycommand();
			bcom.execute(request, response);
			pageview = "modify_view.jsp";

		}

		else if (com.equals("/modify_ok.do")) {

			bcom = new BModifyOkcommand();
			bcom.execute(request, response);
			pageview = "list.do";

		}
		
		else if (com.equals("/reply.do")) {

			bcom = new BReplycommand();
			bcom.execute(request, response);
			pageview = "reply_view.jsp";

		}
		
		else if (com.equals("/reply_ok.do")) {

			bcom = new BReplyOkcommand();
			bcom.execute(request, response);
			pageview = "list.do";

		}
		
		

		// forward
		RequestDispatcher dispatch = request.getRequestDispatcher(pageview);
		dispatch.forward(request, response);

	}

}
