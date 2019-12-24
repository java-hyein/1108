package edu.bit.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//리스트를 뽑아온다 
		//이 부분 암기 
		BDao dao = new BDao(); //dao 객체 생성
		ArrayList<BDto> dtos = dao.list();
		//dopost에서 받아온 request, 리스트라는 이름으로 dtos를 보낸다
		request.setAttribute("list", dtos);
	}

}
