// ////////////////////////////////////////////
//
// J_Data.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			数据输入流 (DataInputStream) 和
// 			数据输出流 (DataOutputStream) 例程
// ////////////////////////////////////////////
// import java.io.IOException; 
//这次不用这个有可能是因为是先写了个新文件再弄所以不存在"文件找不到"的问题
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


// 定义了一个J_Data类
public class J_Data 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		try 
		{
			
			FileOutputStream fout = new FileOutputStream("out.txt");
			DataOutputStream dfout = new DataOutputStream(fout);
			//                                         		^^^^ 重名了喂,一般不是用System.out吗?
			// 实际上没有重名的问题
			// 就是从这个流这边进行输入输出的,为什么要额外用这个DataIOStream呢??
			// 1.															初步的想法是FileIOStream没有额外的像ReadInt这样的方法
			// 					而DataIOStream有很多特殊处理输入输出流的方法,而后来查了下docs里面也的确是这样.
			// 2.		至于有没有别的原因我不是很清楚...															
			int i;
			for (i = 0;i<4;i++)
			{
				dfout.writeInt('0'+i);
				//若是FileOutputStream则没有这样的方法;
			}
			dfout.close();
			
			
			FileInputStream fin = new FileInputStream ("out.txt");
			DataInputStream dfin = new DataInputStream (fin);
			//                                          ^^^ 重名了喂,一般不是用System.in吗?
			// 实际上没有重名的问题
			// 就是从这个流这边进行输入输出的,为什么要额外用这个DataIOStream呢??
			// 1.															初步的想法是FileIOStream没有额外的像ReadInt这样的方法
			// 					而DataIOStream有很多特殊处理输入输出流的方法,而后来查了下docs里面也的确是这样.
			// 2.		至于有没有别的原因我不是很清楚...
			for (i=0;i<4;i++)
			{
				System.out.print(dfin.readInt()+", ");
				//System.out.print(dfin.readShort()+", ");
			}
			dfin.close();
		}
		catch(Exception e)
		{
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		}
		System.out.println();
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_Data 结束
/*
Java,Hello!
48, 49, 50, 51,
(o゜▽゜)o☆[BINGO!]
//////////////////////////////////////////////////////已验证
//然而如果是把dfin.readInt()改为readShort的话输出的会是:
Java,Hello!
0, 48, 0, 49,
(o゜▽゜)o☆[BINGO!]
*/