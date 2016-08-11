// ////////////////////////////////////////////
//
// J_AddInterface.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			泛型例程
// ////////////////////////////////////////////
// 定义了一个J_Interface接口(具有泛型特点)
interface J_Interface <T extends Number>
{
	public int mb_sum(T a1,T a2,T a3);
} // J_Interface 接口结束
// 定义了一个J_AddInterface类(也具有泛型特点)
public class J_AddInterface <T extends Number> implements J_Interface < T >
{
	/*
	interface J_Interface <T extends Number>
	{
		public int mb_sum(T a1,T a2,T a3);
	} // J_Interface 接口结束
	*/
	public int mb_sum(T a1,T a2,T a3)
	{
		int b1 = a1.intValue();
		int b2 = a2.intValue();
		int b3 = a3.intValue();
		return (b1+b2+b3);
	} // 方法 mb_sum 结束 // 要用的时候还要写一遍???
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_AddInterface <Integer> b = new J_AddInterface<Integer>();
		// 这里给实例化了
		// 用的是系统的构造函数
		Integer a1 = new Integer (1);
		Integer a2 = new Integer (2);
		Integer a3 = new Integer (3);
		System.out.println(b.mb_sum(a1,a2,a3));
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_AddInterface 结束