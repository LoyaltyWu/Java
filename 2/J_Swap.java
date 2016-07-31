// ////////////////////////////////////////////
//
// J_Swap.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			采用按位异或运算实现的交换2个整数的程序例程
// ////////////////////////////////////////////
// 定义了一个J_Swap类
public class J_Swap 
{
	public static void main (String args[])
	{
		int i = 0;
		i = (-1)^(1);
		System.out.println("(-1)^(1) = "+ i);
		System.out.println("按位异或运算");
		int a = 123;
		int b = 321;
		System.out.println("a="+a+", b="+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a="+a+", b="+b);
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Swap 结束

/*

Sample Output:

0^(1) = -2
a=123, b=321
a=321, b=123
(o゜▽゜)o☆[BINGO!]

*/