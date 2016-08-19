// ////////////////////////////////////////////
//
// J_File.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			文件例程
// ////////////////////////////////////////////
import java.io.File;


// 定义了一个J_File类
public class J_File 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		String k = "J_File.class";
		File f = new File("J_File.class");
		if (f.exists())
		{
			System.out.println("getName: " + f.getName());
			System.out.println("getPath: " + f.getPath());
			System.out.println("getParent:" + f.getParent());
			System.out.println("length: " + f.length());
		}else {
			System.out.printf("文件%1$s不存在%n",k);
		}
		// } // for 循环结束
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_File 结束
/*
存疑:
为什么args对应的东西不一样..
*/