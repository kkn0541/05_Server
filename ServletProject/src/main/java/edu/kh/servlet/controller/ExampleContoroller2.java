package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//servlet 관련 코드를 작성하기 위해서는 httpservlet 클래스 상속 받아야 한다 
//상속 받았다고 해서 바로 servlet 등록이 되는 것은 아님 
//-> 1.web.xml작성하기 2.@webservlet() 어노테이션 사용 

/*어노테이션 : 컴파일러가 읽는 주석 
 * 
 * @Webservlet 어노테이션 
 * -> 해당 클래스를 Servlet으로 등록하고 
 * 	  매핑할 주소를 연결하라고 지시하는 어노테이션 
 * 
 * 
 * ->서버 실행 시 자동으로 web.xml에 
 * <servlet>,<servlet-mapping>을 작성하는 효과 
 * 
 * 
 * 
 * 
 * */

@WebServlet("/signUp")
public class ExampleContoroller2 extends HttpServlet {

	// post 요청 처리 메서드 오버라이딩

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//원래 TOMCAT9 버전떄는
		//전달받은 값을 얻어와서 확인 -> 한글이 깨지는 문제 발생!
		//해결방법 : 전달받은 데이터의 문자인코딩을 서버에 맞게 변경 
		
		//req.setCharacterEncoding("UTF-8");
		//-> TOMCAT 10 버전 이상부터 자동으로 인코딩 처리를 해주기때문에 
		//개발자가 직접 추가적인 처리 할 필요 X 
		
		
		String inputId=req.getParameter("inputId");
		String inputPw=req.getParameter("inputPw");
		String inputName=req.getParameter("inputName");
		String intro=req.getParameter("intro");
		
		System.out.println(inputId);
		System.out.println(inputPw);
		System.out.println(inputName);
		System.out.println(intro);
		
		
		//응답화면 만들기 
		// ->Java에서 응답화면을 작성하기 번거롭고 힘들다
		// 누가 이것좀 대신 만들ㅇ줘
		//-> jsp 가 대 신 화면을 만들어달라! (Servlet이 jsp에게 요청을 위임)
		
		//jsp가 대신 응답화면을 만들어 주기위해서는
		// servlet 이 어떤 요청을 받았는지 알아야 한다. (req , resp)
		//dispatcher가 위임할때 사용하는 심부름꾼
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/result.jsp");
		
		//Web-inf 폴더에 있는 파일들은 직접적으로 클라이언트가 접근할 수 없으며
		//서블릿을 통해서만 접근 가능 
		
		//진짜 위임 코드(실세)
		
		
		dispatcher.forward(req, resp);
		//requestDispatcher 객체를 사용하여 현재요청(req)와 응답(resp)을
		// 지정한 jsp 페이지(result.jsp)로 전달하는 작접
		// -> 즉, 현재 서블릿에서 처리하던 요청을 result.jsp전달하고 
		//제어권을 그곳으로 넘김(== 위임하다)
		
		
	}

}
