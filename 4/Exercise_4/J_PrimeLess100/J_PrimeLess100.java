// ////////////////////////////////////////////
//
// J_PrimeLess100.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ɸ�����С�ڵ���100����������
// ////////////////////////////////////////////
// ������һ��J_PrimeLess100��
public class J_PrimeLess100 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int [] flag = new int [101];
		int i = 0;
		for (i = 0;i<101;i++){
			flag[i]=1;
		}
		for (i = 2;i<101;i++){
			if (flag[i]==1){
				System.out.print(i+" ");
				int tmp = i;
				for (int j = 2;(j*i)<101;j++){
					flag[j*i] = 0;
				}
			}
		}
		
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_PrimeLess100 ����