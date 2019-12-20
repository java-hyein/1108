package edu.bit.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MembersAllService implements Service{

	@Override
	public ArrayList<DTO> execute(HttpServletRequest request, HttpServletResponse response) {
		//인터페이스로 받고, DAO 객체를 생성해서 해당 함수를 갖고온다
						// 스테틱함수 .으로 호출
		DAO dao = DAO.getInstance();
				
		return dao.membersAll();
		
		
	}

}
