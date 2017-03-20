package wang.w2017年3月20日.requestANDresponse;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class 响应状态码
 */
@WebServlet("/responseStatus")
public class 响应状态码 extends HttpServlet {
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
		/** 发送404状态码 */
//		resp.sendError(HttpServletResponse.SC_NOT_FOUND, "我就是实验一下");
		
		/** 发送200状态码 */
		resp.setStatus(HttpServletResponse.SC_OK);
		
		/** 发送500状态码 */
		resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	}
}
