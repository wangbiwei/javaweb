<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();//获取项目名

//获取URL
String basePath = request.getScheme() + "://"
		+ request.getServerName()  + ":" + request.getServerPort() + path +"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int i = 0;//方法内可以写什么，这个就可以写什么。
%>
<br />
<%=basePath %>

<%!
private int i = 0;
public void show(){
	System.out.print(i);
}
%>


</body>
</html>