// ////////////////////////////////////////////
//
// J_Swap.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���ð�λ�������ʵ�ֵĽ���2�������ĳ�������
// ////////////////////////////////////////////
// ������һ��J_Swap��
public class J_Swap 
{
	public static void main (String args[])
	{
		int i = 0;
		i = (-1)^(1);
		System.out.println("(-1)^(1) = "+ i);
		System.out.println("��λ�������");
		int a = 123;
		int b = 321;
		System.out.println("a="+a+", b="+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a="+a+", b="+b);
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Swap ����

/*

Sample Output:

0^(1) = -2
a=123, b=321
a=321, b=123
(o�b���b)o��[BINGO!]

*/