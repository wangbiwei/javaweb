/**
 * @todo TODO
 */
package wang.w2017年3月20日.requestANDresponse;


import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**@author 王必伟
 *
 * @date 2017年3月20日
 *
 * @tags 
 */
public class Reseponse两个流 extends HttpServlet
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
		/** 字节流和字符流不能同时存在 */
		/** 字符流 */
		// PrintWriter writer = resp.getWriter();
		// writer.println("要输出的字符");
		
		/** 字节流 */
		ServletOutputStream outputStream = resp.getOutputStream();
		@SuppressWarnings("resource")
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Imwang\\Desktop\\044竹.jpg");
		byte[] temp = new byte[1024];
		int size = -1;
		while ((size = fileInputStream.read(temp)) != -1)
		{
			outputStream.write(temp, 0, size);
		}
		
		outputStream.close();
	}
}
