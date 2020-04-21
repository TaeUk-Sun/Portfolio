<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>MAIN</h1>
	
	<c:if test="${empty member}">
		<a href="${cp}/member/joinForm">JOIN</a> &nbsp;&nbsp; 
		<a href="${cp}/member/loginForm">LOGIN</a> &nbsp;&nbsp; 
	</c:if>
	
	<c:if test="${!empty member}">
		<a href="${cp}/member/modifyForm">MODIFY</a> &nbsp;&nbsp; 
		<a href="${cp}/member/logout">LOGOUT</a> &nbsp;&nbsp;
		<a href="${cp}/member/removeForm">REMOVE</a> &nbsp;&nbsp; 
	</c:if>


</body>
</html>
