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
 * @date 2017年3月20日
 *
 * @tags 
 */
public class 防盗链 extends HttpServlet
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
		System.out.println("防盗链 + doGet");
		
		String referer = req.getHeader("Referer");
		
		if (referer != null && referer.contains(req.getContextPath()))
		{
			PrintWriter writer = resp.getWriter();
			writer.println(referer);
		} else
		{
			// resp.sendError(HttpServletResponse.SC_NOT_FOUND,
			// "不能直接输入或者从其他网站进入");
			resp.sendRedirect(req.getContextPath() + "/index.jsp");
		}
		
	}
}
