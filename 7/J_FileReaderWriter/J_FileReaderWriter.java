// ////////////////////////////////////////////
//
// J_FileReaderWriter.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�ļ���д������
// ////////////////////////////////////////////
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;


// ������һ��J_FileReaderWriter��
public class J_FileReaderWriter 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			FileWriter f_out = new FileWriter("test.txt");
			f_out.write("��־��,�¾���");
			f_out.close();
			
			FileReader f_in = new FileReader("test.txt");
			for (int c = f_in.read(); c!=-1; c=f_in.read())
			{
				System.out.print((char) c);
			}
			f_in.close();
		}
		catch (Exception e)
		{
			System.err.println("�����쳣:" + e);
			e.printStackTrace();
		}
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_FileReaderWriter ����
/*
Java,Hello!
��־��,�¾���(o�b���b)o��[BINGO!]
*/
/*
ûʲô���������...
���ִ�����Ķ�д�������Ǵ�������..����дIOBuffer���Ǹ�..
����һ��������˵�Ķ������нϺ�֧��..
*/