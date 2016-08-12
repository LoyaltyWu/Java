// ////////////////////////////////////////////
//
// J_RandomAccessFile.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			随机访问文件例程
// ////////////////////////////////////////////
import java.io.IOException;
import java.io.RandomAccessFile;


// 定义了一个J_RandomAccessFile类
public class J_RandomAccessFile 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			RandomAccessFile f = new RandomAccessFile("test.txt", "rw");
			int 		i;
			double 	d;
			for (i = 0;i<10;i++)
			{
				f.writeDouble(Math.PI*i);
			}
			f.seek(16);
			// seek 相当于文件指针的样子.set去哪个位置,就直接从那个位置开始
			// 接的以byte为单位
			f.writeDouble(0);
			f.seek(0);
			// set去文件开头了...
			for (i = 0;i<10;i++)
			{
				d = f.readDouble();
				System.out.println("["+i+"]: "+d);
			} // for 循环
		}
		catch (IOException e)
		{
			System.err.println("出现异常:"+e);
			e.printStackTrace();
		} // try-catch 结构结束
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_RandomAccessFile 结束