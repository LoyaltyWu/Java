// ////////////////////////////////////////////
//
// J_Student.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			Upgrade�Ժ��J_Student���������������
// ////////////////////////////////////////////
import java.io.Serializable;
// ������һ��J_Student��
public class J_Student implements Serializable
{
	static final long serialVersionUID = 123456L;
	// ��ǰ������к�
	String m_name;
	int m_id;
	int m_height;
	int m_weight;
	
	// J_Student ���췽����ʼ
	public J_Student(String name, int id, int h)
	{
		m_name = name;
		m_id = id;
		m_height = h;
	} // J_Student ���췽������
	
	// mb_output ��Ա������ʼ
	public void mb_output()
	{
		System.out.println("����: " + m_name);
		System.out.println("ѧ��: " + m_id);
		System.out.println("���: " + m_height);
	} // mb_output ��Ա��������
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Student ����