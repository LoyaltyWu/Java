// ////////////////////////////////////////////
//
// J_BufferedReaderWriter.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			带缓存读写器例程
// ////////////////////////////////////////////
import java.io.BufferedWriter;
// 缓存版阅读器
// 就像 缓存版输入输出流那样..
import java.io.FileReader;
// 阅读器
import java.io.FileWriter;
// 读写器..
import java.io.IOException;
import java.io.LineNumberReader;
// 这个是什么.... 继承自 BufferedWriter 的所有成员方法
// 还提供获取行号的成员方法.. public int getLineNumber()//返回行号..
// 写入行分隔符的也有..
import java.util.Date;
// 试着import一波Date,测测执行速度


// 定义了一个J_BufferedReaderWriter类
public class J_BufferedReaderWriter 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			// 带缓存的读写器
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			bw.write("有志者,事竟成");
			bw.newLine();//from LineNumberReader
			bw.write("苦心人,天不负");
			bw.newLine();//from LineNumberReader
			bw.close();
			
			Date n1 = new Date();
			LineNumberReader br = new LineNumberReader(new FileReader ("test.txt"));
			String s;
			for (s = br.readLine(); s!=null; s = br.readLine())
			{
				System.out.println(br.getLineNumber() + ": " + s);
			}
			br.close();
			Date n2 = new Date();
			
			Date n3 = new Date();
			FileReader f_in = new FileReader("test.txt");
			for (int c = f_in.read(); c!=-1; c=f_in.read())
			{
				System.out.print((char) c);
			}
			f_in.close();
			Date n4 = new Date();
			
			long t = n2.getTime() - n1.getTime();
			// 记得要加上.getTime()
			System.out.printf("带缓存的用时为%1$dms%n",t);
			t = n4.getTime() - n3.getTime();
			System.out.printf("不带缓存的用时为%1$dms%n",t);
		}
		catch (Exception e)
		{
			System.out.println("出现异常:"+e);
			e.printStackTrace();
		} // try-catch 结构结束
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_BufferedReaderWriter 结束
/*
Java,Hello!
1: 有志者,事竟成
2: 苦心人,天不负
有志者,事竟成
苦心人,天不负
带缓存的用时为16ms
不带缓存的用时为0ms
(o゜▽゜)o☆[BINGO!]
*/