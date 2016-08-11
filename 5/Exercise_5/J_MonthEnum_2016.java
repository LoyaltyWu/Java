// ////////////////////////////////////////////
//
// J_MonthEnum_2016.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			2016Enum月份例程
// ////////////////////////////////////////////
// 定义了一个MonthEnum_2016枚举类
enum MonthEnum_2016
{
	Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec;
}
// 定义了一个J_MonthEnum_2016类
public class J_MonthEnum_2016 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int [] a = {31,28,31,30,31,30,31,31,30,31,30,31};
		int i = 0;
		for (MonthEnum_2016 c: MonthEnum_2016.values())
		{
			System.out.println(c+" have "+a[i++]+" days.");
		}
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_MonthEnum_2016 结束
/*
Java,Hello!
Jan have 31 days.
Feb have 28 days.
Mar have 31 days.
Apr have 30 days.
May have 31 days.
Jun have 30 days.
Jul have 31 days.
Aug have 31 days.
Sep have 30 days.
Oct have 31 days.
Nov have 30 days.
Dec have 31 days.
(o゜▽゜)o☆[BINGO!]
*/