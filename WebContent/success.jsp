<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="kz.sayan.entity.*" 
    import="kz.sayan.service.LoginService"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

<jsp:useBean id="user" class="kz.sayan.entity.User" scope="request">
	<jsp:setProperty property="userName" name="user" value="Madec"/>
</jsp:useBean>
<h1>Welcome dear <jsp:getProperty property="userName" name="user"/> </h1>
</body>
</html>