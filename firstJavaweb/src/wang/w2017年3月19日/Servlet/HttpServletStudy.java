/**
 * @todo TODO
 */
package wang.w2017年3月19日.Servlet;


import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月19日
 *
 * @tags 
 */
public class HttpServletStudy extends HttpServlet
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String String = null;
	
	/*
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		String value = (String) this.getServletContext().getAttribute("name");
		System.out.println(value);
		Enumeration<String> attributeNames = this.getServletContext().getAttributeNames();
		// while (attributeNames.hasMoreElements())
		// {
		// String nextElement = attributeNames.nextElement();
		// System.out.println(nextElement + ":" +
		// this.getServletContext().getAttribute(nextElement));
		// }
		String initParameter = this.getServletContext().getInitParameter("Name1");
		System.out.println(initParameter);
		System.out.println(this.getServletContext() == this.getServletConfig().getServletContext());
		System.out.println(getServletContext().getInitParameter("count"));
	}
}
