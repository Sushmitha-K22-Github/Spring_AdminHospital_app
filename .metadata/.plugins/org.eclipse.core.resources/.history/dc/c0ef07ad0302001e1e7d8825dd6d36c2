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
			<form action="updatehospital" method="post">
				<input type="hidden" name="id" value="${h.getId() }"> Name<input
					type="text" name="name" value="${h.getName() }">
					 Phone<input type="tel" name="phone" value="${h.getPhone() }"> 
					GST<input type="text" name="gst" value="${h.getGst() }">
					 Founder<input type="text" name="founder" value="${h.getFounder() }">
					Yof<input type="number" name="yof" value="${h.getYof() }">
					<input
					type="submit" value="Update">
			</form>
		</c:when>
		<c:otherwise>
			<%
			response.sendRedirect("loginhospital.jsp");
			%>
		</c:otherwise>
	</c:choose>

</body>
</html>