// ////////////////////////////////////////////
//
// J_SetIn.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			重定向例程
// ////////////////////////////////////////////
import java.io.FileInputStream;


// 定义了一个J_SetIn类
public class J_SetIn 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			System.setIn(new FileInputStream("test.txt"));//让System.in变成new FileInputStream("test.txt")
			//这个java需要额外的一个小文件(之前的那个J_Echo.java)
			J_Echo.mb_echo(System.in);
		}
		catch(Exception e)
		{
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结束
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_SetIn 结束
/*
命令:
D:\UE\Java\第7章 文件与数据流\J_SetIn>javac J_Echo.java

D:\UE\Java\第7章 文件与数据流\J_SetIn>javac J_SetIn.java

D:\UE\Java\第7章 文件与数据流\J_SetIn>java J_SetIn


OUTPUT:
Java,Hello!
J_SetIn and J_Echo
(o゜▽゜)o☆[BINGO!]
//最终输出的是test.txt内的内容
*/