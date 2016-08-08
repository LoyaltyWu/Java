// ////////////////////////////////////////////
//
// J_Hashtable.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			通过哈希表形成数组下标与值之间的双向映射
// ////////////////////////////////////////////
// 定义了一个J_Hashtable类
import java.util.Hashtable;

public class J_Hashtable 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		String [] sa ={"Mary","Tom","John","James","Louis","Jim",
			"Rose","Ann","Lisa","Betty","Henry","Albert"};
		Hashtable <String ,Integer> ht = new Hashtable <String, Integer>();
		
		
		//哈希的原理是元素关键字和与该元素存储位置建立一种映射关系
		
		
		// 往哈希表中添加元素,并使得关键字与值之间建立起映射关系
		int i;
		for (i = 0;i<sa.length;i++){
			ht.put(sa[i],new Integer(i));
		}
		
		// 通过下标获得姓名(字符串值)
		i = 8;
		System.out.println("在 sa 数组中,下标为"+i+"的字符串是\""+sa[i]+"\"");
		//Lisa
		
		// 通过哈希表,直接获得的姓名(字符串值)的数组下标
		String s = sa[i];
		System.out.println("在 sa 数组中, \"" + s + "\"的下标是" + ht.get(s));
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Hashtable 结束