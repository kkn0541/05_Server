package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// 1 .  extends HttpServlet
//2)   @WebServlet("/el_jtsl")


@WebServlet("/el_jstl")
public class ElJstlServlet extends HttpServlet {

	//GET방식 요청시 
	//지정된 JSP로 바로 요청 위임
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//요청 바로 위임하는 방법
	
		// 1) JSP 경로(Wepapp 폴더 기준)
			String path ="/WEB-INF/views/el_jstl.jsp";
		
		// 2) 요청 발송자 얻어오기 
		// 요청발송자는  RequestDispatcher 를 의미한다
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			
		// 3) 요청 위임(forword)
			dispatcher.forward(req, resp);
				
		
	}
	
}
