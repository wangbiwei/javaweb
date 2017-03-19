package wang.w2017年3月19日.Servlet;


import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletStudy1
 */
public class HttpServletStudy1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		/** 获取资源的绝对路径 */
		String path = getServletContext().getRealPath("/index.jsp");
		/** 获取资源的流 */
		getServletContext().getResourceAsStream("/index.jsp");
		System.out.println(path);
		
		// 相对于.class路径
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream resourceAsStream = classLoader.getResourceAsStream("wang/w2017年3月19日/Servlet/test.txt");
		System.out.println(resourceAsStream);
	}
}
