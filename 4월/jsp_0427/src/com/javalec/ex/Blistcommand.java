package com.javalec.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Blistcommand implements Bcommand { // Bcommend거를 상속받음

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);

	}

}
