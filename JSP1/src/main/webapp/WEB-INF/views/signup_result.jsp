<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	
	
 아이디  :${param.userId}
 비밀번호 : :${param.userPw}
 비밀번호확인 :${param.userPw2}
 이름 :${param.userName}
 나이 :${param.userId}
 
 <c:if test="${param.userPw == param.userPw2 }">
 <h1>회원가입성공</h1>
 </c:if>
 
 
 
 <c:if test="${param.userPw != param.userPw2 }">
 <h1>회원가입실패</h1>
 </c:if>
 
 
</body>
</html>