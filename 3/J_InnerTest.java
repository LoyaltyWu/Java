// ////////////////////////////////////////////
//
// J_InnerTest.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			实名(相对于匿名)内部类 程序例程
// ////////////////////////////////////////////
// 定义了一个J_InnerTest类

class J_Test
{
	int m_dataOuter = 1;
	static int m_dataOutStatic = 2;
	
	
	/*
	在外部类中:
	可以: J_Inner b;//来定义一个J_Inner变量b
	在外部类以外的其他类中可以:
	J_Test.J_Inner b;//来定义一个J.test.J_Inner变量b
	*/
	
	
	
	//实名内部类有
	//1.static实名内部类
	//2.非static实名内部类
	class J_Inner
	{
		int m_data;
		static final int m_dataStatic = 4;
		//对于内部类,若它的成员域具有static属性,那么它也必须具有final属性
		
		
		public J_Inner()
		{
			m_data = 3;
		} // J_Inner 构造方法结束
		
		//不具有static属性的实名内部类不能具有不能含有static的成员方法
		public void mb_method()
		{
			System.out.println("m_dataOuter="+m_dataOuter);
			System.out.println("m_dataOuterStatic"+m_dataOutStatic);
			System.out.println("m_data="+m_data);
			System.out.println("m_dataStatic="+m_dataStatic);
			mb_methodOuter();
		} // 方法 mb_method 结束
	} // 内部类 J_Inner 结束
	
	public void mb_methodOuter()
	{
		System.out.println("mb_methodOuter");
	} // 方法 mb_methodOuter 结束
}


public class J_InnerTest 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Test a = new J_Test();
		J_Test.J_Inner b = a.new J_Inner();
		b.mb_method();
		//J_Test.J_Inner c = new J_Test.J_Inner();//用在静态实名内部类就可以
		/*
		**********************************************************************
		实名内部类的创建方法:
		
		static:
		new outer.inner();
		
		non-static:
		outer a = new outer();
		outer.inner b = a.new inner();
		**********************************************************************
		对实名内部类的成员域和成员方法的访问方式:
		#define a 表达式
		static inner named class
			mb:
  			static member:
  				outer.inner.mb_static;
  			non-static member:
  				a.mb;
  		mb_Method:
  			static method:
  				Outer.Inner.mb_methodStatic();
  			non-static method:
  				a.mb_method();
		non-static inner named class
			mb:
				static member:
					outer.inner.mb_static;//同时一定具有final属性
				non_static member:
					a.mb;
			mb_Method:
				static method:XXXXXXXXXXXXXX
				XXXXXXXXXXXXXXXXXXXXXXXXXXXXouter.inner.mb_methodStatic();
				//non-static inner named class could not hava static method
				
				non-static method:
					a.mb_method();
				
		
		*/
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_InnerTest 结束

/*
OUTPUT：
Java,Hello!
m_dataOuter=1
m_dataOuterStatic2
m_data=3
m_dataStatic=4
mb_methodOuter
*/