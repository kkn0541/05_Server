<%--
prifix : 접두사 (앞에 붙는 말/단어 )
만약 prefix="c" -> <c:if>
만약 prefix="fn" -> <fn:..>
 --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL /JSTL 사용법</title>
</head>
<body>


<h1>a 태그 get요청으로 응답받은 페이지</h1>
	
	<h1> EL( Expression Language ) : 표현언어</h1>
	
	<pre>
	
<%-- <%= %> --%>
	jsp에서 표현식을 
	간단하고 효율적으로 작성할수 있도록 고안된 언어 
	(jsp 내부에 기본 내장되어 있음! )
	
	- java 값을 html 형태로 쉽게 출력할수 있다. 
	
	- 기본작성법 : \${key} (실제로 사용할때는 백슬래시는 제거하고 사용)
	
	
	
	
	
	</pre>
	
	<h3>전달받은 파라미터를 출력하는 방법</h3>
	
	<p style="color: red;">
	 주소 뒤에 쿼리 스트링(?name=홍길동&age=20)
	 직접 작성해보면서 테스트 
	 
	</p>
	<h4> jsp 표현식</h4>
	
	<div>
		name: <%=request.getParameter("name") %>
		<br>
		age: <%= request.getParameter("age") %>
	</div>
	
	<h4>2. EL</h4>
	<%-- EL특징 : NULL, NullPointerException을 빈칸으로 처리  
		get이라는 단어 사용하지 않는다
		 
	
	--%>
		
	<div>
	<%--el에서 파라미럳를 얻어오는 방법 : ${pram .key --%>
		name :${param.name}
		<br>
		age :${param.age}
	</div>
	
	
	<hr>
	
	<pre>
	jsp에서 자주 사용되는 java 코드를
	(if, for, 변수 선언 ,string 관련 메서드)
	
	스트립틀릿이 아닌 html 태그 모양으로 작성할 수 있도록
	태그를 제공하는 라이브러리 </pre>
	
	[라이브러리 추가 방법 ]
	1. 필용한 라이브러리(.jar) 파일을 다운받기 
	2. 프로젝트 webapp/web-INF/lib 폴더에 
	다운받은 라이브러리 추가 (복사 붙여 넣기)
	3.jstl문법을 사용할 jsp파일 제일 위에 
	 tagLib추가 구문 작성 
	 </pre>
	 
	 <h3> jtsl c:if문 사용해보기</h3>
	 
	 <%
	 int age=Integer.parseInt(request.getParameter("age"));
	 if(age>20){
		 %>
	 
	 
	 <h3> 성인입니다 (jsp 스트립틀릿으로 출력)</h3>
	 
	
		 
	 <% } %>
	 
	 <c:if test="${param.age>20}">
	 	<h3>성인입니다 (jstl 사용)</h3>
	</c:if>
	 
	  <c:if test="${param.age <= 20}">
	 	<h3>성인 아닝ㅂ니다 (jstl 사용)</h3>
	</c:if>
	 
	 	
	
</body>
</html>