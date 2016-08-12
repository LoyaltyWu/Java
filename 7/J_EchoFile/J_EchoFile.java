// ////////////////////////////////////////////
//
// J_EchoFile.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			读取文件"test.txt"例程
// ////////////////////////////////////////////
import java.io.FileInputStream;
import java.io.IOException;


// 定义了一个J_EchoFile类
public class J_EchoFile 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try 
		{
			FileInputStream f = new FileInputStream("test.txt");
			int i;
			int b = f.read();
			for (i = 0;b!=-1;i++){
				System.out.print((char)b);
				b = f.read();
			} // for 循环
			System.out.println();
			System.out.println("文件\"test.txt\"字节数为"+i);
			f.close();
		}
		catch (IOException e)
		{
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结束
		System.out.println();
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_EchoFile 结束

/*
当test文件不在的时候::
Java,Hello!
发生异常:java.io.FileNotFoundException: test.txt (系统找不到指定的文件。)
java.io.FileNotFoundException: test.txt (系统找不到指定的文件。)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at J_EchoFile.main(J_EchoFile.java:22)
        
正常情况下:
Java,Hello!
C

文件"test.txt"字节数为3
//回车算是2个字符
*/