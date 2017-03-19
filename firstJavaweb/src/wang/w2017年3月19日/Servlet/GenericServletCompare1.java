/**
 * @todo TODO
 */
package wang.w2017年3月19日.Servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**@author 王必伟
 *
 * @date 2017年3月19日
 *
 * @tags 
 */
public class GenericServletCompare1 extends GenericServletCompare
{
	/*
	 *
	 * @see wang.w2017年3月19日.Servlet.GenericServletCompare#init(javax.servlet.
	 * ServletConfig)
	 */
	@Override
	public void init()
	{
		System.out.println("GenericServletCompare...");
	}
	
	/*
	 *
	 * @see
	 * wang.w2017年3月19日.Servlet.GenericServletCompare#service(javax.servlet.
	 * ServletRequest, javax.servlet.ServletResponse)
	 */
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		
	}
}
