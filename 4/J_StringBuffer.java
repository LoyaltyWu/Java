// ////////////////////////////////////////////
//
// J_StringBuffer.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�ַ�������������
// ////////////////////////////////////////////
// ������һ��J_StringBuffer��
public class J_StringBuffer 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		StringBuffer b = new StringBuffer("0123");
		System.out.println("�ַ������������ַ�������:\""+b+"\"");
		System.out.println("�ַ����������ĳ�����:"+b.length());
		System.out.println("�ַ�����������������:"+b.capacity());
		
		
		b.ensureCapacity(25);
		System.out.println("����b.ensureCapacity(25)֮��");
		System.out.println("�ַ������������ַ�������:\""+b+"\"");
		System.out.println("�ַ����������ĳ�����:"+b.length());
		System.out.println("�ַ�����������������:"+b.capacity());
		System.out.println("���㹫ʽΪ: 20X2+2==42");
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_StringBuffer ����