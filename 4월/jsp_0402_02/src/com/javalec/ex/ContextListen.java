package com.javalec.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*==================================================================================

                                                       리스너 클래스  

=====================================================================================*/

public class ContextListen implements ServletContextListener {

	public ContextListen() {

	}// 생성자

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("웹 어플리케이션이 처음 시작할때 실행이 됩니다.");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("웹 어플리케이션이 종료 될때 실행이 됩니다.");
	}

}
