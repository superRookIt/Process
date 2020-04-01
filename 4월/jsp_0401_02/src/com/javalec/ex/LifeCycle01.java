package com.javalec.ex;

import java.io.IOException;

import javax.annotation.PostConstruct; //
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle01
 */

@WebServlet("/LC1")
public class LifeCycle01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("init() 메소드가 최초 1번 호출됨");
		System.out.println("객체 생성시 바로 실행되어야 할 명령어는 여기에 구현");
	}

	@Override
	public void destroy() {
		System.out.println("destory() 메소드가 최초 1번 호출됨");
		System.out.println("객체 종료시 바로 실행되어야 할 명령어는 여기에 구현");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet() 메소드 요청시마다 실행");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@PostConstruct
	private void initPost() { // 메소드 이름은 아무렇게나 해도 됨
		System.out.println("선처리 실행");
		System.out.println("init()메소드 보다 먼저 실행");
	}

	@PreDestroy
	private void destroyPre() { // 메소드 이름은 아무렇게나 해도 됨
		System.out.println("후처리 실행");
		System.out.println("destory()메소드 보다 나중에 실행");
	}

}
