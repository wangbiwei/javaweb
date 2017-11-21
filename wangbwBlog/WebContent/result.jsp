<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.util.Enumeration" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
</head>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<%
		out.print("<br />Got beer brands:");
		List<String> styles = (List<String>)request.getAttribute("styles");
		for(String str: styles){
			out.print("<br>"+ str);
		}
		out.print("<br />取得的Servlet配置参数：");
		out.println(request.getAttribute("name"));
		out.println(request.getAttribute("age"));
		out.println("初始化的参数有：");
		Enumeration<String> paramNames = (Enumeration<String>)request.getAttribute("paramNames");
		while(paramNames.hasMoreElements()){
			out.println(paramNames.nextElement());
		}
	%>
</body>
</html>