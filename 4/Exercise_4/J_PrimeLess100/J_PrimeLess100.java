// ////////////////////////////////////////////
//
// J_PrimeLess100.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			筛法输出小于等于100的素数例程
// ////////////////////////////////////////////
// 定义了一个J_PrimeLess100类
public class J_PrimeLess100 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int [] flag = new int [101];
		int i = 0;
		for (i = 0;i<101;i++){
			flag[i]=1;
		}
		for (i = 2;i<101;i++){
			if (flag[i]==1){
				System.out.print(i+" ");
				int tmp = i;
				for (int j = 2;(j*i)<101;j++){
					flag[j*i] = 0;
				}
			}
		}
		
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_PrimeLess100 结束