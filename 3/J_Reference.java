// ////////////////////////////////////////////
//
// J_Reference.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			������������ֵ��������
// ////////////////////////////////////////////
// ������һ��J_Reference��
class J_Time
{
	public int m_month = 1;
} // J_Time �����

public class J_Reference 
{
	public static void mb_method (J_Time t)
	{
		System.out.println("�� t.m_month++֮ǰ t.m_month="+t.m_month);
		t.m_month++;
		System.out.println("�� t.m_month++֮�� t.m_month="+t.m_month);
	}
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Time a = new J_Time();
		System.out.println("�ڷ�������֮ǰ a.m_month="+a.m_month);
		mb_method (a);
		System.out.println("�ڷ�������֮�� a.m_month="+a.m_month);
		
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Reference ����
/*
Java,Hello!
�ڷ�������֮ǰ a.m_month=1
�� t.m_month++֮ǰ t.m_month=1
�� t.m_month++֮�� t.m_month=2
�ڷ�������֮�� a.m_month=2
(o�b���b)o��[BINGO!]
*/