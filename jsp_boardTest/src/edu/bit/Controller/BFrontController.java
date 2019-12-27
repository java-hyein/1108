package edu.bit.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.Command.BCommand;
import edu.bit.Command.BContentCommand;
import edu.bit.Command.BDeleteCommand;
import edu.bit.Command.BListCommand;
import edu.bit.Command.BModifyCommand;
import edu.bit.Command.BWriteCommand;

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
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		
		request.setCharacterEncoding("EUC-KR"); // 한글처리
		
		String viewPage = null;
		BCommand command = null; // command - 일을 시킨다 
		
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
			
		}else if (com.equals("/content_view.do")) {
			
			command = new BContentCommand();
			command.execute(request, response);
			
			viewPage = "content_view.jsp";
			
		}else if (com.equals("/modify.do")) {
			
			command = new BModifyCommand();
			command.execute(request, response);
			
			viewPage = "list.do";
			
		}else if (com.equals("/delete.do")) {
			
			command = new BDeleteCommand();
			command.execute(request, response);
			
			viewPage = "list.do";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request,response);
		
	}

}
