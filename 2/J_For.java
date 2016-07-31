// ////////////////////////////////////////////
//
// J_For.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			For语法练习程序例程
// ////////////////////////////////////////////
// 定义了一个J_For类
public class J_For
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int counter,sum;
		for (counter = 1,sum = 0;counter<=100;counter++){
			sum+=counter;
		}
		System.out.println("counter="+counter+", sum="+sum);
		
		for (int c = 0, s = 0;c<100;c++){
			s+=(c+1);
			if (c+1==100){
				System.out.println("counter="+(c+1)+", sum="+s);
			}
		}
		
		
		
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_For 结束