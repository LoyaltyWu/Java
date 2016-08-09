// ////////////////////////////////////////////
//
// J_Random20.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			测试Random并统计结果例程
// ////////////////////////////////////////////
// 定义了一个J_Random20类
public class J_Random20 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int [] boring = new int [10000];
		int i = 0;
		for(i = 0;i<10000;i++){
			boring[i] = (int)(Math.random()*20+0.5);
		}
		int [] sum = new int [21];
		for (i = 0;i<10000;i++){
			sum[boring[i]]++;
		}
		for (i = 0;i<21;i++){
			System.out.println("Case "+i+" : "+sum[i]+".");
		}
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Random20 结束
/*
OUTPUT:
Java,Hello!
Case 0 : 246.
Case 1 : 510.
Case 2 : 478.
Case 3 : 514.
Case 4 : 493.
Case 5 : 515.
Case 6 : 481.
Case 7 : 519.
Case 8 : 498.
Case 9 : 517.
Case 10 : 535.
Case 11 : 511.
Case 12 : 453.
Case 13 : 513.
Case 14 : 487.
Case 15 : 481.
Case 16 : 510.
Case 17 : 491.
Case 18 : 499.
Case 19 : 509.
Case 20 : 240.
(o゜▽゜)o☆[BINGO!]
*/