// ////////////////////////////////////////////
//
// J_Break.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			����������break�������
// ////////////////////////////////////////////
// ������һ��J_Break��
public class J_Break 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int i = 0;
		aBreakBlock:
		//������:
		{
			System.out.println("��break���֮ǰ");
			if (i<=0){
				break aBreakBlock;
			}
			System.out.println("��break���֮��");
		}
		System.out.println("��aBreakBlock����֮��");																			//��print�Ͳ��ỻ����
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Break ����
/*
�йش���ŵ��������رʼ�:

��1����ʽ:
������:
{
	�����
}

��2����ʽ:
������:
{
	ѭ�����
}

break��2����ʽ:
break;//��switch������ѭ����
break ������;//��������
*/