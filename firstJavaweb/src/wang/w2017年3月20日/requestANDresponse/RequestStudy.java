/**
 * @todo TODO
 */
package wang.w2017年3月20日.requestANDresponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
public class RequestStudy extends HttpServlet
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
		System.out.println("doGet");
		resp.setHeader("Content-Type", "text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		Enumeration<String> headerNames = req.getHeaderNames();
		/** 获得所有请求头的键值对 */
		while (headerNames.hasMoreElements())
		{
			String temp = headerNames.nextElement();
			writer.println(temp + ":" + req.getHeader(temp) + "<br />");
		}
		writer.println("<br />");
		/** 获取客户端IP地址 */
		writer.println("IP地址:" + req.getRemoteHost() + "<br />");
		/** 获取请求方式 */
		writer.println("请求方式:" + req.getMethod() + "<br />");
		/** 获取客户端的信息（操作系统，浏览器） */
		writer.println("客户端信息:" + req.getHeader("USER-AGENT") + "<br />");
		writer.println("<br />");
		
		/** 获取完整url */
		writer.println(
				req.getRequestURL() + (null == req.getQueryString() ? "" : "?" + req.getQueryString()) + "<br />");
		/** 【获取项目名称】 */
		writer.print("【项目名称】:" + req.getContextPath() + "<br />");
	}
}
