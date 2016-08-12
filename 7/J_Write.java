// ////////////////////////////////////////////
//
// J_Write.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			输出流例程
// ////////////////////////////////////////////
import java.io.IOException;
import java.io.OutputStream;


// 定义了一个J_Write类
public class J_Write 
{
	public static void mb_write(OutputStream out)
	{
		String s = "输出流例程";
		byte [] b = s.getBytes();
		try
		{
			out.write(b);
			out.flush();
		}
		catch (IOException e)
		{
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结构结束
	} // 方法 mb_write 结束
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		mb_write(System.out);
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Write 结束