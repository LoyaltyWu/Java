// ////////////////////////////////////////////
//
// J_Primitive.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			基本数据类型值传递例程
// ////////////////////////////////////////////
// 定义了一个J_Primitive类
public class J_Primitive 
{
	public static void mb_method(int a)
	{
		System.out.println("在a++之前方法参数a=" + a);
		a++;
		System.out.println("在a++之后方法参数a=" + a);
	} // 方法 mb_method 结束
	
	
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int i = 0;
		System.out.println("在方法调用之前方法参数i=" + i);
		mb_method(i);
		System.out.println("在方法调用之后方法参数i=" + i);
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Primitive 结束
/*
Java,Hello!
在方法调用之前方法参数i=0
在a++之前方法参数a=0
在a++之后方法参数a=1
在方法调用之后方法参数i=0
(o゜▽゜)o☆[BINGO!]
*/