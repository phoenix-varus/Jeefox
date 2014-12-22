<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body>
	<h1>Hello!!!</h1>
	<br></br>
	<s:iterator id="user" value="#session.user"></s:iterator>
	<h3>
		<font color="green">UserName:${user.name}</font>
	</h3>
	<s:debug></s:debug>
</body>
</html>