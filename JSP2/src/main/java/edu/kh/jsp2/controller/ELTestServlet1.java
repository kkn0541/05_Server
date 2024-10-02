package edu.kh.jsp2.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



// 주소 맨앞에 '/' 꼭 잇어야함
// ->서블릿 매핑에서 유효하지 않은 <url-pattren>[ [el/test1] 오류 발생 
@WebServlet("/el/test1")
public class ELTestServlet1 extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//요청처리 
		
	//===========================바로 응답처리로 넘어감	
		//응답처리 
	
		//->원래는 java에서 out.writer("<html>")써야 하는데 
		// 너무 번거롭다 
		//->jsp한테 응답화면을 만들어 출력하라고 
		// 떠넘기기 (==요청위임(forward)
		
		//1) jsp가 어디있는지 경로 먼저 작성 (webapp 폴더 기준)
		String path = "/WEB-INF/views/el/test1.jsp";
		
		//2) 지정된 경로로 요청을 넘겨울 요청 발송자(RequestDispatcher)객체 생성 
		
		RequestDispatcher dispacher =req.getRequestDispatcher(path);
		
		//3) 요청 위임
		dispacher.forward(req, resp);
		
		
		
	}
}
