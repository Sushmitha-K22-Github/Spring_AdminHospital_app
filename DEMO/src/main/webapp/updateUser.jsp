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
			<form action="update" method="post">
				<input type="hidden" name="id" value="${a.getId() }"> Name<input
					type="text" name="name" value="${a.getName() }">
					 Phone<input type="tel" name="phone" value="${a.getPhone() }"> 
					 Password<input
					type="password" name="password" value="${a.getPhone() }"> 
					Email<input type="email" name="email" value="${a.getEmail() }"> 
					<input
					type="submit" value="Update">
			</form>
		</c:when>
		<c:otherwise>
			<%
			response.sendRedirect("login.jsp");
			%>
		</c:otherwise>
	</c:choose>
</body>
</html>