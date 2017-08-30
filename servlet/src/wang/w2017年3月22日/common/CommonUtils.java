/**
 * @todo TODO
 */
package wang.w2017年3月22日.common;


import java.util.UUID;


/**@author 王必伟
 *
 * @date 2017年3月22日
 *
 * @tags 
 */
public class CommonUtils
{
	public static String getUUID()
	{
		UUID uuid = UUID.randomUUID();
		String result = uuid.toString().replaceAll("-", "");
		result = result.toUpperCase();
		return result;
	}
}
