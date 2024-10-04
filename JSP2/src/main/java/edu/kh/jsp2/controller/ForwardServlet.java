package edu.kh.jsp2.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fr/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// req 안에 요청할때 보낸  파라미터2개(  forwardInput1 ,forwardInput2) 담겨있음 
		//   +str
	//위임
		
		//requestScope 에 값 세팅
		req.setAttribute("str", "안녕하세요");
		
		//jsp 파일경로 작성 (webapp 폴더 (의 하위니까 '/' 꼭있어야함) 기준)
	
		String path="/WEB-INF/views/fr/forward_result.jsp";
		
		//요청 발송자를 이용해서 req, resp 위임하기 	
		req.getRequestDispatcher(path).forward(req, resp);
		//req resp 를 같이 보내기때문에 forward_result.jsp에서 사용 가능 
	
	
	}
}
