// ////////////////////////////////////////////
//
// J_Finalize.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ʵ�������������ڳ�������
// ////////////////////////////////////////////
// ������һ��J_Finalize��
class J_Book
{
	public int m_id;//��ı��
	
	public J_Book(int i){
		m_id = i;
	}//J_Book���췽������
	
	//�����η�
	protected void finalize(){
		switch (m_id)
		{
			case 1:
				System.out.print("��Ʈ��");
				break;
			case 2:
				System.out.print("��Java������ƽ̡̳�");
				break;
			case 3:
				System.out.print("��������ա�");
				break;
			default:
				System.out.print("δ֪�鼮");
				break;
		}//switch ������
		System.out.println("����Ӧ��ʵ������洢��Ԫ������");
	} // ���� finalize ����	
} // ���� J_Book ����


public class J_Finalize 
//�����η� class ���� 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
	
		J_Book book1 = new J_Book(1);
		//book1 ��Ӧ���ڴ���ڳ������н���֮��Ż���,java�Զ���һ�㲻��������ʵ�������finalize��Ա����
		new J_Book(2);
		new J_Book(4);
		System.gc();
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Finalize ����
/*
output:
Java,Hello!
�һ��Ϊ�����Java����Ա�������Android�������ʦ!
��������ա�����Ӧ��ʵ������洢��Ԫ������
��Java������ƽ̡̳�����Ӧ��ʵ������洢��Ԫ������
*/