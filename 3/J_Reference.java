// ////////////////////////////////////////////
//
// J_Reference.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			引用数据类型值传递例程
// ////////////////////////////////////////////
// 定义了一个J_Reference类
class J_Time
{
	public int m_month = 1;
} // J_Time 类结束

public class J_Reference 
{
	public static void mb_method (J_Time t)
	{
		System.out.println("在 t.m_month++之前 t.m_month="+t.m_month);
		t.m_month++;
		System.out.println("在 t.m_month++之后 t.m_month="+t.m_month);
	}
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Time a = new J_Time();
		System.out.println("在方法调用之前 a.m_month="+a.m_month);
		mb_method (a);
		System.out.println("在方法调用之后 a.m_month="+a.m_month);
		
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Reference 结束
/*
Java,Hello!
在方法调用之前 a.m_month=1
在 t.m_month++之前 t.m_month=1
在 t.m_month++之后 t.m_month=2
在方法调用之后 a.m_month=2
(o゜▽゜)o☆[BINGO!]
*/