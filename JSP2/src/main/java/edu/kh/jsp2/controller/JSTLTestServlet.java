package edu.kh.jsp2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl/test")
public class JSTLTestServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//c:forEach 연습을 위한 List생성
		List<String> nameList = new ArrayList<String>();
		
		
		nameList.add("짱구1");
		nameList.add("짱구2");
		nameList.add("짱구3");
		nameList.add("짱구4");
		nameList.add("짱구5");
		nameList.add("짱구6");
		nameList.add("짱구7");
		nameList.add("짱구8");
		nameList.add("짱구9");
		nameList.add("짱구10");
		
		
		
		
	//webapp폴더 기준 
	String path="/WEB-INF/views/jstl/test.jsp";
	
	//request scope (현재 servlet -> 위임된 jsp까지 유지 
	// 객체에 속성으로 List를 세팅 
	
	req.setAttribute("nameList", nameList);
	
	
	
	//요청발송자 + 요청 위임 
	RequestDispatcher dispatcher = req.getRequestDispatcher(path);

	dispatcher.forward(req, resp);
	
	
	//한줄로 하면
	//req.getRequestDispatcher(path).forward(req, resp);
	
	}
}
