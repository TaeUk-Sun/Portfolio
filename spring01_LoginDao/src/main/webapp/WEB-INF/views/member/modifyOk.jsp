<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> MEMBER MODIFY OK </h1>
	
	<%--
	<h3> Before Modify </h3>
	${memBef}
	ID : ${memBef.memId} <br />
	PW : ${memBef.memPw} <br />
	Mail : ${memBef.memMail} <br />
	--%>
	<h3> After Modify </h3>
	ID : ${memAft.memId} <br />
	PW : ${memAft.memPw} <br />
	Mail : ${memAft.memMail} <br />
	
	<P>  The time on the server is ${serverTime}. </P>
	
	<a href="${cp}/"> MAIN </a>
</body>
</html>