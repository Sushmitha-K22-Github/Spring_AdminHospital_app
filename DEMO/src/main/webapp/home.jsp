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
<c:when test="${ a!=null}">
<h2><a href="viewUser.jsp">view Admin</a></h2>
<h2><a href="updateUser.jsp">Update admin</a></h2>
<h2><a href="delete?id=${u.getId() }">Delete admin</a></h2>
</c:when>
</c:choose>
</body>
</html>