// ////////////////////////////////////////////
//
// J_Write.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���������
// ////////////////////////////////////////////
import java.io.IOException;
import java.io.OutputStream;


// ������һ��J_Write��
public class J_Write 
{
	public static void mb_write(OutputStream out)
	{
		String s = "���������";
		byte [] b = s.getBytes();
		try
		{
			out.write(b);
			out.flush();
		}
		catch (IOException e)
		{
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch �ṹ����
	} // ���� mb_write ����
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		mb_write(System.out);
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Write ����