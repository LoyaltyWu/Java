// ////////////////////////////////////////////
//
// J_Practice_1.java
//
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			简单招呼程序例程
// ////////////////////////////////////////////
// 定义了一个J_Practice_1类
public class J_Practice_1
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line
		char [] c;
		char c1 [];

		char [] a,b,c2;//3个字符数组
		char a1[],b1[],c3[];//3个字符数组

		c = new char [5];
		// 将新创建字符数组对象的引用 赋值给数组变量

		char [] c4 = new char [5];
		//直接初始化开始

		char [] c5 = {'a','b','c','d','e'};

		String [] s = new String [3];
		s[0] = new String ("aaa");
		s[1] = new String ("bbb");
		s[2] = new String ("ccc");

		String [] s1 = { new String ("aaaa"), new String ("bbbb"), new String ("cccc")};

		int [][] matrix;

		matrix = new int [2][3];//2行3列
		System.out.println("matrix.length : "+matrix.length);
		System.out.println("matrix[0].length : "+matrix[0].length);
		int [][][] matrix3D = new int [3][][];//3行

		matrix3D[0] = new int [2][];//2列
		matrix3D[1] = new int [3][];//3列
		matrix3D[2] = new int [2][];//2列

		matrix3D[0][0]=new int [4];
		matrix3D[0][1]=new int [4];

		matrix3D[1][0]=new int [4];
		matrix3D[1][1]=new int [4];
		matrix3D[1][2]=new int [4];

		matrix3D[2][0]=new int [4];
		matrix3D[2][1]=new int [4];

		//这样可以吗??是可以的
		int [][][] M3D = new int [2][3][4];
		String s2 = new String("It can't be!");
		String s3 = s2.substring(0,1);//输出I
		System.out.println(s3);
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Practice_1 结束