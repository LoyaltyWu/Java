// ////////////////////////////////////////////
//
// J_AddInterface.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��������
// ////////////////////////////////////////////
// ������һ��J_Interface�ӿ�(���з����ص�)
interface J_Interface <T extends Number>
{
	public int mb_sum(T a1,T a2,T a3);
} // J_Interface �ӿڽ���
// ������һ��J_AddInterface��(Ҳ���з����ص�)
public class J_AddInterface <T extends Number> implements J_Interface < T >
{
	/*
	interface J_Interface <T extends Number>
	{
		public int mb_sum(T a1,T a2,T a3);
	} // J_Interface �ӿڽ���
	*/
	public int mb_sum(T a1,T a2,T a3)
	{
		int b1 = a1.intValue();
		int b2 = a2.intValue();
		int b3 = a3.intValue();
		return (b1+b2+b3);
	} // ���� mb_sum ���� // Ҫ�õ�ʱ��Ҫдһ��???
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_AddInterface <Integer> b = new J_AddInterface<Integer>();
		// �����ʵ������
		// �õ���ϵͳ�Ĺ��캯��
		Integer a1 = new Integer (1);
		Integer a2 = new Integer (2);
		Integer a3 = new Integer (3);
		System.out.println(b.mb_sum(a1,a2,a3));
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_AddInterface ����