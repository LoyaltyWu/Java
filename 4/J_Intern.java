// ////////////////////////////////////////////
//
// J_Intern.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�ַ���������
// ////////////////////////////////////////////
// ������һ��J_Intern��
public class J_Intern 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		String s1 = "123456";// �ַ���ֱ����
		String s2 = "123456";// �ַ���ֱ����
		String s3 ="123"+"456";// �ⲻ���ַ���ֱ����
		String a = "123";// �ַ���ֱ����
		// ��Ȼaָ���ַ���ֱ����,����a�������ַ���ֱ����
		String s4 = a + "456";// �ⲻ���ַ���ֱ����
		String s5 = new String ("123456");// �ⲻ���ַ���ֱ����
		// ��Ϊs5ָ��ԵĶ������ַ�����������s5!=s1
		String s6 = s5.intern();//����ǰ�ַ����Ѿ����ַ�������,�򷵻�������,��Ȼ����һ���������ַ���Ȼ�󷵻�������
		System.out.println("s2"+((s2==s1) ? "==":"!=")+"s1");
		System.out.println("s3"+((s3==s1) ? "==":"!=")+"s1");
		System.out.println("s4"+((s4==s1) ? "==":"!=")+"s1");
		System.out.println("s5"+((s5==s1) ? "==":"!=")+"s1");
		System.out.println("s6"+((s6==s1) ? "==":"!=")+"s1");
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Intern ����