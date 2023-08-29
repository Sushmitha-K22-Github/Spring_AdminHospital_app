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
<h2><a href="viewHospital.jsp">view Hospital</a></h2>
<h2><a href="updateHospital.jsp">Update Hospital</a></h2>
<h2><a href="delete?id=${h.getId() }">Delete Hospital</a></h2>
</c:when>
</c:choose>
</body>
</html>