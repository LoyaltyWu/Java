// ////////////////////////////////////////////
//
// J_Teacher_re.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			职工与教师之间的动态多态性例程
// ////////////////////////////////////////////
// 动态多态性只针对非静态的成员方法!!!!!!
// 定义了一个J_Teacher_re类
class J_Employee
{
	public int m_workYear;
	
	public J_Employee()
	{
		m_workYear = 1;
	} // J_Employee构造方法结束
	
	public void mb_printInfo()
	{
		System.out.println("该职工的工作年限为"+m_workYear);
	} // 方法mb_printInfo结束 //第1个mb_printInfo()
	
} // 类J_Employee结束

public class J_Teacher_re extends J_Employee
//继承J_Employee类
{
	//成员域
	public int m_classHour; // 授课的课时
	
	//构造方法
	public J_Teacher_re(){
		m_classHour = 96;
	} // J_Teacher构造方法结束
	
	//成员方法
	public void mb_printInfo()
	{
		System.out.println("该教师的工作年限为"+m_workYear);
		System.out.println("该教师的授课的课时为"+m_classHour);
	} // 方法mb_printInfo结束  //第2个mb_printInfo()
	
	
	//main方法
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		J_Employee oldWang = new J_Employee();
		oldWang.mb_printInfo();
		oldWang = new J_Teacher_re();
		oldWang.mb_printInfo();
		System.out.println();System.out.println();System.out.println();
		J_Teacher_re tom = new J_Teacher_re();
		tom.mb_printInfo();
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Teacher_re 结束

// ////////////////////////////////////////////
// 关于super关键字的笔记
// super相对this
// this访问的是当前类的(成员域,构造方法,成员方法)
// super访问的是其父类的(成员域,构造方法,成员方法)
// ////////////////////////////////////////////
// super.父类成员域
// super.父类成员方法
// super(父类构造方法的调用参数列表)
// ////////////////////////////////////////////