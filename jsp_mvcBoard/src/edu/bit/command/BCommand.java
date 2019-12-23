package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//자손이 구현하라!
public interface BCommand {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
