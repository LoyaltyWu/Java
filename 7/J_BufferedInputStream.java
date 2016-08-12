// ////////////////////////////////////////////
//
// J_BufferedInputStream.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���벻������ �ڶ�ȡ����ʱ��Ч�ʵıȽ�����
// ////////////////////////////////////////////
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Date;
//Date���൱��C++��ctime��,�Ժ���Ϊ��λ


// ������һ��J_BufferedInputStream��
public class J_BufferedInputStream 
{
	private static String m_fileName = "J_BufferedInputStream.class";
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			int i, ch;
			i = 0;
			Date d1 = new Date();
			FileInputStream f = new FileInputStream (m_fileName);
			while ((ch=f.read()) != -1) // read entire file
			{
				i++;
			}
			f.close();
			Date d2 = new Date();
			
			
			long t = d2.getTime() - d1.getTime();
			System.out.printf("��ȡ�ļ�%1$s(��%2$d)%n",
				 m_fileName, i);
			System.out.printf("��������ķ�����Ҫ%1$dms%n",t);
			
			
			i = 0;
			d1 = new Date();
			f = new FileInputStream(m_fileName);
			BufferedInputStream fb = new BufferedInputStream(f);
		//^^^^^^^^										 ^^^^^^^^
			// ���˻����..
			while ((ch=fb.read()) != -1) // read entire file
			{
				i++;
			}
			fb.close();
			d2 = new Date();
			
			
			t = d2.getTime() - d1.getTime(); //��λ:ms
			System.out.printf("������ķ�����Ҫ%1$dms%n",t);
		}
		catch (Exception e)
		{
			System.err.println("�����쳣"+e);
			e.printStackTrace();
		} // try-catch ����
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_BufferedInputStream ����
/*
Java,Hello!
��ȡ�ļ�J_BufferedInputStream.class(��1938)
��������ķ�����Ҫ3ms
������ķ�����Ҫ0ms
(o�b���b)o��[BINGO!]
*/