<%@page pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>王必伟的福利导航</title>

<base target="_blank" /><!--所有的链接都在新标签页中打开-->
<link rel="shortcut icon"  href="网站/image/sexy girl.ico" /><!--标签页图标-->

<script src="网站/js/jquery-3.0.0.min.js"></script>
<link rel="stylesheet" href="网站/css/Imwang.css" type="text/css" /><!--引入外来css-->
<script src="网站/js/ImwangH.js"></script>

<style type="text/css" >
/*
自定义的css；
<!--覆盖css-->
*/
	body{
		background:url(%E7%BD%91%E7%AB%99/image/bgImage.jpg)center,url(%E7%BD%91%E7%AB%99/image/bgImageRight.jpg) right,url(%E7%BD%91%E7%AB%99/image/bgImageLeft.jpg) left;	
		background-attachment:fixed;	
		background-size:auto;
		background-repeat:no-repeat;

	}
	
</style>

<script>
/*
自定义的JavaScript
*/

window.onscroll = function () {//将它单独放到就是文件中不行
    if (document.documentElement.scrollTop + document.body.scrollTop > 100) {
        $("#scrollto").show("slow");
    }
    else {
        $("#scrollto").hide("slow");
    }
}

</script>

</head>

<body>

<div id="scrollto" onclick="returnTop()"><img src="网站/image/rocket_top1.gif" title="返回顶部"  /></div>
<div id="hideAll" onclick="load()"><img  src="网站/image/reduce.ico" title="隐藏所有"  /></div>

<div id="显示内容">

</div>
</body>
</html>
