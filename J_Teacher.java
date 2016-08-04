// ////////////////////////////////////////////
//
// J_Teacher.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			职工和教师之间的继承性程序例程
// ////////////////////////////////////////////
// 定义了一个J_Teacher类
class J_Employee
{
	public int m_workYear;
	
	public J_Employee()
	{
		m_workYear = 1;
	} // J_Employee构造方法结束
} // 类J_Employee结束

public class J_Teacher extends J_Employee
//继承J_Employee类
{
	//成员域
	public int m_classHour; // 授课的课时
	
	//构造方法
	public J_Teacher(){
		m_classHour = 96;
	} // J_Teacher构造方法结束
	
	//成员方法
	public void mb_printInfo()
	{
		System.out.println("该教师的工作年限为"+m_workYear);
		System.out.println("该教师的授课的课时为"+m_classHour);
	} // 方法mb_printInfo结束 
	
	
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
		/////////////////////////////////////////////////////////////////////////////////
		System.out.println("Error Testing");
		/*
		实际output:
		Exception in thread "main" java.lang.ClassCastException: 
		J_Employee cannot be cast to J_Teacher at J_Teacher.main(J_Teacher.java:56)
		*/
		//J_Employee a = new J_Employee();
		//J_Teacher b = (J_Teacher) a;
		/////////////////////////////////////////////////////////////////////////////////
		J_Teacher a = new J_Teacher();
		J_Employee b =new J_Employee();
		J_Employee c = a;//子类强制转换成父类无需()
		System.out.println("J_Teacher a = new J_Teacher();");
		if(a instanceof J_Teacher ){
			System.out.println("a is a instance of J_Teacher.");
		}else {
			System.out.println("a is not a instance of J_Teacher.");
		}
		if(a instanceof J_Employee ){
			System.out.println("a is a instance of J_Employee.");
		}else {
			System.out.println("a is not a instance of J_Employee.");;
		}
		System.out.println();System.out.println();System.out.println();
		System.out.println("J_Employee c = a;//子类强制转换成父类无需()");
		if(c instanceof J_Teacher ){
			System.out.println("c is a instance of J_Teacher.");
		}else {
			System.out.println("c is not a instance of J_Teacher.");
		}
		if(c instanceof J_Employee ){
			System.out.println("c is a instance of J_Employee.");
		}else {
			System.out.println("c is not a instance of J_Employee.");
		}
		System.out.println();System.out.println();System.out.println();
		System.out.println("J_Employee b =new J_Employee();");
		if(b instanceof J_Teacher ){
			System.out.println("b is a instance of J_Teacher.");
		}else {
			System.out.println("b is not a instance of J_Teacher.");
		}
		if(b instanceof J_Employee ){
			System.out.println("b is a instance of J_Employee.");
		}else {
			System.out.println("b is not a instance of J_Employee.");
		}
		System.out.println();System.out.println();System.out.println();
		b = (J_Teacher) a;
		System.out.println("b = (J_Teacher) a;");
		if(b instanceof J_Teacher ){
			System.out.println("b is a instance of J_Teacher.");
		}else {
			System.out.println("b is not a instance of J_Teacher.");
		}
		if(b instanceof J_Employee ){
			System.out.println("b is a instance of J_Employee.");
		}else {
			System.out.println("b is not a instance of J_Employee.");
		}
		
	} // 方法 main 结束
} //类 J_Teacher 结束