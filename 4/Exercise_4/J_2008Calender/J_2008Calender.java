// ////////////////////////////////////////////
//
// J_2008Calender.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���������������
// ////////////////////////////////////////////
// ������һ��J_2008Calender��
public class J_2008Calender 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		//               0  1  2  3  4  5  6  7  8  9 10 11
		//               1  2  3  4  5  6  7  8  9 10 11 12
		int [] month = {31,29,31,30,31,30,31,31,30,31,30,31};
		int i =0;
		/*int sum = 0;
		for (i =0;i<8;i++){	
			sum+=month[i];
		}*/
		//int mod = sum%7;
		//System.out.print("sum is "+sum);//244
		//System.out.print("After mod 7 is "+mod);//6
		//So the first day of 2008 is Tuesday.
		int date = 2;
		for (i = 0;i<12;i++){
			for ( int j = 0;j<month[i];j++,date++){
				if (date%7==0){
					System.out.println((i+1)+"/"+(j+1)+"/"+"������");
				}
				System.out.println((i+1)+"/"+(j+1)+"/"+"����"+date%7);
			}
		}
		date = 2;
		for (i = 0;i<12;i++){
			for ( int j = 0;j<month[i];j++,date++){
				if (date%7==(j+1)%10&&date%7!=0){
					
					System.out.println((i+1)+"/"+(j+1)+"/"+"����"+date%7);
				}
			}
		}
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_2008Calender ����