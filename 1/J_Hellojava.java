// ////////////////////////////////////////////
//
// J_Hellojava.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			简单招呼程序例程
// ////////////////////////////////////////////
// 这里实际上隐藏了一个import System 类的语句但是System是可以自动导入的
// 所以不写出来也没关系
// 定义了一个J_Hellojava类

public class J_Hellojava
{
	public static void main(String args[])
	//static 静态的话，对那些要经常调用的方法还是用一下比较好，就那个什么申请内存的时间也不短，多了也不好。
	//
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		System.out.println("我会成为优秀的Java程序员，优秀的Android软件工程师!");		//所以实际上,不用加上换行符就能分两行显示了。
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Hellojava 结束
/*后面是绪论的笔记*/
/*
System.out
/*out是System类的"成员域"/*其他语言中称为"成员变量"
*/

/*
DOS command:
javac J_Hellojava.java
java J_Hellojava
//第一步是编译发现public,p不能大写,第二是String的S要大写
//记住 执行的时候不用加CLASS!!!!!!

Output:
Java,Hello!
我会成为优秀的Java程序员，优秀的Android软件工程师!
*/