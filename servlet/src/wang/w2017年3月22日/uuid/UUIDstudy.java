/**
 * @todo TODO
 */
package wang.w2017年3月22日.uuid;


import java.util.UUID;


/**@author 王必伟
 *
 * @date 2017年3月22日
 *
 * @tags 
 */
public class UUIDstudy
{
	public static void main(String[] args)
	{
		UUID uuid = UUID.randomUUID();
		String uuid1 = uuid.toString().replaceAll("-", "");
		uuid1 = uuid1.toUpperCase();
		System.out.println(uuid1);
		System.out.println(uuid);
	}
	
}
