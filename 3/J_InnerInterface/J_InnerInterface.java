// ////////////////////////////////////////////
//
// J_InnerInterface.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			������Ϊ�ӿڵ������ڲ�����
// ////////////////////////////////////////////
// ������һ��J_InnerInterface��
interface J_Interface
{
	public static int m_data = 5;
	
	public abstract void mb_method();
} // �ӿ�J_Interface ����


public class J_InnerInterface 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Interface b = new J_Interface()
		{
			public void mb_method ()
			{
				System.out.println("m_data="+m_data);
			} // ���� mb_method ����
		}; // ʵ�ֽӿ� J_Interface �������ڲ������
		b.mb_method();
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_InnerInterface ����