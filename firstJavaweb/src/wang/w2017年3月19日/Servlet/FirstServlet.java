/**
 * @todo TODO
 * 实现  javax.servlet.Servlet接口
 */
package wang.w2017年3月19日.Servlet;


import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月19日
 *
 * @tags 
 */
public class FirstServlet implements Servlet
{
	
	ServletConfig servletConfig = null;
	/*
	 * 生命周期方法（在Servlet对象销毁之前调用，只调用一次）
	 * 
	 * @see javax.servlet.Servlet#destroy()
	 */
	@Override
	public void destroy()
	{
		System.out.println("destroy()");
	}
	
	/*
	 * 获取Servlet的配置信息
	 * 
	 * @see javax.servlet.Servlet#getServletConfig()
	 */
	@Override
	public ServletConfig getServletConfig()
	{
		System.out.println("getServletConfig()...");
		System.out.println(servletConfig.getServletName());
		Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
		while (initParameterNames.hasMoreElements())
		{
			String paramName = initParameterNames.nextElement();
			System.out.println(paramName + ":"
					+ servletConfig.getInitParameter(paramName));
		}
		System.out.println(servletConfig.getServletContext().toString());
		return servletConfig;
	}
	
	/*
	 * 获取Servlet的信息
	 * 
	 * @see javax.servlet.Servlet#getServletInfo()
	 */
	@Override
	public String getServletInfo()
	{
		System.out.println("getServletInfo()....");
		return null;
	}
	
	/*
	 * 生命周期方法（Servlet对象创建后马上执行，调用一次）
	 * 
	 * @see javax.servlet.Servlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException
	{
		System.out.println("init(ServletConfig servletConfig)");
		this.servletConfig = servletConfig;
	}
	
	/*
	 * 生命周期方法（每个线程都调用这些方法）
	 * 
	 * @see javax.servlet.Servlet#service(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse)
	 */
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
			throws ServletException, IOException
	{
		
		System.out.println("service(ServletRequest servletRequest, ServletResponse servletResponse)");
		getServletConfig();
		ServletContext servletContext = this.getServletConfig().getServletContext();
		servletContext.setAttribute("name", "zhangsan");
		System.out.println(getServletConfig().getServletContext().getInitParameter("count"));
		
		((HttpServletResponse)servletResponse).setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
		// 请求URL = /项目名 + Servlet路径
		((HttpServletResponse) servletResponse).setHeader("Location", "/firstJavaweb/responseStatus");
	}
	
}
