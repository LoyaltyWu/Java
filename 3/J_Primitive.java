// ////////////////////////////////////////////
//
// J_Primitive.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			������������ֵ��������
// ////////////////////////////////////////////
// ������һ��J_Primitive��
public class J_Primitive 
{
	public static void mb_method(int a)
	{
		System.out.println("��a++֮ǰ��������a=" + a);
		a++;
		System.out.println("��a++֮�󷽷�����a=" + a);
	} // ���� mb_method ����
	
	
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int i = 0;
		System.out.println("�ڷ�������֮ǰ��������i=" + i);
		mb_method(i);
		System.out.println("�ڷ�������֮�󷽷�����i=" + i);
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Primitive ����
/*
Java,Hello!
�ڷ�������֮ǰ��������i=0
��a++֮ǰ��������a=0
��a++֮�󷽷�����a=1
�ڷ�������֮�󷽷�����i=0
(o�b���b)o��[BINGO!]
*/