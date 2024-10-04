package edu.kh.jsp2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jsp2.dto.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/book/list")
public class BookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		//요청 처리 
		//Book으로 타입이 제한된 List 생성 
		List<Book> bookList = new ArrayList<Book>();
		
		//bookList에 데이터 추가 
		bookList.add(new Book("자바공부","둘리",10000));
		bookList.add(new Book("html공부","홍길동",12000));
		bookList.add(new Book("js","이순신",20000));
		bookList.add(new Book("서블릿","고길동",15000));
		bookList.add(new Book("데이터베이스","훈이",16000));
		bookList.add(new Book("jsp","박철수",800000));
		bookList.add(new Book("spring","권권권",58000));
		
		//bookList를 요청 위임된 jsp에서도 
		// 유지되어 사용할수 있도록 
		// request scope 객체를 속성으로 추가 (세팅 set.attribute)
		
		req.setAttribute("bookList", bookList);
		
		
		
		String path="/WEB-INF/views/book/bookList.jsp";
		
		//바로 불러서  위임( 코드 짧게)
		req.getRequestDispatcher(path).forward(req, resp);
		
		
		//응답 처리 
		
		//jsp로 요청 위임 (webapp 폴더 기준)
		
		
		
		
		
		
		
	
	
	}

}
