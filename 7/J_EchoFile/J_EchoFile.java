// ////////////////////////////////////////////
//
// J_EchoFile.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��ȡ�ļ�"test.txt"����
// ////////////////////////////////////////////
import java.io.FileInputStream;
import java.io.IOException;


// ������һ��J_EchoFile��
public class J_EchoFile 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try 
		{
			FileInputStream f = new FileInputStream("test.txt");
			int i;
			int b = f.read();
			for (i = 0;b!=-1;i++){
				System.out.print((char)b);
				b = f.read();
			} // for ѭ��
			System.out.println();
			System.out.println("�ļ�\"test.txt\"�ֽ���Ϊ"+i);
			f.close();
		}
		catch (IOException e)
		{
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch ����
		System.out.println();
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_EchoFile ����

/*
��test�ļ����ڵ�ʱ��::
Java,Hello!
�����쳣:java.io.FileNotFoundException: test.txt (ϵͳ�Ҳ���ָ�����ļ���)
java.io.FileNotFoundException: test.txt (ϵͳ�Ҳ���ָ�����ļ���)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at J_EchoFile.main(J_EchoFile.java:22)
        
���������:
Java,Hello!
C

�ļ�"test.txt"�ֽ���Ϊ3
//�س�����2���ַ�
*/