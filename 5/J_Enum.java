// ////////////////////////////////////////////
//
// J_Enum.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ö����������
// ////////////////////////////////////////////
// ������һ��E_SEASONö������
enum E_SEASON
{
	����,�ļ�,�＾,����;
} // ö�� E_SEASON ����


// ������һ��J_Enum��
public class J_Enum 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		E_SEASON [] sa = E_SEASON.values();
		for (int i = 0;i<4;i++){
			switch(sa[i])
			{
				//����,�ļ�,�＾,����;
				case ����:
				//����д��case sa[i].����
				//����д��case E_SEASON.����
					System.out.println("����������");
					break;
				case �ļ�:
					System.out.println("�ļ�Ҷ��ͥ");
					break;
				case �＾:
					System.out.println("�＾����԰");
					break;
				case ����:
					System.out.println("����ѩ����");
					break;
			} // switch �ṹ����
		}
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Enum ����
/*
Java,Hello!
����������
�ļ�Ҷ��ͥ
�＾����԰
����ѩ����
(o�b���b)o��[BINGO!]
*/