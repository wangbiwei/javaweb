$(window).load(load1());

/**
ajax 访问json文件
*/
function load1(){
	$(document).ready(function() {
   		$.ajax({
			//请求方式；
			type:"get",
			//json文件；
			url:"网站/目标网址.json",
			//返回数据类型；
			dataType:"json",
			//回调方法；
			success:function(data){
				
				var show = $("#显示内容");  
            	var strHtml = "";//存储数据的变量  
            	show.empty();//清空内容  
				$.each(data,function(infoIndex, info){
					strHtml += '<div id="' + info.类别 + '"><button onclick="伸缩(this)"><H3>' + info.类别 + "</H3></button>";
					var this1 = sort(info["vaule"]);
					$.each(this1,function(infoIndex){
					  strHtml += '<dt class="click"><A onclick="点击链接()" HREF="' + this["href"] + '" LAST_CHARSET="UTF-8">' + this["name"] + "</A></dt>";
					  strHtml += "<dd>" + this["description"] + "</dd>";
/*					  strHtml += "<dd>" + this["访问次数"] + "</dd>";*/
					  strHtml += "<br /><hr />";
						});
						strHtml += "</div>";
					});
				show.html(strHtml);//显示处理后的数据     
			}
		});
		load();
	});
}

function sort(data){
	var temp;
	for(var i = 0; i < data.length -1; i++){
		for(var j = 0; j < data.length -i - 1; j++){
			if(data[j].访问次数 < data[j+1].访问次数){
				temp = data[j];
				data[j] = data[j + 1];
				data[j + 1] = temp;
				}
			}
		}
	return data;
	}
	

function 伸缩(id){//点击div伸展或收缩下面的标签。
	$(id).nextAll().toggle("1000");
	$(id).parent().siblings().hide();
	$("#当前目标").hide();
	isHideAll();
}

function load(){//加载时隐藏所有的标签
$(document).ready(function(e) {
	$("div").show();
    $("dt").hide();	
	$("dd").hide();
	$("hr").hide();
	$("br").hide();
	$("#scrollto").hide();
	$("#hideAll").hide();
	
});
	
}

/*function 伸缩1(){//传过来父标签但是不行；
	$(id).parent().find("dt").toggle("100");
	
	}
*/	

function isHideAll(){//隐藏所有链接 函数
	if($("dt").is(':visible')){
		$("#hideAll").show("slow");
		}
		
	else{
		$("#hideAll").hide("slow");
		}
	}

function returnTop(){//点击回到顶部函数
	var speed=200;//滑动的速度
    $('body,html').animate({ scrollTop: 0 }, speed);
    return false;
	}