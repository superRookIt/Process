package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BDao.Bdao;
import com.javalec.ex.BDto.BDto;

public class BModifycommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int bId = Integer.parseInt(request.getParameter("bId"));

		Bdao dao = new Bdao();

		BDto dto = dao.modify(bId);

		request.setAttribute("modify", dto);

	}

}
