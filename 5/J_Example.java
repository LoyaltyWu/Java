// ////////////////////////////////////////////
//
// J_Example.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			for ���ļ�д�������������е�Ӧ������
// ////////////////////////////////////////////
// ������һ��J_Example��
public class J_Example 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int [] a = {10,20,30,40,50};
		int s = 0;
		//û����Vector
		//�õ��ǵ�2�ּ�д��
		//������ô˵��...��ô�������������յļ�д����ôһ��������....
		for (int c : a)
		{
			s += c; // ����ע��c������Ԫ��
		} // for ѭ������
		System.out.println("The sum of the array A is " + s );
		
		
		
		//��ֵ�һ��...
		s = 0;
		for (int i = 1;i<=a.length;i++){
			s+=i;
		}
		System.out.println("��1һֱ�ӵ�����a��Ԫ�س���,�������"+s);
		//��....1+2+3+4+5==15...
		
		
		//������,��2�ּ�д����������ʽ
		s = 0;
		int [] ca = a;
		for (int i=0;i<ca.length;i++){
			int c = ca[i];
			s += c;
		} // for ѭ������
		System.out.println("The sum of the array A is " + s );
		
		
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Example ����