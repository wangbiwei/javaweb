/**
 * @todo TODO
 */
package wang.w2017年3月19日.Servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月19日
 *
 * @tags 
 */
public class GenericServletStudy extends GenericServlet
{
	/*
	 *
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException
	{
		System.out.println("GenericServlet中的方法是个空方法!");
	}
	
	/* 
	 *
	 * @see javax.servlet.GenericServlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	 */
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		System.out.println("父方法是个抽象方法，所以子类必须实现!");
	}
	
}
