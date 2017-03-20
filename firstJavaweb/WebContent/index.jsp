<%@page pageEncoding="utf-8"%>
<html>
	<head><title>helloHtml</title></head>
	<body style="background-color:green">
		${header['User-Agent']}
		<br />
		
		<a href="/firstJavaweb/request?name=Imwang&age=24" >跳入request</a><br />
		
		<form action="/firstJavaweb/request" method="post">
		用户名：<input type="text" name="username"/> <br />
		密码：<input type="password" name="password"/> <br />
		年龄：<input type="text" name="age"/> <br />
		爱好：
		<input type="checkbox" name="aihao" value="zc" />找钱
		<input type="checkbox" name="aihao" value="ljs" />练技术
		<input type="checkbox" name="aihao" value="xlc" />学理财 <br />
		<input type="submit" value="提交"> &nbsp; <input type="reset" value="取消">
		</form>
	</body>
</html>