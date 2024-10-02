<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet /jsp 범위별 내장 객체</title>
</head>
<body>

	<h1>Servlet /jsp 범위별 내장 객체</h1>

	<pre>
 Servlet/jsp 에는 4종료 범위를 나타낸 내장객체가 존자한다. 
 ->각 종류마다 영향을 끼치는 범위가 달라짐 
 
 <h3>1. page: 현재페이지</h3>
 -> 현재 jsp 에서만 사용가능한 객체 (servlet x)

<h3>2.request(요청)==HttpServletRequest</h3>
-> 요청받은 페이지(servlet /jsp)와
위임받은 페이지(servlet/jsp)에서 유지되는 객체 

<h3>3. session (입회, 접속)</h3>
  -session : 서버에 접속한 클라이언트를 나타내거나 , 
  			관련 정보를 get/set/ 할수 있는 객체 
  			(session 객체는 서버에서 관리함) 
  			
  	-[중요!] session은 브라우저 마다 하나씩 생성된다
  	
  	-[유지 범위]
  	
  	사이트 접속할때부터  ~ 브라우저 종료될때까지  혹은 세션을 억지로 만료시킬떄까지 
  	
  	-session이 유지되는 상태에서는 
  	아무곳에서나 가져다가 사용할수 있다.  ex)로그인
  	
<h3>4. application 라는 이름이 아니라 (ServletCotext로 만들어야함)</h3>
  	-하나의 웹 애플리케이션 마다 1개만 생성되는 객체 
  	(Server를 키면 1개만 생성되는 객체 )
  	
  	-application 객체는 어디서든 사용 가능 
  	[유지범위]
  	서버 실행 부터 ~ 서버가 종료되는 시점까지 유지됨  	
  	
  	<h3>내장 객체의 우선 순위 : page > request > session > application </h3>
  	
 
</pre>

	<hr>
	<hr>

	<h3>범위별 객체에 세팅된 값(속성) 얻어오기</h3>

	<pre>
 - 제출된 파라미터 얻어오는 EL : \${param.key }


 - 범위별 객체에 세팅된 값 얻어오는 EL 
 1) \${000Scope.key} ex) \${requestScope.key} 
 2) \${key}
  -> 좁은 범위 객체부터 탐색하여
  	 일치하는 key가 있으면 얻어옴 

</pre>
	<%
	//page scope 객체에 값 세팅 
	pageContext.setAttribute("pageValue", "page scope 객체에 세팅한 값");
	%>

	<ul>
		<li>page scope : ${pageValue}</li>
		<li>request scope : ${requestValue}</li>
		<li>session scope : ${sessionScope}</li>
		<li>application scope :${applicationValue}</li>

	</ul>
	<a href="/el/check">객체 범위 확인페이지로 이동</a>

	<hr>

	<h1>범위별 객체 우선순위 확인</h1>
	
	<%
	  pageContext.setAttribute("menu", "짬짜면(page)");
	
	%>
	
	<h3> menu :${menu}</h3>
	
	<h3>원하는 scope의 세팅된 값 얻어오기 </h3>
	
	<ul>
		<li>pageScope.menu:${pageScope.menu }</li>
		<li>requestScope.menu:${requestScope.menu }</li>
		<li>sessionScope.menu:${sessionScope.menu }</li>
		<li>applicationScope.menu:${applicationScope.menu }</li>
	</ul>
	
</body>
</html>