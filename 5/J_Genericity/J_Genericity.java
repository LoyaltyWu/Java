// ////////////////////////////////////////////
//
// J_Genericity.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			具有多父类型的类型变量泛型例程
// ////////////////////////////////////////////
// 类 J_C1 
class J_C1
{
	public void mb_methodA()
	{
		System.out.print("A");
	} // 方法mb_methodA结束
} // 类 J_C1 结束

//接口 J_C2
interface J_C2
{
	public void mb_methodB();
} // 接口 J_C2 结束

class J_C3 extends J_C1 implements
{
	public void mb_methodB()
	{
		System.out.print("B");
	}
}

// 类 J_T 
class J_T <T extends J_C1 & J_C2>
{
	public void mb_methodT(T t)
	{
		t.mb_methodA();
		t.mb_methodB();
	} // 方法 mb_methodT 结束
} // 类 J_T 结束

// 定义了一个J_Genericity类
public class J_Genericity
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_T<J_C3> A = new J_T<J_C3>();
		A.mb_methodT( new J_C3() );
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Genericity 结束