// ////////////////////////////////////////////
//
// J_WeekEnum.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			星期枚举类型例程
// ////////////////////////////////////////////
// 定义了一个J_Week 枚举类型
enum J_Week
{
	Sun,Mon,Tue,Wed,Thu,Fri,Sat;
}
// 定义了一个J_WeekEnum类
public class J_WeekEnum 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int i = 0;
		for (J_Week c : J_Week.values())
		{
			System.out.println("每周的第"+(++i)+"天:"+c);
		}
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_WeekEnum 结束
/*
Java,Hello!
每周的第1天:Sun
每周的第2天:Mon
每周的第3天:Tue
每周的第4天:Wed
每周的第5天:Thu
每周的第6天:Fri
每周的第7天:Sat
(o゜▽゜)o☆[BINGO!]
*/