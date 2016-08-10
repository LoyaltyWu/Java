// ////////////////////////////////////////////
//
// J_Genericity.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���жุ���͵����ͱ�����������
// ////////////////////////////////////////////
// �� J_C1 
class J_C1
{
	public void mb_methodA()
	{
		System.out.print("A");
	} // ����mb_methodA����
} // �� J_C1 ����

//�ӿ� J_C2
interface J_C2
{
	public void mb_methodB();
} // �ӿ� J_C2 ����

class J_C3 extends J_C1 implements
{
	public void mb_methodB()
	{
		System.out.print("B");
	}
}

// �� J_T 
class J_T <T extends J_C1 & J_C2>
{
	public void mb_methodT(T t)
	{
		t.mb_methodA();
		t.mb_methodB();
	} // ���� mb_methodT ����
} // �� J_T ����

// ������һ��J_Genericity��
public class J_Genericity
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_T<J_C3> A = new J_T<J_C3>();
		A.mb_methodT( new J_C3() );
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Genericity ����