// ////////////////////////////////////////////
//
// J_Area.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			������κ�Բ�������
// ////////////////////////////////////////////
// ������һ��J_Area��
public class J_Area 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Shape a = new J_Circle(5);
		System.out.println("�뾶Ϊ5��Բ�������"+a.mb_getArea());
		a = new J_Rectangle(0,0,3,4);
		System.out.println("�����ľ��������"+a.mb_getArea());
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Area ����
/*
OUTPUT:
Java,Hello!
�뾶Ϊ5��Բ�������78.53981633974483
�����ľ��������12.0
(o�b���b)o��[BINGO!]
*/