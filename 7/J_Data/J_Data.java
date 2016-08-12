// ////////////////////////////////////////////
//
// J_Data.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���������� (DataInputStream) ��
// 			��������� (DataOutputStream) ����
// ////////////////////////////////////////////
// import java.io.IOException; 
//��β�������п�������Ϊ����д�˸����ļ���Ū���Բ�����"�ļ��Ҳ���"������
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


// ������һ��J_Data��
public class J_Data 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try 
		{
			
			FileOutputStream fout = new FileOutputStream("out.txt");
			DataOutputStream dfout = new DataOutputStream(fout);
			//                                         		^^^^ ������ι,һ�㲻����System.out��?
			// ʵ����û������������
			// ���Ǵ��������߽������������,ΪʲôҪ���������DataIOStream��??
			// 1.															�������뷨��FileIOStreamû�ж������ReadInt�����ķ���
			// 					��DataIOStream�кܶ����⴦������������ķ���,������������docs����Ҳ��ȷ������.
			// 2.		������û�б��ԭ���Ҳ��Ǻ����...															
			int i;
			for (i = 0;i<4;i++)
			{
				dfout.writeInt('0'+i);
				//����FileOutputStream��û�������ķ���;
			}
			dfout.close();
			
			
			FileInputStream fin = new FileInputStream ("out.txt");
			DataInputStream dfin = new DataInputStream (fin);
			//                                          ^^^ ������ι,һ�㲻����System.in��?
			// ʵ����û������������
			// ���Ǵ��������߽������������,ΪʲôҪ���������DataIOStream��??
			// 1.															�������뷨��FileIOStreamû�ж������ReadInt�����ķ���
			// 					��DataIOStream�кܶ����⴦������������ķ���,������������docs����Ҳ��ȷ������.
			// 2.		������û�б��ԭ���Ҳ��Ǻ����...
			for (i=0;i<4;i++)
			{
				System.out.print(dfin.readInt()+", ");
				//System.out.print(dfin.readShort()+", ");
			}
			dfin.close();
		}
		catch(Exception e)
		{
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		}
		System.out.println();
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Data ����
/*
Java,Hello!
48, 49, 50, 51,
(o�b���b)o��[BINGO!]
//////////////////////////////////////////////////////����֤
//Ȼ������ǰ�dfin.readInt()��ΪreadShort�Ļ�����Ļ���:
Java,Hello!
0, 48, 0, 49,
(o�b���b)o��[BINGO!]
*/