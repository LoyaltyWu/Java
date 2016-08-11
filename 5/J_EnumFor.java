// ////////////////////////////////////////////
//
// J_EnumFor.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			for 语句的简化写法在枚举类型数组中的应用例程
// ////////////////////////////////////////////
// 定义了一个E_SEASON枚举类型
enum E_SEASON
{
	春季,夏季,秋季,冬季;
} // 枚举 E_SEASON 结束


// 定义了一个J_EnumFor类
public class J_EnumFor 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		//第2类for语句简化写法
		for (E_SEASON c: E_SEASON.values())
		{
			System.out.print(c+", ");
		}
		System.out.println();
		
		//完整形式
		//对照
		E_SEASON [] ca = E_SEASON.values();
		//看来values返回的是一个数组
		for (int i = 0;i<ca.length;i++){
			E_SEASON c = ca[i];
			System.out.print(c+", ");
		} // for 循环结束
		System.out.println();
		
		
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_EnumFor 结束