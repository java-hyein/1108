package edu.bit.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontCon
 */
/* 확장자 패턴을 이용하여 *.do로 오는 모든 요청을 한곳에서 다 관리한다. ==> FrontController 패턴*/
@WebServlet("*.do")
public class FrontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FrontCon() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		actionDo(request, response);

	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//유저가 어떤거 타고 들어왔는지 구분자
		System.out.println("actionDo");
		// uri,conPath,command 를 빼온다
		String uri = request.getRequestURI();
		System.out.println("uri = " + uri);

		String conPath = request.getContextPath();
		System.out.println("conPath = " + conPath);
		
		//command = uri - contextPath 길이만큼 빼면 요청한 파일 이름만 남는다.
		String command = uri.substring(conPath.length());
		System.out.println("command = " + command);
		
		// 유저가 인설트 점 두로 들어오면 인서트를 출력한다.
		// 데이터를 데이터 베이스로 넣기 위한 로직을 작성한다.
		if (command.equals("/insert.do")) {
			System.out.println("insert");
			System.out.println("=========================");
		} else if (command.equals("/update.do")) {
			System.out.println("update");
			System.out.println("=========================");
		} else if (command.equals("/select.do")) {
			System.out.println("select");
			System.out.println("=========================");
		} else if (command.equals("/delete.do")) {
			System.out.println("delete");
			System.out.println("=========================");
		}else if(command.equals("/membersAll.do")) {
			response.setContentType("text/html; charset=EUC-KR");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			
			//명령을 내린다 라는 말!
			//서비스라는 객체를 둬서 거기다가 맏긴다.
			Service service = new MembersAllService();
			ArrayList<MemberDto> dtos = service.execute(request, response);
			
			for (int i = 0; i < dtos.size(); i++) {
				MemberDto dto = dtos.get(i);
				String id = dto.getId();
				String pw = dto.getPw();
				String name = dto.getName();
				
				writer.println(id+","+pw+","+name+"<hr><br>");
			}
			writer.println("</body></html>");
			
		}
	}
}
