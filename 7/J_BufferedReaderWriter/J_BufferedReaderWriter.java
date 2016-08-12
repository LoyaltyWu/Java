// ////////////////////////////////////////////
//
// J_BufferedReaderWriter.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�������д������
// ////////////////////////////////////////////
import java.io.BufferedWriter;
// ������Ķ���
// ���� ������������������..
import java.io.FileReader;
// �Ķ���
import java.io.FileWriter;
// ��д��..
import java.io.IOException;
import java.io.LineNumberReader;
// �����ʲô.... �̳��� BufferedWriter �����г�Ա����
// ���ṩ��ȡ�кŵĳ�Ա����.. public int getLineNumber()//�����к�..
// д���зָ�����Ҳ��..
import java.util.Date;
// ����importһ��Date,���ִ���ٶ�


// ������һ��J_BufferedReaderWriter��
public class J_BufferedReaderWriter 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			// ������Ķ�д��
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			bw.write("��־��,�¾���");
			bw.newLine();//from LineNumberReader
			bw.write("������,�첻��");
			bw.newLine();//from LineNumberReader
			bw.close();
			
			Date n1 = new Date();
			LineNumberReader br = new LineNumberReader(new FileReader ("test.txt"));
			String s;
			for (s = br.readLine(); s!=null; s = br.readLine())
			{
				System.out.println(br.getLineNumber() + ": " + s);
			}
			br.close();
			Date n2 = new Date();
			
			Date n3 = new Date();
			FileReader f_in = new FileReader("test.txt");
			for (int c = f_in.read(); c!=-1; c=f_in.read())
			{
				System.out.print((char) c);
			}
			f_in.close();
			Date n4 = new Date();
			
			long t = n2.getTime() - n1.getTime();
			// �ǵ�Ҫ����.getTime()
			System.out.printf("���������ʱΪ%1$dms%n",t);
			t = n4.getTime() - n3.getTime();
			System.out.printf("�����������ʱΪ%1$dms%n",t);
		}
		catch (Exception e)
		{
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch �ṹ����
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_BufferedReaderWriter ����
/*
Java,Hello!
1: ��־��,�¾���
2: ������,�첻��
��־��,�¾���
������,�첻��
���������ʱΪ16ms
�����������ʱΪ0ms
(o�b���b)o��[BINGO!]
*/