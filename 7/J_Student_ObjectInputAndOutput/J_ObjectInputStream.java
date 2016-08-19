// ////////////////////////////////////////////
//
// J_ObjectInputStream.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			读取对象例程
// ////////////////////////////////////////////
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// 定义了一个J_ObjectInputStream类
public class J_ObjectInputStream 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try
		{
			ObjectInputStream f = new ObjectInputStream(
				new FileInputStream("object.dat"));
			J_Student s = (J_Student)(f.readObject());
			s.mb_output();
			f.close();
		}
		catch (Exception e)
		{
			System.err.println("发生异常:"+e);
			e.printStackTrace();
		} // try-catch 结构结束
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_ObjectInputStream 结束