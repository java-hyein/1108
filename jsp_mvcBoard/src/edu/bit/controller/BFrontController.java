package edu.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.command.BCommand;
import edu.bit.command.BListCommand;
import edu.bit.command.BWriteCommand;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request,response); //리퀘스트와 리스펀스를 그대로 넘기기 때문에 함수를 복붙할 수 있다.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		
		request.setCharacterEncoding("EUC-KR"); // 한글처리
		
		String viewPage = null;
		BCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath(); // 패키지 명 
		String com = uri.substring(conPath.length());
		
		System.out.println("테스트 uri : "+ uri + ", conPath :" + conPath + ", com :"+ com);
		
		if(com.equals("/write_view.do")) {
			
			viewPage = "write_view.jsp";
			
		}else if (com.equals("/write.do")) {
			// 다형성 같은 이름으로 다른기능
			command = new BWriteCommand(); // 요청을 받아오는 부분
			command.execute(request, response);
			
			viewPage = "list.do";
			
		}else if (com.equals("/list.do")) {
			
			command = new BListCommand();
			command.execute(request, response);
			
			viewPage = "list.jsp";
		}
		// 받은 요청을 유저에게 보여준다.
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request,response);
		
	}

}
