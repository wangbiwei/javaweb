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
public class 重定向 extends HttpServlet
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
		
		/** 方法1 */
		// /** 设置302状态码，并设置响应头Location */
		// resp.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
		// // 请求URL = /项目名 + Servlet路径
		// resp.setHeader("Location", "http://www.baidu.com");
		
		/** 方法2 */
		resp.sendRedirect(req.getContextPath() + "/request");
	}
}
