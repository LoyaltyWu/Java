// ////////////////////////////////////////////
//
// J_InnerInterface.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			父类型为接口的匿名内部例程
// ////////////////////////////////////////////
// 定义了一个J_InnerInterface类
interface J_Interface
{
	public static int m_data = 5;
	
	public abstract void mb_method();
} // 接口J_Interface 结束


public class J_InnerInterface 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Interface b = new J_Interface()
		{
			public void mb_method ()
			{
				System.out.println("m_data="+m_data);
			} // 方法 mb_method 结束
		}; // 实现接口 J_Interface 的匿名内部类结束
		b.mb_method();
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_InnerInterface 结束