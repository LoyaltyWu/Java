// ////////////////////////////////////////////
//
// J_WeakHashMap.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			类WeakHashMap会自动去掉一些"不常用"元素(关键字及对应的值)的例程
// ////////////////////////////////////////////
// 定义了一个J_WeakHashMap类
import java.util.WeakHashMap;

public class J_WeakHashMap 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int s = 800;
		WeakHashMap<String, String> ht = new WeakHashMap <String,String>(s*4/3,0.75f);
		
		
		// 给WeakHashMap实例对象添加元素
		int i;
		for (i = 0;i<s;i++){
			ht.put(("key"+i),("value"+i));//元素关键字,元素的值
		}
		System.out.println("在刚刚添加完数据时,弱哈希表个数是:"+ht.size());
		
		// 运行的结果是从第一个元素开始,他就已经不再弱哈希表中了。。
		// 输出已经不再WeakHashMap实例对象中的元素；否则,等待弱哈希表删除元素
		System.out.println("一段时间后,弱哈希表元素个数是:"+ht.size());
		
		System.out.println("一段时间后,弱哈希表元素个数是:"+ht.size());
		for(i = 0;i<s;){
			if (!ht.containsKey("key"+i))
				//System.out.print("key"+i);
			if (ht.size()!=s)
				i++;
		} // 循环结束	
		System.out.println("");
		System.out.println("一段时间后,弱哈希表元素个数是:"+ht.size());
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_WeakHashMap 结束