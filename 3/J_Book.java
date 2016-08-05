// ////////////////////////////////////////////
//
// J_Book.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			����������Ա��ͳ�Ա�����ľ�̬������Ǿ�̬���Գ�������
// ////////////////////////////////////////////
// ������һ��J_Book��
public class J_Book 
{
	public int m_id; // ��ı��
	public static int m_bookNumber = 0; // �������
	
	
	public J_Book()
	{
		m_bookNumber++;
	} // J_Book���췽������
	
	public void mb_info()
	{
		System.out.println("��ǰ��ı����:"+m_id);
	} // ����mb_info����
	
	public static void mb_infoStatic()
	{
		System.out.println("��ǰ��ı����:"+m_bookNumber);
		// ��̬�������õĻ����Ǿ�̬����
	} // ����mb_infoStatic����
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Book a = new J_Book();
		J_Book b = new J_Book();
		a.m_id = 1101;
		b.m_id = 1234;
		System.out.print("����a��Ӧ��");
		a.mb_info();
		System.out.print("����b��Ӧ��");
		b.mb_info();
		J_Book.mb_infoStatic(); // ���÷����ķ�ʽ�ͷǾ�̬�Ĳ�ͬ
		// ֱ�ӵ���������
		System.out.println("�Ƚ�(a.m_bookNumber==J_Book.m_bookNumber)"
				+"�Ľ����:"+(a.m_bookNumber==J_Book.m_bookNumber));
		System.out.println("�Ƚ�(b.m_bookNumber==J_Book.m_bookNumber)"
				+"�Ľ����:"+(b.m_bookNumber==J_Book.m_bookNumber));
		//���ֵ��÷�������,��̬��Ա�������ݶ�һ�ֵ��÷���
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Book ����
/*
OUTPUT:
Java,Hello!
����a��Ӧ�ĵ�ǰ��ı����:1101
����b��Ӧ�ĵ�ǰ��ı����:1234
��ǰ��ı����:2
�Ƚ�(a.m_bookNumber==J_Book.m_bookNumber)�Ľ����:true
�Ƚ�(b.m_bookNumber==J_Book.m_bookNumber)�Ľ����:true
(o�b���b)o��[BINGO!]
*/