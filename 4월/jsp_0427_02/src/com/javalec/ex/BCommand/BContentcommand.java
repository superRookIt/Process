package com.javalec.ex.BCommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BDao.Bdao;
import com.javalec.ex.BDto.BDto;

public class BContentcommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		//객체선언 후 메소드 호출
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		Bdao dao = new Bdao();
		BDto dto = dao.contentView(bId);
		request.setAttribute("content_view", dto);

	}

}
