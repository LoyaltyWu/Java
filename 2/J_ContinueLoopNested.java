// ////////////////////////////////////////////
//
// J_ContinueLoopNested.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��Ƕ��ѭ������е�continue�������
// ////////////////////////////////////////////
// ������һ��J_ContinueLoopNested��
public class J_ContinueLoopNested 
{
	public static void main (String args[])
	{
		aContinueBlock:
		for(int i=0;i<4;i++){
			for (int j=0;j<2;j++){
				if (0<i&&i<3)
					continue aContinueBlock;
				System.out.println("i="+i+", j="+j);
			}//�ڲ�forѭ������
		}//���forѭ������
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
		//aContinueBlock�������
	} // ���� main ����
} //�� J_ContinueLoopNested ����