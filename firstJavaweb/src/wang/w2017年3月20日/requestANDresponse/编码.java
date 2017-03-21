/**
 * @todo TODO
 */
package wang.w2017年3月20日.requestANDresponse;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月21日
 *
 * @tags 
 */
public class 编码 extends HttpServlet
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
		System.out.println("编码" + "doGet");
		/** 请求编码 */
		/**
		 * 客户端传递数据的编码 1. 在地址栏直接传的编码； 2. 在页面点击表单或链接
		 */
		if ("post".equalsIgnoreCase((req.getMethod())))
		{
			req.setCharacterEncoding("utf-8");// （post请求，设置了在取值。）
			System.out.println(req.getParameter("username"));
		}
		else
		{
			/** get请求 */
			String parameter = req.getParameter("username");
			System.out.println(parameter);
		}

		/** 响应编码 */
		/** 1.设置编码方式一 */
		// resp.setCharacterEncoding("utf-8");// 我们的输出流是用的utf-8编码的。
		resp.setHeader("Content-Type", "text/html;charset=utf-8");// 告诉浏览器我们用的是utf-8编码，并且我们的输出流也是utf-8，有这句，就不用上面那句
		/** 1.设置编码方式二 */
		// resp.setContentType("text/html;charset=utf-8");//(在调用getWriter之前，写这句，就不会乱码)
		PrintWriter writer = resp.getWriter();
		writer.print("中文");
	}
	
	/*
	 *
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req, resp);
	}
}
