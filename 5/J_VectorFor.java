// ////////////////////////////////////////////
//
// J_VectorFor.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			第1类 for 语句简化例程
// ////////////////////////////////////////////
import java.util.Iterator;
import java.util.Vector;


// 定义了一个J_VectorFor类
public class J_VectorFor 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		Vector <String> a = new Vector <String> ();
		a.add("a");
		a.add("b");
		a.add("c");
		
		//第一种for简化写法
		//这里就肯定只是用到Vector下的东西
		for (String c:a){
			System.out.print(c+", ");
		}
		System.out.println();
		//第一种简化for简化写法不用import Iterater也可以...
		//Vector内部就已经有迭代器了...
		//虽然是由下面的形式简化而来,但是实际上iterator的方法已经写在Vector里了..		
	
	
	
	
		//Vector自带iterator()方法呀,厉害...
		//还是说是提供给Iterator一个入口或者是初始化呢??	
		for(Iterator<String> i = a.iterator(); i.hasNext();){
			String c = i.next();
			System.out.print(c+", ");
		} // for 循环结束
		System.out.println();
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_VectorFor 结束