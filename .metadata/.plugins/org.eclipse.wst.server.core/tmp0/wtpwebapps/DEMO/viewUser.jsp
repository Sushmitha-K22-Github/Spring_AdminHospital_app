<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${a!=null }">
<h1>ID:${a.getId()}</h1>
<h1>Name:${a.getName()}</h1>
<h1>Phone Number:${a.getPhone()}</h1>
</c:when>
<c:otherwise>
<%response.sendRedirect("login.jsp") ;%>
</c:otherwise>
</c:choose>
</body>
</html>