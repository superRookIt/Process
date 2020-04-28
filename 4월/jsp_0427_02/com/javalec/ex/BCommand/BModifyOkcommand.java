package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BDao.Bdao;

public class BModifyOkcommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		int bId = Integer.parseInt(request.getParameter("bId"));

		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");

		Bdao dao = new Bdao();

		int check = dao.modify_ok(bId, bTitle, bContent);

	}

}
