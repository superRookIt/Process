package com.javalang.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/F_ok") // 단축키 [맵핑]


public class Form_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Form_ok() {
		super();
		// 생성자
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// method="get" doGet실행, 주소로 바로 접근해도 실행 [void 메소드]
		System.out.println("doGet으로 실행됨");
		actionDo(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// method="post" doPost실행, [void 메소드]
		System.out.println("doPost으로 실행됨");
		actionDo(request,response);
	}

	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
