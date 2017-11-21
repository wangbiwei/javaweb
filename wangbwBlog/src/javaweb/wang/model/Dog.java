/**
 * @todo TODO
 */
package javaweb.wang.model;


import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


/**
 * @author 王必伟
 *
 * @date 2017年11月19日
 *
 * @tags
 */
public class Dog implements HttpSessionBindingListener
{
	private String name;
	private int age;
	private String breed;
	
	public Dog()
	{
		
	}
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * @return the breed
	 */
	public String getBreed()
	{
		return breed;
	}
	
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	/*
	 *
	 * @see
	 * javax.servlet.http.HttpSessionBindingListener#valueBound(javax.servlet.
	 * http.HttpSessionBindingEvent)
	 */
	@Override
	public void valueBound(HttpSessionBindingEvent event)
	{
		// 从事件中拿到一个session，看是哪个session添加了这个属性
		HttpSession session = event.getSession();
		System.out.println("我被添加到session中了" + session.getClass());
	}
	
	/*
	 *
	 * @see
	 * javax.servlet.http.HttpSessionBindingListener#valueUnbound(javax.servlet.
	 * http.HttpSessionBindingEvent)
	 */
	@Override
	public void valueUnbound(HttpSessionBindingEvent event)
	{
		HttpSession session = event.getSession();
		System.out.println("我被移出到session中了" + session.getClass());
	}
	
}
