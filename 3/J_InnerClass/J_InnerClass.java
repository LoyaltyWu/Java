// ////////////////////////////////////////////
//
// J_InnerClass.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			父类型为类的匿名内部类例程
// ////////////////////////////////////////////
// 定义了一个J_InnerClass类
abstract class J_Class
{
	int m_data;
	
	public J_Class(int i)
	{
		m_data = i;
	} // J_Class 构造方法
	
	
	public abstract void mb_method();
} // 抽象类 J_Class 结束





public class J_InnerClass 
{
	public static void main (String args[])
	{
		J_Class b = new J_Class(5) // 动态多态性 通过父类型的引用调用子类型的成员方法
		{
			public void mb_method()
			{
				System.out.println("m_data=" + m_data);
			} // 方法 mb_method 结束
		}; // 父类型为类 J_Class 的匿名内部类结束
		b.mb_method();
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_InnerClass 结束