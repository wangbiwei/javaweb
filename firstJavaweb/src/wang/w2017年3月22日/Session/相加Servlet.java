/**
 * @todo TODO
 */
package wang.w2017年3月22日.Session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月22日
 *
 * @tags 
 */
public class 相加Servlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
	
	/* 
	 *
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		/** 获取变量名和变量值 */
		String v1 = req.getParameter("v1");
		String v2 = req.getParameter("v2");
		
		/** 逻辑处理 */
		int i1 = Integer.valueOf(v1);
		int i2 = Integer.valueOf(v2);
		int result = i1 + i2;
		
		/** 将数据保存到request域中 */
		req.setAttribute("result", result);
		
		/** 转发到输出jsp */
		req.getRequestDispatcher("/jspExample/result.jsp").forward(req, resp);
	}
}
