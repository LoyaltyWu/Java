// ////////////////////////////////////////////
//
// J_PrintStream.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			PrintStream ����
// ////////////////////////////////////////////
import java.io.PrintStream;
import java.io.FileNotFoundException;


// ������һ��J_PrintStream��
public class J_PrintStream
{
	public static void main (String args[])
	{
		try
		{
			PrintStream f = new PrintStream("out.txt");
			f.printf("%1$d+%2$d=%3$d",1,2,(1+2));
			f.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch �ṹ����
	} // ���� main ����
} // �� J_PrintStream ����