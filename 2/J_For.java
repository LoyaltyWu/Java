// ////////////////////////////////////////////
//
// J_For.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			For�﷨��ϰ��������
// ////////////////////////////////////////////
// ������һ��J_For��
public class J_For
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int counter,sum;
		for (counter = 1,sum = 0;counter<=100;counter++){
			sum+=counter;
		}
		System.out.println("counter="+counter+", sum="+sum);
		
		for (int c = 0, s = 0;c<100;c++){
			s+=(c+1);
			if (c+1==100){
				System.out.println("counter="+(c+1)+", sum="+s);
			}
		}
		
		
		
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_For ����