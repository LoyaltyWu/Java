// ////////////////////////////////////////////
//
// J_Book.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			关于书的类成员域和成员方法的静态属性与非静态属性程序例程
// ////////////////////////////////////////////
// 定义了一个J_Book类
public class J_Book 
{
	public int m_id; // 书的编号
	public static int m_bookNumber = 0; // 书的总数
	
	
	public J_Book()
	{
		m_bookNumber++;
	} // J_Book构造方法结束
	
	public void mb_info()
	{
		System.out.println("当前书的编号是:"+m_id);
	} // 方法mb_info结束
	
	public static void mb_infoStatic()
	{
		System.out.println("当前书的编号是:"+m_bookNumber);
		// 静态方法引用的还得是静态变量
	} // 方法mb_infoStatic结束
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Book a = new J_Book();
		J_Book b = new J_Book();
		a.m_id = 1101;
		b.m_id = 1234;
		System.out.print("变量a对应的");
		a.mb_info();
		System.out.print("变量b对应的");
		b.mb_info();
		J_Book.mb_infoStatic(); // 调用方法的方式和非静态的不同
		// 直接调用类名的
		System.out.println("比较(a.m_bookNumber==J_Book.m_bookNumber)"
				+"的结果是:"+(a.m_bookNumber==J_Book.m_bookNumber));
		System.out.println("比较(b.m_bookNumber==J_Book.m_bookNumber)"
				+"的结果是:"+(b.m_bookNumber==J_Book.m_bookNumber));
		//两种调用方法均可,静态成员方法兼容多一种调用方法
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Book 结束
/*
OUTPUT:
Java,Hello!
变量a对应的当前书的编号是:1101
变量b对应的当前书的编号是:1234
当前书的编号是:2
比较(a.m_bookNumber==J_Book.m_bookNumber)的结果是:true
比较(b.m_bookNumber==J_Book.m_bookNumber)的结果是:true
(o゜▽゜)o☆[BINGO!]
*/