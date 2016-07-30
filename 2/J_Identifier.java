// ////////////////////////////////////////////
//
// J_Identifier.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			判断一个字符是否可以做 Java 标识符的起始字符或后续字符的例程
// ////////////////////////////////////////////
// 定义了一个J_Identifier类
public class J_Identifier 
{
	public static void main (String args[])
	{
		char c = '猫';
		//'猫'在C++中并不是只占一个字符位而是需要一个2单位的字符数组才能装下'猫'字符
		//而在 Java 中只需要一个char位
		// Java 字符集合采用Unicode字符集有关
		if(Character.isJavaIdentifierStart(c)){
			System.out.println("字符\'"+c+"\'可以做标识符的首字符");//System.out.println("字符\'"+c+"\'可以做标识符的首字符");
		}
		else{
			System.out.println("字符\'"+c+"\'不可以做标识符的首字符");
		}
		if(Character.isJavaIdentifierPart(c)){
			System.out.println("字符\'"+c+"\'可以做标识符除首字符以外的组成字符");
		}
		else{
			System.out.println("字符\'"+c+"\'不可以做标识符除首字符以外的组成字符");
		}
	} // 方法 main 结束
} //类 J_Identifier 结束
//这里用的是java.lang.Character的2个静态成员方法
// public static boolean isJavaIdentifierStart (char ch)
// public static boolean isJavaIdentifierPart (char ch)


/*
基本数据类型：boolean、char、byte、short、int、long、float、double
引用数据类型：class、interface(接口类型)、enum、array

Java 字符集合采用Unicode字符集有关

标识符(identifier)
用于标识文件名、变量名、类名、接口名和成员方法名等
**************************************************************
identifier 由 Java 字母(推荐只用英文字母和'_')和 Java 数字组成
(除关键字和false,true,null)
false,true,null是 Java 直接量
**************************************************************
Java 直接量
直接表示数值而不含运算的表达式


关键字(keyword)
Java 语言保留的一些英文单词，有特殊含义




*/