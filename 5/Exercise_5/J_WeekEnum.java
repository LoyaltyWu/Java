// ////////////////////////////////////////////
//
// J_WeekEnum.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			����ö����������
// ////////////////////////////////////////////
// ������һ��J_Week ö������
enum J_Week
{
	Sun,Mon,Tue,Wed,Thu,Fri,Sat;
}
// ������һ��J_WeekEnum��
public class J_WeekEnum 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int i = 0;
		for (J_Week c : J_Week.values())
		{
			System.out.println("ÿ�ܵĵ�"+(++i)+"��:"+c);
		}
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_WeekEnum ����
/*
Java,Hello!
ÿ�ܵĵ�1��:Sun
ÿ�ܵĵ�2��:Mon
ÿ�ܵĵ�3��:Tue
ÿ�ܵĵ�4��:Wed
ÿ�ܵĵ�5��:Thu
ÿ�ܵĵ�6��:Fri
ÿ�ܵĵ�7��:Sat
(o�b���b)o��[BINGO!]
*/