// ////////////////////////////////////////////
//
// J_PrintStream.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			PrintStream 例程
// ////////////////////////////////////////////
import java.io.PrintStream;
import java.io.FileNotFoundException;


// 定义了一个J_PrintStream类
public class J_PrintStream
{
	public static void main (String args[])
	{
		try
		{
			PrintStream f = new PrintStream("out.txt");
			f.printf("%1$d+%2$d=%3$d",1,2,(1+2));
			f.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结构结束
	} // 方法 main 结束
} // 类 J_PrintStream 结束