/**
 * @todo 通过继承HttpSessionListener来 管理人数
 */
package javaweb.wang.listener;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * @author 王必伟
 *
 * @date 2017年11月21日
 *
 * @tags
 */
public class 统计在线人数 implements HttpSessionListener
{
	
	/*
	 *
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.
	 * HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent se)
	{
		// 当监视到session创建时，就加1
		ServletContext servletContext = se.getSession().getServletContext();
		synchronized (servletContext)
		{
			Integer viewPeoples = (Integer) servletContext.getAttribute("viewPeoples");
			servletContext.setAttribute("viewPeoples", ++viewPeoples);
		}
	}
	
	/*
	 *
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.
	 * http.HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent se)
	{
		// 当监视到session删除时，就减1
		ServletContext servletContext = se.getSession().getServletContext();
		
		synchronized (servletContext)
		{
			// 当我取值时，赋值时，不允许其他线程操作
			Integer viewPeoples = (Integer) servletContext.getAttribute("viewPeoples");
			servletContext.setAttribute("viewPeoples", --viewPeoples);
		}
	}
	
}
