package edu.bit.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormEx() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		String path = getServletContext().getInitParameter("path");
		
//		String id = getInitParameter("id");
//		String pw = getInitParameter("pw");
//		String path = getInitParameter("path");
		
		///////////////////////////////////////////////////
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + pw + "<br/>");
		writer.println("path : " + path + "<br/>");
		writer.println("</body></html>");
	}

	// submit 하게 되면 request로 들어온다. 여기서는 꺼내는 행위를 함
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		req.setCharacterEncoding("EUC-KR");

		String id = req.getParameter("id"); // formex.html 에서 name = "id" 속성 값
		String pw = req.getParameter("pw");
		String[] hobby = req.getParameterValues("hobby"); // 여러개는 배열로 받아온다.
		String major = req.getParameter("major");
		String protocol = req.getParameter("protocol");

		///////////////////////////////////////////////////
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + pw + "<br/>");
		writer.println("취미 : " + Arrays.toString(hobby) + "<br/>");
		writer.println("전공 : " + major + "<br/>");
		writer.println("프로토콜 : " + protocol + "<br/>");
		writer.println("</body></html>");
	}

}
