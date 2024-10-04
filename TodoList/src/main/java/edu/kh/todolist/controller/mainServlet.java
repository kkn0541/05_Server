package edu.kh.todolist.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.todolist.model.dto.Todo;
import edu.kh.todolist.model.service.TodoListService;
import edu.kh.todolist.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// "/main 요청을 매핑하여 처리하는 서블릿
@WebServlet("/main")
public class mainServlet extends HttpServlet {

	
	/*
	 * 
	 * 왜 "/main" 메인 페이지 요청을 처리하는 서블릿 만들었는가 
	 * 
	 * 
	 * -이유 : servlet에서 추가한 데이터를 
	 * 메인페이지에서 사용 할수 있도록 하려고 
	 * */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//클라이언튼 -> 서블릿이있는 controller -> service -> DAO -> DB/외부파일 
		                                                  //   <-
	//요청 처리 
		
		
		
	//응답 처리 
		
		try {
			//Service 객체 생성 
			TodoListService service = new TodoListServiceImpl();
			//인터페이스    =====상속 ======   구현 클래스
			
			//전체 할일 목록 servkce 호출해서 얻어오기 
			List<Todo> todoList = service.todoListFullView();
			
			// request scope 객체 값을 추가 
			req.setAttribute("todoList", todoList);
			
			//메인 페이지 응답을 담당하는 jsp 요청 위임 
			String path="/WEB-INF/views/main.jsp";
			
			req.getRequestDispatcher(path).forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
