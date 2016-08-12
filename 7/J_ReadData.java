// ////////////////////////////////////////////
//
// J_ReadData.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�ӿ��ƴ��ڶ�����������
// ////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.InputStreamReader;
//�õĶ��Ƕ�д��
// ������һ��J_ReadData��
public class J_ReadData 
{
	public static void mb_printInfo()
	{
		System.out.println("�����������Ǹ�����?");
		System.out.println("\t0: �˳�; 1: ����; 2: ������");
	} // ���� mb_printInfo ����
	
	// ������������
	public static int mb_getInt(BufferedReader f)
	// BufferedReader ������Ķ�����
	{
		try
		{
			String s = f.readLine();
			int i = Integer.parseInt(s);
			//ʲô��������...
			//����String����ʽ������ת��int������
			return i;
		}
		catch (Exception e)
		{
			return -1;
		} // try-catch �ṹ����
	} // ���� mb_getInt ����
	
	// ���ܸ���������
	public static double mb_getDouble(BufferedReader f)
	// BufferedReader ������Ķ�����
	{
		try
		{
			String s = f.readLine();
			double d = Double.parseDouble(s);
			//����String����ʽ������ת��double������
			return d;
		}
		catch (Exception e)
		{
			return -1;
		} // try-catch ����
	} // ���� mb_getDouble ����
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int i;
		double d;
		try
		{
			BufferedReader f = new BufferedReader(new InputStreamReader (System.in));
			//��һ��.StringReader��������¼���������
			//�ڶ����γɴ������Ͷ�����
			do 
			{
				mb_printInfo();
				//��ʾ
				i = mb_getInt(f);
				if (i==0)
				{
					break;
				}
				else if (i==1)
				{
					System.out.println("\t����������: ");
					i = mb_getInt(f);
					//һֱ����һ��������˼??
					System.out.println("\t��������: " + i);
				}
				else if (i==2)
				{
					System.out.println("�����븡����: ");
					d = mb_getDouble(f);
					System.out.println("\t���븡����: "+d);
				}
			}
			while (true); // do-while ����
			f.close();
		}
		catch (Exception e)
		{
			System.err.println("�����쳣:" + e);
			e.printStackTrace();
		} // try-catch �ṹ����
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_ReadData ����
/*
OUTPUT:

Java,Hello!
�����������Ǹ�����?
        0: �˳�; 1: ����; 2: ������
1
        ����������:
328.2
        ��������: -1
�����������Ǹ�����?
        0: �˳�; 1: ����; 2: ������
1
        ����������:
18
        ��������: 18
�����������Ǹ�����?
        0: �˳�; 1: ����; 2: ������
2
�����븡����:
65.78
        ���븡����: 65.78
�����������Ǹ�����?
        0: �˳�; 1: ����; 2: ������
0
(o�b���b)o��[BINGO!]
*/