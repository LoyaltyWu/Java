// ////////////////////////////////////////////
//
// J_EnumFor.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			for ���ļ�д����ö�����������е�Ӧ������
// ////////////////////////////////////////////
// ������һ��E_SEASONö������
enum E_SEASON
{
	����,�ļ�,�＾,����;
} // ö�� E_SEASON ����


// ������һ��J_EnumFor��
public class J_EnumFor 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		//��2��for����д��
		for (E_SEASON c: E_SEASON.values())
		{
			System.out.print(c+", ");
		}
		System.out.println();
		
		//������ʽ
		//����
		E_SEASON [] ca = E_SEASON.values();
		//����values���ص���һ������
		for (int i = 0;i<ca.length;i++){
			E_SEASON c = ca[i];
			System.out.print(c+", ");
		} // for ѭ������
		System.out.println();
		
		
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_EnumFor ����