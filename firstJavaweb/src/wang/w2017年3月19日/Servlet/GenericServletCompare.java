/**
 * @todo TODO
 * 模拟 GenericServlet；
 */
package wang.w2017年3月19日.Servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月19日
 *
 * @tags 
 */
public class GenericServletCompare implements Servlet
{
	private transient ServletConfig config;
	
	/* 
	 *
	 * @see javax.servlet.Servlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		this.config = config;
		this.init();
	}
	
	public void init()
	{
	}
	
	/*
	 * 因为会在init方法后执行，所以一定会返回值
	 * 
	 * @see javax.servlet.Servlet#getServletConfig()
	 */
	@Override
	public ServletConfig getServletConfig()
	{
		return config;
	}
	
	/* 
	 *
	 * @see javax.servlet.Servlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	 */
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		System.out.println("service(ServletRequest req, ServletResponse res)");
	}
	
	/* 
	 *
	 * @see javax.servlet.Servlet#getServletInfo()
	 */
	@Override
	public String getServletInfo()
	{
		return "类型：GenericServletCompare";
	}
	
	/* 
	 *
	 * @see javax.servlet.Servlet#destroy()
	 */
	@Override
	public void destroy()
	{
		System.out.println("Servlet对象销毁之前！");
	}
	
	/**
	 * 获取ServletContext
	 * 
	 * @return ServletContext
	 */
	public ServletContext getServletContext()
	{
		return config.getServletContext();
	}
	
	/**
	 * 获取getServletName
	 * @return getServletName
	 */
	public String getServletName()
	{
		return config.getServletName();
	}

	
}
