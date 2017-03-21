/**
 * @todo TODO
 */
package wang.w2017年3月20日.requestANDresponse;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
public class 请求转发 extends HttpServlet
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
		System.out.println("请求转发" + "doGet");
		
		/** 请求转发或者包含，只有一个请求 */
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");// Servlet路径
		/** 请求转发 */
		/** 留头不留体 */
		/**
		 * forward应当在向客户端作出响应消息之前调用（在响应消息体输出被刷新之前）。如果响应消息已经作出，本方法将抛出一个IllegalStateException异常。尚在响应缓存中的没有完成的输出将会在
		 * forward之前被自动清除。就是说超过缓存的数据会自动的输出从而报异常。
		 */
		resp.setHeader("aa", "aaa");
		req.setAttribute("name", "请求转发的name");
		requestDispatcher.forward(req, resp);
		
		/** 请求包含 */
		/** 留头又留体 */
		// resp.setHeader("aa", "aaa");
		// resp.setHeader("Content-Type", "text/html; charset=UTF-8");
		// resp.getWriter().print("请求包含");
		// requestDispatcher.include(req, resp);
		
	}
}
