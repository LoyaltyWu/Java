// ////////////////////////////////////////////
//
// J_Scope.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			同名变量作用域范围重叠情况处理例程
// ////////////////////////////////////////////
// 定义了一个J_Scope类
class J_Time
{
	public int data = 3;
	// 这里省略类体的其他部分
} // 类 J_Time 结束

public class J_Scope extends J_Time
{
	public int data = 2;
	
	public void mb_method ()
	{
		int data = 1;
		System.out.println("data="+data);
		System.out.println("this.data="+this.data);
		System.out.println("super.data="+super.data);
	} // 方法 mb_method 结束
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Scope a = new J_Scope();
		a.mb_method();
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Scope 结束
/*
OUTPUT:
Java,Hello!
data=1
this.data=2
super.data=3
(o゜▽゜)o☆[BINGO!]
*/