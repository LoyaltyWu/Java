// ////////////////////////////////////////////
//
// J_RandomAccessFile.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��������ļ�����
// ////////////////////////////////////////////
import java.io.IOException;
import java.io.RandomAccessFile;


// ������һ��J_RandomAccessFile��
public class J_RandomAccessFile 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			RandomAccessFile f = new RandomAccessFile("test.txt", "rw");
			int 		i;
			double 	d;
			for (i = 0;i<10;i++)
			{
				f.writeDouble(Math.PI*i);
			}
			f.seek(16);
			// seek �൱���ļ�ָ�������.setȥ�ĸ�λ��,��ֱ�Ӵ��Ǹ�λ�ÿ�ʼ
			// �ӵ���byteΪ��λ
			f.writeDouble(0);
			f.seek(0);
			// setȥ�ļ���ͷ��...
			for (i = 0;i<10;i++)
			{
				d = f.readDouble();
				System.out.println("["+i+"]: "+d);
			} // for ѭ��
		}
		catch (IOException e)
		{
			System.err.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch �ṹ����
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_RandomAccessFile ����