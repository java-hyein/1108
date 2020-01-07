package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BcontentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 내용을 보여주려면 뭘 해야 할까? 
		//url 로 넘어올때는 getParameter
		String bId = request.getParameter("bId");
		BDao dao = new BDao();
		// 게시판에서의 한개의 row 
		BDto dto = dao.contentView(bId);
		//dao.upHit(bId);
		//리퀘스트 객체에 넣어주기 
		request.setAttribute("content_view", dto);
	}

}
