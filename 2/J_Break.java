// ////////////////////////////////////////////
//
// J_Break.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			带标号语句块和break语句例程
// ////////////////////////////////////////////
// 定义了一个J_Break类
public class J_Break 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int i = 0;
		aBreakBlock:
		//语句块标号:
		{
			System.out.println("在break语句之前");
			if (i<=0){
				break aBreakBlock;
			}
			System.out.println("在break语句之后");
		}
		System.out.println("在aBreakBlock语句块之后");																			//用print就不会换行了
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Break 结束
/*
有关带标号的语句块的相关笔记:

第1种形式:
语句块标号:
{
	语句组
}

第2种形式:
语句块标号:
{
	循环语句
}

break的2种形式:
break;//在switch或者是循环中
break 语句块标号;//在语句块中
*/