/**
 * @todo TODO
 */
package wang.w2017年3月20日.requestANDresponse;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


/**@author 王必伟
 *
 * @date 2017年3月21日
 *
 * @tags 
 */
public class URI编码
{
	public static void main(String[] args)
	{
		String name = "张三";
		
		try
		{
			String url格式 = URLEncoder.encode(name, "utf-8");
			System.out.println(url格式);
			String 字符串 = URLDecoder.decode(url格式, "utf-8");
			System.out.println(字符串);
			// byte[] temp = name.getBytes("utf-8");
			
		} catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		
	}
}
