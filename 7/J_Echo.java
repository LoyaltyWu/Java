// ////////////////////////////////////////////
//
// J_Echo.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			����(Echo)����
// ////////////////////////////////////////////
import java.io.InputStream;
import java.io.IOException;


// ������һ��J_Echo��
public class J_Echo
{
	public static void mb_echo(InputStream in)
	{
		try
		{
			while (true)
			{
				int i = in.read();
				if (i==-1)
				{
					break;
				}
				char c = (char) i;
				System.out.print(c);
			} // while ѭ������
		}
		catch (IOException e)
		{
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch ����
		System.out.println();
	} // ���� mb_echo ����
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		mb_echo(System.in);
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Echo ����