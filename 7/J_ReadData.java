// ////////////////////////////////////////////
//
// J_ReadData.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			从控制窗口读入数据例程
// ////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.InputStreamReader;
//用的都是读写器
// 定义了一个J_ReadData类
public class J_ReadData 
{
	public static void mb_printInfo()
	{
		System.out.println("输入整数还是浮点数?");
		System.out.println("\t0: 退出; 1: 整数; 2: 浮点数");
	} // 方法 mb_printInfo 结束
	
	// 接受整数输入
	public static int mb_getInt(BufferedReader f)
	// BufferedReader 带缓存的读入器
	{
		try
		{
			String s = f.readLine();
			int i = Integer.parseInt(s);
			//什么方法来的...
			//先以String的形式读入再转成int的样子
			return i;
		}
		catch (Exception e)
		{
			return -1;
		} // try-catch 结构结束
	} // 方法 mb_getInt 结束
	
	// 接受浮点数输入
	public static double mb_getDouble(BufferedReader f)
	// BufferedReader 带缓存的读入器
	{
		try
		{
			String s = f.readLine();
			double d = Double.parseDouble(s);
			//先以String的形式读入再转成double的样子
			return d;
		}
		catch (Exception e)
		{
			return -1;
		} // try-catch 结束
	} // 方法 mb_getDouble 结束
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		int i;
		double d;
		try
		{
			BufferedReader f = new BufferedReader(new InputStreamReader (System.in));
			//第一层.StringReader流读入器录入键盘输入
			//第二层形成带缓存型读入器
			do 
			{
				mb_printInfo();
				//提示
				i = mb_getInt(f);
				if (i==0)
				{
					break;
				}
				else if (i==1)
				{
					System.out.println("\t请输入整数: ");
					i = mb_getInt(f);
					//一直用着一个流的意思??
					System.out.println("\t输入整数: " + i);
				}
				else if (i==2)
				{
					System.out.println("请输入浮点数: ");
					d = mb_getDouble(f);
					System.out.println("\t输入浮点数: "+d);
				}
			}
			while (true); // do-while 结束
			f.close();
		}
		catch (Exception e)
		{
			System.err.println("发生异常:" + e);
			e.printStackTrace();
		} // try-catch 结构结束
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_ReadData 结束
/*
OUTPUT:

Java,Hello!
输入整数还是浮点数?
        0: 退出; 1: 整数; 2: 浮点数
1
        请输入整数:
328.2
        输入整数: -1
输入整数还是浮点数?
        0: 退出; 1: 整数; 2: 浮点数
1
        请输入整数:
18
        输入整数: 18
输入整数还是浮点数?
        0: 退出; 1: 整数; 2: 浮点数
2
请输入浮点数:
65.78
        输入浮点数: 65.78
输入整数还是浮点数?
        0: 退出; 1: 整数; 2: 浮点数
0
(o゜▽゜)o☆[BINGO!]
*/