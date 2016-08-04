// ////////////////////////////////////////////
//
// J_University_P.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			Package例程——Main Programme Part
// ////////////////////////////////////////////
// 定义了一个J_University_P类

import cn.edu.tsinghua.universityOrganization.J_Employee_P;

import cn.edu.tsinghua.universityOrganization.J_Teacher_P;

public class J_University_P 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Employee_P a = new J_Employee_P();
		a.mb_printInfo();
		a = new J_Teacher_P();
		a.mb_printInfo();
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_University_P 结束


/*
整个编译命令依次为:
javac -d . J_Employee_P.java
javac -d . J_Teacher_P.java
javac J_University_P.java
执行命令是:
java J_University

OUTPUT:

Java,Hello!
该职工的工作年限1
该教师的工作年限为1
该教师的授课的课时为96

*/