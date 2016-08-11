// ////////////////////////////////////////////
//
// J_Enum.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			枚举类型例程
// ////////////////////////////////////////////
// 定义了一个E_SEASON枚举类型
enum E_SEASON
{
	春季,夏季,秋季,冬季;
} // 枚举 E_SEASON 结束


// 定义了一个J_Enum类
public class J_Enum 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		E_SEASON [] sa = E_SEASON.values();
		for (int i = 0;i<4;i++){
			switch(sa[i])
			{
				//春季,夏季,秋季,冬季;
				case 春季:
				//不能写成case sa[i].春季
				//不能写成case E_SEASON.春季
					System.out.println("春季花满天");
					break;
				case 夏季:
					System.out.println("夏季叶满庭");
					break;
				case 秋季:
					System.out.println("秋季果满园");
					break;
				case 冬季:
					System.out.println("冬季雪满檐");
					break;
			} // switch 结构结束
		}
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Enum 结束
/*
Java,Hello!
春季花满天
夏季叶满庭
秋季果满园
冬季雪满檐
(o゜▽゜)o☆[BINGO!]
*/