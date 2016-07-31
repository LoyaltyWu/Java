// ////////////////////////////////////////////
//
// J_Switch.java
//
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			Switch语法练习程序例程
// ////////////////////////////////////////////
// 定义了一个J_Switch类
public class J_Switch
{
	public static void main (String args[])
	{
		char studentGrade = 'A';
		switch (studentGrade)
		{
			case 'A':
			case 'a':
				System.out.println("优秀!");break;
			case 'B':
			case 'b':
				System.out.println("良好!");break;
			case 'C':
			case 'c':
				System.out.println("及格!");break;
			case 'D':
			case 'd':
				System.out.println("不及格!");break;
			default:
				System.out.println("成绩有误!");break;
		} //switch 语句结束
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Switch 结束