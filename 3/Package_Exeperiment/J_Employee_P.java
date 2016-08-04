// ////////////////////////////////////////////
//
// J_Employee_P.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			Package例程——Employee Part
// ////////////////////////////////////////////
// 定义了一个J_Employee_P类
package cn.edu.tsinghua.universityOrganization;

public class J_Employee_P 
{
	public int m_workYear; // 工作的年限
	
	public J_Employee_P()
	{
		m_workYear = 1;
	} // J_Employee_P 构造方法结束
	
	public void mb_printInfo()
	{
		System.out.println("该职工的工作年限"+m_workYear);
	} // mb_printInfo结束
	/*
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
	*/
} //类 J_Employee_P 结束