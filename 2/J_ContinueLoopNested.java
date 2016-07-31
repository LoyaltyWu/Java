// ////////////////////////////////////////////
//
// J_ContinueLoopNested.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			在嵌套循环语句中的continue语句例程
// ////////////////////////////////////////////
// 定义了一个J_ContinueLoopNested类
public class J_ContinueLoopNested 
{
	public static void main (String args[])
	{
		aContinueBlock:
		for(int i=0;i<4;i++){
			for (int j=0;j<2;j++){
				if (0<i&&i<3)
					continue aContinueBlock;
				System.out.println("i="+i+", j="+j);
			}//内层for循环结束
		}//外层for循环结束
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
		//aContinueBlock语句块结束
	} // 方法 main 结束
} //类 J_ContinueLoopNested 结束