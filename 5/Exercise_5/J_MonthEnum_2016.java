// ////////////////////////////////////////////
//
// J_MonthEnum_2016.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			2016Enum�·�����
// ////////////////////////////////////////////
// ������һ��MonthEnum_2016ö����
enum MonthEnum_2016
{
	Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec;
}
// ������һ��J_MonthEnum_2016��
public class J_MonthEnum_2016 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int [] a = {31,28,31,30,31,30,31,31,30,31,30,31};
		int i = 0;
		for (MonthEnum_2016 c: MonthEnum_2016.values())
		{
			System.out.println(c+" have "+a[i++]+" days.");
		}
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_MonthEnum_2016 ����
/*
Java,Hello!
Jan have 31 days.
Feb have 28 days.
Mar have 31 days.
Apr have 30 days.
May have 31 days.
Jun have 30 days.
Jul have 31 days.
Aug have 31 days.
Sep have 30 days.
Oct have 31 days.
Nov have 30 days.
Dec have 31 days.
(o�b���b)o��[BINGO!]
*/