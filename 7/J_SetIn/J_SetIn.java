// ////////////////////////////////////////////
//
// J_SetIn.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�ض�������
// ////////////////////////////////////////////
import java.io.FileInputStream;


// ������һ��J_SetIn��
public class J_SetIn 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			System.setIn(new FileInputStream("test.txt"));//��System.in���new FileInputStream("test.txt")
			//���java��Ҫ�����һ��С�ļ�(֮ǰ���Ǹ�J_Echo.java)
			J_Echo.mb_echo(System.in);
		}
		catch(Exception e)
		{
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch ����
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_SetIn ����
/*
����:
D:\UE\Java\��7�� �ļ���������\J_SetIn>javac J_Echo.java

D:\UE\Java\��7�� �ļ���������\J_SetIn>javac J_SetIn.java

D:\UE\Java\��7�� �ļ���������\J_SetIn>java J_SetIn


OUTPUT:
Java,Hello!
J_SetIn and J_Echo
(o�b���b)o��[BINGO!]
//�����������test.txt�ڵ�����
*/