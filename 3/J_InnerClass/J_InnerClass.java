// ////////////////////////////////////////////
//
// J_InnerClass.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			������Ϊ��Ķ�������
// ////////////////////////////////////////////
// ������һ��J_InnerClass��
abstract class J_Class
{
	int m_data;
	
	public J_Class(int i)
	{
		m_data = i;
	} // J_Class ���췽��
	
	
	public abstract void mb_method();
} // ������ J_Class ����

class J_Anonymity extends J_Class
{
	public J_Anonymity(int i)
	{
		super(i);
	} // J_Anonymity ���췽������
	
	
	public void mb_method ()
	{
		System.out.println("m_data="+m_data);
	} // ���� mb_method ����
} // �� J_Anonymity ����

public class J_InnerClass 
{
	public static void main (String args[])
	{
		J_Class b = new J_Anonymity(5); // ��̬��̬�� ͨ�������͵����õ��������͵ĳ�Ա����
		b.mb_method();
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_InnerClass ����