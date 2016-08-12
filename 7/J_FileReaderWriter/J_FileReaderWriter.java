// ////////////////////////////////////////////
//
// J_FileReaderWriter.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			文件读写器例程
// ////////////////////////////////////////////
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;


// 定义了一个J_FileReaderWriter类
public class J_FileReaderWriter 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			FileWriter f_out = new FileWriter("test.txt");
			f_out.write("有志者,事竟成");
			f_out.close();
			
			FileReader f_in = new FileReader("test.txt");
			for (int c = f_in.read(); c!=-1; c=f_in.read())
			{
				System.out.print((char) c);
			}
			f_in.close();
		}
		catch (Exception e)
		{
			System.err.println("发生异常:" + e);
			e.printStackTrace();
		}
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_FileReaderWriter 结束
/*
Java,Hello!
有志者,事竟成(o゜▽゜)o☆[BINGO!]
*/
/*
没什么区别的样子...
有种带缓存的读写器区别是带缓存了..不用写IOBuffer的那个..
另外一个是书上说的对中文有较好支持..
*/