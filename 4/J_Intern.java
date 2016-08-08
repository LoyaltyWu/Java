// ////////////////////////////////////////////
//
// J_Intern.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			字符串池例程
// ////////////////////////////////////////////
// 定义了一个J_Intern类
public class J_Intern 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		String s1 = "123456";// 字符串直接量
		String s2 = "123456";// 字符串直接量
		String s3 ="123"+"456";// 这不是字符串直接量
		String a = "123";// 字符串直接量
		// 虽然a指向字符串直接量,但是a本身不是字符串直接量
		String s4 = a + "456";// 这不是字符串直接量
		String s5 = new String ("123456");// 这不是字符串直接量
		// 因为s5指向对的对象不在字符串池内所以s5!=s1
		String s6 = s5.intern();//若当前字符串已经在字符串池中,则返回其引用,不然构造一个这样的字符串然后返回其引用
		System.out.println("s2"+((s2==s1) ? "==":"!=")+"s1");
		System.out.println("s3"+((s3==s1) ? "==":"!=")+"s1");
		System.out.println("s4"+((s4==s1) ? "==":"!=")+"s1");
		System.out.println("s5"+((s5==s1) ? "==":"!=")+"s1");
		System.out.println("s6"+((s6==s1) ? "==":"!=")+"s1");
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Intern 结束