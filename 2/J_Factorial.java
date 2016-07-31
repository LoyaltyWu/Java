// ////////////////////////////////////////////
//
// J_Factorial.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			计算并输出10!的例程
// ////////////////////////////////////////////
// 定义了一个J_Factorial类
public class J_Factorial 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int f = 1;
		for (int i = 1;i<=10;i++){
			f*=i;
		}
		System.out.println("10! = "+f);
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Factorial 结束