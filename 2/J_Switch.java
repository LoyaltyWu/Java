// ////////////////////////////////////////////
//
// J_Switch.java
//
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			Switch�﷨��ϰ��������
// ////////////////////////////////////////////
// ������һ��J_Switch��
public class J_Switch
{
	public static void main (String args[])
	{
		char studentGrade = 'A';
		switch (studentGrade)
		{
			case 'A':
			case 'a':
				System.out.println("����!");break;
			case 'B':
			case 'b':
				System.out.println("����!");break;
			case 'C':
			case 'c':
				System.out.println("����!");break;
			case 'D':
			case 'd':
				System.out.println("������!");break;
			default:
				System.out.println("�ɼ�����!");break;
		} //switch ������
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Switch ����