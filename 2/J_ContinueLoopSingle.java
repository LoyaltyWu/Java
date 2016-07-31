// ////////////////////////////////////////////
//
// J_ContinueLoopSingle.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			在不含嵌套的循环语句中的continue语句例程
// ////////////////////////////////////////////
// 定义了一个J_ContinueLoopSingle类
public class J_ContinueLoopSingle 
{
	public static void main (String args[])
	{
		for(int i = 0;i<10;i++){
			if (1<i&&i<8)
				continue;
			System.out.println("i="+i);
		}//for结束
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_ContinueLoopSingle 结束