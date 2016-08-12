// ////////////////////////////////////////////
//
// J_Echo.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			回显(Echo)例程
// ////////////////////////////////////////////
import java.io.InputStream;
import java.io.IOException;


// 定义了一个J_Echo类
public class J_Echo
{
	public static void mb_echo(InputStream in)
	{
		try
		{
			while (true)
			{
				int i = in.read();
				if (i==-1)
				{
					break;
				}
				char c = (char) i;
				System.out.print(c);
			} // while 循环结束
		}
		catch (IOException e)
		{
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结束
		System.out.println();
	} // 方法 mb_echo 结束
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		mb_echo(System.in);
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Echo 结束