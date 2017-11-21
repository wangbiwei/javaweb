/**
 * @todo TODO
 */
package javaweb.wang.model;


import java.util.ArrayList;
import java.util.List;


/**@author 王必伟
 *
 * @date 2017年11月18日
 *
 * @tags 
 */
public class BeerExpert
{
	/**
	 * 获取啤酒品牌
	 * @param color
	 * @return
	 */
	public List<String> getBrands(String color)
	{
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber"))
		{
			brands.add("JackAmber");
			brands.add("Red moose");
		} else
		{
			brands.add("Jail pale Ale");
			brands.add("gout stout");
		}
		return brands;
	}
}
