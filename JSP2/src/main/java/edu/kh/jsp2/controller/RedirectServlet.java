package edu.kh.jsp2.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/fr/redirect")
public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//위임말고 다른 서블릿으로 재요청 
		
		
		//request scope 에 속성 추가
		req.setAttribute("str2", "제하하하하하하하");
		
		//재요청 (redirect) 
		
		//resp.sendRedirect("다시 요청할 servlet 주소 ");
		// -> 파일경로가 아닌 다시 요철할 servlet의 @webServlet()에 작성된 주소 작성해야함 
		//재요청(redirect)는 get 요청 
		resp.sendRedirect("/fr/result");
		//실려있던 값 모두 지워짐 
		
		
		//sesssion scope에 속성 추가 
		//재요청시 에는 session scope 이상 
		
		HttpSession session = req.getSession();
		session.setAttribute("sessionNum", 10000);
		
		
		
 
		
		
	}
}
