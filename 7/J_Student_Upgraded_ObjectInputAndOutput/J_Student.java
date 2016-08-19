// ////////////////////////////////////////////
//
// J_Student.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			Upgrade以后的J_Student对象输出输入例程
// ////////////////////////////////////////////
import java.io.Serializable;
// 定义了一个J_Student类
public class J_Student implements Serializable
{
	static final long serialVersionUID = 123456L;
	// 当前类的序列号
	String m_name;
	int m_id;
	int m_height;
	int m_weight;
	
	// J_Student 构造方法开始
	public J_Student(String name, int id, int h)
	{
		m_name = name;
		m_id = id;
		m_height = h;
	} // J_Student 构造方法结束
	
	// mb_output 成员方法开始
	public void mb_output()
	{
		System.out.println("姓名: " + m_name);
		System.out.println("学号: " + m_id);
		System.out.println("身高: " + m_height);
	} // mb_output 成员方法结束
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Student 结束