// ////////////////////////////////////////////
//
// J_ObjectOutputStream.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			对象输出例程
// ////////////////////////////////////////////
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 定义了一个J_ObjectOutputStream类
public class J_ObjectOutputStream 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("object.dat"));
			J_Student s = new J_Student( "张三", 2003001, 172);
			f.writeObject(s);
			s.mb_output();
			f.close();
			// 以对象形式输出咯
		}
		catch(Exception e){
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结构结束
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_ObjectOutputStream 结束