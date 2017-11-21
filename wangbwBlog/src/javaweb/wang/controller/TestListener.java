/**
 * @todo TODO
 */
package javaweb.wang.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javaweb.wang.model.Dog;


/**
 * @author 王必伟
 *
 * @date 2017年11月19日
 *
 * @tags
 */
public class TestListener extends HttpServlet
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter writer = resp.getWriter();
		writer.println("dog's breed is:" + dog.getBreed() + "<br />");
		
		HttpSession session = req.getSession();
		//判断请求是否有退出参数
		if (req.getParameter("quit") != null)
		{
			session.invalidate();
			writer.println("，当前浏览人数：" + getServletContext().getAttribute("viewPeoples"));
			return;
		}
		
		if (session.isNew())
		{
			writer.print("你是新用户");
		} else
		{
			writer.print("你是老用户");
		}
		writer.println("，当前浏览人数：" + getServletContext().getAttribute("viewPeoples") + "<br />");
		writer.println("<a href='"+resp.encodeRedirectUrl("testListener")+"'>刷新</a>");
	}
	
}
