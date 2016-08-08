// ////////////////////////////////////////////
//
// J_StringBuffer.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			字符串缓冲区例程
// ////////////////////////////////////////////
// 定义了一个J_StringBuffer类
public class J_StringBuffer 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		StringBuffer b = new StringBuffer("0123");
		System.out.println("字符串缓冲区的字符序列是:\""+b+"\"");
		System.out.println("字符串缓冲区的长度是:"+b.length());
		System.out.println("字符串缓冲区的容量是:"+b.capacity());
		
		
		b.ensureCapacity(25);
		System.out.println("调用b.ensureCapacity(25)之后");
		System.out.println("字符串缓冲区的字符序列是:\""+b+"\"");
		System.out.println("字符串缓冲区的长度是:"+b.length());
		System.out.println("字符串缓冲区的容量是:"+b.capacity());
		System.out.println("计算公式为: 20X2+2==42");
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_StringBuffer 结束