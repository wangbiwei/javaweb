/**
 * @todo TODO
 */
package javaweb.wang.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import javaweb.wang.model.Dog;


/**
 * @author 王必伟
 *
 * @date 2017年11月19日
 *
 * @tags
 */
public class MyServletContextListener implements ServletContextListener
{
	
	/*
	 *
	 * @see
	 * javax.servlet.ServletContextListener#contextInitialized(javax.servlet.
	 * ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		// 1. 从事件中拿到上下文对象
		ServletContext servletContext = sce.getServletContext();
		// 2. 从上下文事件中拿到上下文的属性
		Dog dog = new Dog();
		dog.setName(servletContext.getInitParameter("name"));
		dog.setAge(Integer.parseInt(servletContext.getInitParameter("age")));
		dog.setBreed(servletContext.getInitParameter("breed"));
		// 3. 把得到的Object（对象），传递给上下文对象，从而使web全部应用都可以用这个对象
		servletContext.setAttribute("dog", dog);
		
		System.out.println("绑定了");
		
		Integer viewPeoples = Integer.parseInt(servletContext.getInitParameter("viewPeoples"));
		servletContext.setAttribute("viewPeoples", viewPeoples);
		
	}
	
	/*
	 *
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.
	 * ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		// 1. 从事件中拿到上下文对象
		ServletContext servletContext = sce.getServletContext();
		
		servletContext.setAttribute("dog", null);
		System.out.println("执行了");
	}
	
}
