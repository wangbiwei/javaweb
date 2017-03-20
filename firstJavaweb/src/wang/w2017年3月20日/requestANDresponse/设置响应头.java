/**
 * @todo TODO
 */
package wang.w2017年3月20日.requestANDresponse;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月20日
 *
 * @tags 
 */
public class 设置响应头 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	/*
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("访问了doGet方法");
		/** setHeader方法 */
		resp.setHeader("xxx", "Imwang");
		
		/** addHeader方法 */
		resp.addHeader("xxx1", "Imwang1");
		resp.addHeader("xxx1", "Imwang2");
		resp.addHeader("xxx1", "Imwang3");
		
		/** setIntHeader方法 */
		resp.setIntHeader("size", 1000);
		
		/** setDateHeader方法 */
		resp.setDateHeader("xxx2", 1000 * 60);// 一分钟，
		
		/** 设置Refresh头 */
		// resp.setHeader("Refresh", "5;URL=http://www.baidu.com");// 5秒钟跳转网址
		
		/** 设置不缓存 */
		resp.setHeader("Cache-Control", "no-cache");
		resp.setHeader("pragma", "no-cache");
		resp.setDateHeader("expires", -1);
		
		/** 设置关键字（供搜索引擎搜索） */
		resp.addHeader("keywords", "servlet");
		resp.addHeader("keywords", "javaweb");
	}
}
