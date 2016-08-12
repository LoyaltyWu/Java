// ////////////////////////////////////////////
//
// J_PrintWriter.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			简单招呼程序例程
// ////////////////////////////////////////////
import java.io.PrintWriter;
import java.io.FileNotFoundException;


// 定义了一个J_PrintWriter类
public class J_PrintWriter 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			PrintWriter f = new PrintWriter("out.txt");
			f.println("莫等闲,白了少年头,空悲切.");
			f.close();
		}
		catch (Exception e)
		{
			System.err.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结构结束
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_PrintWriter 结束