// ////////////////////////////////////////////
//
// J_ObjectInputStream.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��ȡ��������
// ////////////////////////////////////////////
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// ������һ��J_ObjectInputStream��
public class J_ObjectInputStream 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		try
		{
			ObjectInputStream f = new ObjectInputStream(
				new FileInputStream("object.dat"));
			J_Student s = (J_Student)(f.readObject());
			s.mb_output();
			f.close();
		}
		catch (Exception e)
		{
			System.err.println("�����쳣:"+e);
			e.printStackTrace();
		} // try-catch �ṹ����
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_ObjectInputStream ����