// ////////////////////////////////////////////
//
// J_Add.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			泛型例程//模板类
// ////////////////////////////////////////////
// 定义了一个J_Add类
public class J_Add <T>
{
	public String mb_sum(T a1,T a2,T a3){
		return (a1.toString()+a2.toString()+a3.toString());
	} // 方法 mb_sum 结束
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Add <Integer> b = new J_Add<Integer>();
		Integer a1 = new Integer (1);
		Integer a2 = new Integer (2);
		Integer a3 = new Integer (3);
		System.out.println(b.mb_sum(a1,a2,a3));
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Add 结束
/*
OUTPUT:
Java,Hello!
123
(o゜▽゜)o☆[BINGO!]
*/