<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- jsp 에서는 req 를 request라고 부름  -->
<title><%= request.getParameter("orderer") %>님의 주문결과 </title>
</head>
<body>
<H1>주문자명 <%= request.getParameter("orderer") %>님</H1>

<h3>주문한 커피
	<%if(request.getParameter("type").equals("ice")){ %>
		차가운 
		<%}else { %>
		따뜻한
	
	<%} %>
	<%= request.getParameter("coffee") %>
	</h3>
		<%if(request.getParameterValues("opt") !=null){ %>
		
		<ul>
		<!-- request.getParameterValues("opt") 는 배열 -->
			<%for(String opt : request.getParameterValues("opt")){ %>
			<%} %>
		</ul>
		
		
	
	<%} %>
	<%= request.getParameter("coffee") %>
	
</body>
</html>