// ////////////////////////////////////////////
//
// J_File.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�ļ�����
// ////////////////////////////////////////////
import java.io.File;


// ������һ��J_File��
public class J_File 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		String k = "J_File.class";
		File f = new File("J_File.class");
		if (f.exists())
		{
			System.out.println("getName: " + f.getName());
			System.out.println("getPath: " + f.getPath());
			System.out.println("getParent:" + f.getParent());
			System.out.println("length: " + f.length());
		}else {
			System.out.printf("�ļ�%1$s������%n",k);
		}
		// } // for ѭ������
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_File ����
/*
����:
Ϊʲôargs��Ӧ�Ķ�����һ��..
*/