// ////////////////////////////////////////////
//
// J_Example.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			for 语句的简化写法在整数数组中的应用例程
// ////////////////////////////////////////////
// 定义了一个J_Example类
public class J_Example 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int [] a = {10,20,30,40,50};
		int s = 0;
		//没有用Vector
		//用的是第2种简化写法
		//但是怎么说呢...怎么容器和数组最终的简化写法怎么一样的样子....
		for (int c : a)
		{
			s += c; // 这里注意c是数组元素
		} // for 循环结束
		System.out.println("The sum of the array A is " + s );
		
		
		
		//奇怪的一组...
		s = 0;
		for (int i = 1;i<=a.length;i++){
			s+=i;
		}
		System.out.println("从1一直加到数组a的元素长度,结果等于"+s);
		//切....1+2+3+4+5==15...
		
		
		//对照组,第2种简化写法的完整形式
		s = 0;
		int [] ca = a;
		for (int i=0;i<ca.length;i++){
			int c = ca[i];
			s += c;
		} // for 循环结束
		System.out.println("The sum of the array A is " + s );
		
		
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Example 结束