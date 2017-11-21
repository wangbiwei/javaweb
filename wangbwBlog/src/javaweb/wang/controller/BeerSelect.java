/**
 * @todo servlet
 */
package javaweb.wang.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaweb.wang.model.BeerExpert;


/**
 * @author 王必伟
 *
 * @date 2017年11月18日
 * 
 * @tags
 */
public class BeerSelect extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 *
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		BeerExpert beerExpert = new BeerExpert();
		String color = req.getParameter("color");
		String name = getServletConfig().getInitParameter("name");
		String age = getServletConfig().getInitParameter("age");
		Enumeration<String> paramNames = getServletConfig().getInitParameterNames();
		
		req.setAttribute("name", name);
		req.setAttribute("age", age);
		req.setAttribute("paramNames", paramNames);
		
		List<String> brands = beerExpert.getBrands(color);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
		
		req.setAttribute("styles", brands);
		requestDispatcher.forward(req, resp);
		
		
		 resp.setContentType("text/html"); 
		 PrintWriter writer = resp.getWriter(); 
		 writer.println("Beer Selectin Advice<br />");
		  writer.println("<br />Got beer color:" + color);
		  writer.println("<br />Got beer brands:"); for (String brand : brands)
		  { writer.println("<br />" + brand); } writer.flush(); writer.close();
		 
	}
}
