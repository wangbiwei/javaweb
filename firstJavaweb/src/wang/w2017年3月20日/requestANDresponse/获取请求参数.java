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
public class 获取请求参数 extends HttpServlet
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
		System.out.println("获取请求参数 + doGet");
		
		PrintWriter writer = resp.getWriter();
		
		Enumeration<String> parameterNames = req.getParameterNames();
		while (parameterNames.hasMoreElements())
		{
			String temp = parameterNames.nextElement();
			if (temp.equals("aihao"))
			{
				String[] temp1 = req.getParameterValues(temp);
				for (String string : temp1)
				{
					writer.println(temp + ":" + string);
				}
				continue;
			}
			writer.println(temp + ":" + req.getParameter(temp));
		}
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
