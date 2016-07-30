// ////////////////////////////////////////////
//
// J_CastExample.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			数据类型转换例程
// ////////////////////////////////////////////
// 定义了一个J_CastExample类
// 包括了2.2节的笔记
public class J_CastExample 
{
	public static void main (String args[])
	{
		//在例程之前先举一些栗子
		//一些直接量的栗子
		//单个字符'j'
		char cha = 'a';
		char chb = 'b';
		char chc = '猫';
		System.out.println((char)cha + (char)chb + (char)chc);			
		//''括起来的Unicode字符,用反斜杠u引导后面是4位16进制数字整数
		char unicode0 = '\u0061';
		char unicode1 = '\u0051';
		char unicode2 = '\u005a';
		System.out.println(unicode0+unicode1+unicode2);
		//转移字符''
		char z1 = '\b';//退格
		char z2 = '\f';//换页
		char z3 = '\n';//换行
		char z4 = '\r';//回车
		char z5 = '\t';//制表符
		char z6 = '\'';//单引号
		char z7 = '\"';//双引号
		char z8 = '\\';//反斜杠
		
		//八进制数
		int oct1 = '\0';  //对应由0
		int oct2 = '\377';//对应到255
		//?????是int呢还是char ???
		//八进制数
		
		//十进制数
		int dec1 = 12;
		int dec2 = 7;
		//八进制数
		int oct01 = 012;//which is 10 in decimal
		int oct02 = -0123;//which is -83 in decimal
		//十六进制
		int hex1 = 0xABc;//-2748 in decimal
		int hex2 = 0XaD;//173 in decimal
		//长整数直接量
		long dragon = -7L;//跟着L
		long oct3 = 0123L;//83 in decimal
		long hex3 = 0x123L;//291 in decimal
		//单精度浮点型直接量
		float f1 = 0.1f;
		float f2 = .1f;
		float f3 = -.05e3f;//??????????????????????????
		//What is this ??
		float f4 = 5.e3f;//??????????????????????????
		float f5 = 5.e-010f;//??????????????????????????
		//双精度浮点数
		double d1 = 0.1;
		double d2 = 100d;
		double d3 = -5.e3;//??????????????????????????
		double d4 = 5.0e-1d;//??????????????????????????
		//直接量null
		
		
		//Java 变量有4个基本属性: 变量名,数据类型,存储单元,变量值
		int studentNumber;					// 定义变量 studentNumber
		double velocity, distance;  // 定义变量 velocity 和 distance
		int m_radius = 5;						// 定义变量 m_radius 并赋值 5 
		//相当于 int m_radius; m_radius = 5;
		/*
																强弱关系
		
		byte < short  \
		               } < int < long < float < double
		        char  /
		*/
		
		double d = 1.60; // d = 1.60
		int i = (int) d; // i = 1
		int anotherI = (int)(d+0.5);//这时i为2
		d = i;
		//和
		d = (double) i;
		//一样的
		
		// ***********************************************************************************
		// ***********************************************************************************
		// **********************************分界线*******************************************
		// ***********************************************************************************
		// ***********************************************************************************
		
		// 数据类型转换例程
		
		short a = 100;
		long b = a;
		
		
		System.out.println("类型转换:短整形"+a+"变成长整形:"+b);
		b = 123456789L;
		a = (short) b;					//显式类型转换，强制类型转换
		System.out.println("类型转换:长整形"+b+"变成短整形:"+a);
	
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_CastExample 结束