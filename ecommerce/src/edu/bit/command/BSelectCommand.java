package edu.bit.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BSelectCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BDao dao = new BDao(); //dao 객체 생성
		ArrayList<BDto> dtos = dao.select();
		//dopost에서 받아온 request, 리스트라는 이름으로 dtos를 보낸다
		request.setAttribute("select", dtos);
	}

}
