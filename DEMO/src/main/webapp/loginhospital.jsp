<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${msg }</h1>
<form action="loginhospital" method="post">
Phone:<input type="tel" name="phone"><br>
Password:<input type="password" name="password"><br>
<input type="submit" value="login">
</form>
<h1><a href="registerhospital.jsp">click here to register</a></h1>
</body>
</html>