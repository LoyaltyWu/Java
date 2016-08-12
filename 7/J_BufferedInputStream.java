// ////////////////////////////////////////////
//
// J_BufferedInputStream.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			带与不带缓存 在读取数据时的效率的比较例程
// ////////////////////////////////////////////
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Date;
//Date就相当于C++的ctime了,以毫秒为单位


// 定义了一个J_BufferedInputStream类
public class J_BufferedInputStream 
{
	private static String m_fileName = "J_BufferedInputStream.class";
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			int i, ch;
			i = 0;
			Date d1 = new Date();
			FileInputStream f = new FileInputStream (m_fileName);
			while ((ch=f.read()) != -1) // read entire file
			{
				i++;
			}
			f.close();
			Date d2 = new Date();
			
			
			long t = d2.getTime() - d1.getTime();
			System.out.printf("读取文件%1$s(共%2$d)%n",
				 m_fileName, i);
			System.out.printf("不带缓存的方法需要%1$dms%n",t);
			
			
			i = 0;
			d1 = new Date();
			f = new FileInputStream(m_fileName);
			BufferedInputStream fb = new BufferedInputStream(f);
		//^^^^^^^^										 ^^^^^^^^
			// 用了缓冲的..
			while ((ch=fb.read()) != -1) // read entire file
			{
				i++;
			}
			fb.close();
			d2 = new Date();
			
			
			t = d2.getTime() - d1.getTime(); //单位:ms
			System.out.printf("带缓存的方法需要%1$dms%n",t);
		}
		catch (Exception e)
		{
			System.err.println("发生异常"+e);
			e.printStackTrace();
		} // try-catch 结束
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_BufferedInputStream 结束
/*
Java,Hello!
读取文件J_BufferedInputStream.class(共1938)
不带缓存的方法需要3ms
带缓存的方法需要0ms
(o゜▽゜)o☆[BINGO!]
*/