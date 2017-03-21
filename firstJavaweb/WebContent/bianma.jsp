<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编码</title>
</head>
<body>
	<form action="/firstJavaweb/bianma" method="post">
		用户名：<input type="text" name="username" value="李四"/>
		<input type="submit" value="提交"/>
	</form>
	<br />
	<br />
	<br />
	<a href="/firstJavaweb/bianma?username=张三">Get</a>
</body>
</html>