// ////////////////////////////////////////////
//
// J_PrintWriter.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���к���������
// ////////////////////////////////////////////
import java.io.PrintWriter;
import java.io.FileNotFoundException;


// ������һ��J_PrintWriter��
public class J_PrintWriter 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			PrintWriter f = new PrintWriter("out.txt");
			f.println("Ī����,��������ͷ,�ձ���.");
			f.close();
		}
		catch (Exception e)
		{
			System.err.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch �ṹ����
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_PrintWriter ����