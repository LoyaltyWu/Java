// ////////////////////////////////////////////
//
// J_Scope.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ͬ������������Χ�ص������������
// ////////////////////////////////////////////
// ������һ��J_Scope��
class J_Time
{
	public int data = 3;
	// ����ʡ���������������
} // �� J_Time ����

public class J_Scope extends J_Time
{
	public int data = 2;
	
	public void mb_method ()
	{
		int data = 1;
		System.out.println("data="+data);
		System.out.println("this.data="+this.data);
		System.out.println("super.data="+super.data);
	} // ���� mb_method ����
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Scope a = new J_Scope();
		a.mb_method();
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Scope ����
/*
OUTPUT:
Java,Hello!
data=1
this.data=2
super.data=3
(o�b���b)o��[BINGO!]
*/