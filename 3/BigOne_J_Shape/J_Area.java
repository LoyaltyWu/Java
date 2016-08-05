// ////////////////////////////////////////////
//
// J_Area.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			计算矩形和圆面积例程
// ////////////////////////////////////////////
// 定义了一个J_Area类
public class J_Area 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Shape a = new J_Circle(5);
		System.out.println("半径为5的圆的面积是"+a.mb_getArea());
		a = new J_Rectangle(0,0,3,4);
		System.out.println("给定的矩形面积是"+a.mb_getArea());
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Area 结束
/*
OUTPUT:
Java,Hello!
半径为5的圆的面积是78.53981633974483
给定的矩形面积是12.0
(o゜▽゜)o☆[BINGO!]
*/