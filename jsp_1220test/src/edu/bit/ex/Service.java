package edu.bit.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service {//자손이 구현하라 인터페이스
	// ArrayList<MemberDto> 를 리턴하는 execute
	public ArrayList<DTO> execute(HttpServletRequest request, HttpServletResponse response);
}
