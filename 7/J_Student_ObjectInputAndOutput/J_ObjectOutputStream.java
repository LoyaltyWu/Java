// ////////////////////////////////////////////
//
// J_ObjectOutputStream.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�����������
// ////////////////////////////////////////////
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ������һ��J_ObjectOutputStream��
public class J_ObjectOutputStream 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("object.dat"));
			J_Student s = new J_Student( "����", 2003001, 172);
			f.writeObject(s);
			s.mb_output();
			f.close();
			// �Զ�����ʽ�����
		}
		catch(Exception e){
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch �ṹ����
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_ObjectOutputStream ����