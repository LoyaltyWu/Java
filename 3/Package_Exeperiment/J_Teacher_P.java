// ////////////////////////////////////////////
//
// J_Teacher.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			Package例程——Teacher Part
// ////////////////////////////////////////////
// 定义了一个J_Teacher类

package cn.edu.tsinghua.universityOrganization;

import cn.edu.tsinghua.universityOrganization.J_Employee_P;

public class J_Teacher_P extends J_Employee_P
//继承J_Employee类
{
	//成员域
	public int m_classHour; // 授课的课时
	
	//构造方法
	public J_Teacher_P()
	{
		m_classHour = 96;
	} // J_Teacher构造方法结束
	
	//成员方法
	public void mb_printInfo()
	{
		System.out.println("该教师的工作年限为"+m_workYear);
		System.out.println("该教师的授课的课时为"+m_classHour);
	} // 方法mb_printInfo结束 
	
	/*
	//main方法
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Teacher tom = new J_Teacher();
		tom.mb_printInfo();
		// /////////////////////////////////////////////////////////////////////////////////
		J_Employee oldWang = tom;//将子类转为父类不需要强制类型转换()
		System.out.println("王师傅的工作年限为"+oldWang.m_workYear);
		J_Teacher luoSir = (J_Teacher)oldWang;//父类转子类必须要有
		System.out.println("How about 罗sir??");
		luoSir.mb_printInfo();
		System.out.println("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
	*/
	
} //类 J_Teacher 结束