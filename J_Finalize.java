// ////////////////////////////////////////////
//
// J_Finalize.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			实例对象生命周期程序例程
// ////////////////////////////////////////////
// 定义了一个J_Finalize类
class J_Book
{
	public int m_id;//书的编号
	
	public J_Book(int i){
		m_id = i;
	}//J_Book构造方法结束
	
	//域修饰符
	protected void finalize(){
		switch (m_id)
		{
			case 1:
				System.out.print("《飘》");
				break;
			case 2:
				System.out.print("《Java程序设计教程》");
				break;
			case 3:
				System.out.print("《罗马假日》");
				break;
			default:
				System.out.print("未知书籍");
				break;
		}//switch 语句结束
		System.out.println("所对应的实例对象存储单元被回收");
	} // 方法 finalize 结束	
} // 方法 J_Book 结束


public class J_Finalize 
//类修饰符 class 类名 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
	
		J_Book book1 = new J_Book(1);
		//book1 对应的内存会在程序运行结束之后才回收,java自动机一般不会调用这个实例对象的finalize成员方法
		new J_Book(2);
		new J_Book(4);
		System.gc();
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Finalize 结束
/*
output:
Java,Hello!
我会成为优秀的Java程序员，优秀的Android软件工程师!
《罗马假日》所对应的实例对象存储单元被回收
《Java程序设计教程》所对应的实例对象存储单元被回收
*/