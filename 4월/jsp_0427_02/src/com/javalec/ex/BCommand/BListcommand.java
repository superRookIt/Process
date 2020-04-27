package com.javalec.ex.BCommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BDao.Bdao;
import com.javalec.ex.BDto.BDto;

public class BListcommand implements BCommand { //BCommand를 상속받음

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		
		//객체선언 후 메소드 호출
		Bdao dao = new Bdao();
		ArrayList<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);
		
		
	}

}
