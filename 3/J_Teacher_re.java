// ////////////////////////////////////////////
//
// J_Teacher_re.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ְ�����ʦ֮��Ķ�̬��̬������
// ////////////////////////////////////////////
// ��̬��̬��ֻ��ԷǾ�̬�ĳ�Ա����!!!!!!
// ������һ��J_Teacher_re��
class J_Employee
{
	public int m_workYear;
	
	public J_Employee()
	{
		m_workYear = 1;
	} // J_Employee���췽������
	
	public void mb_printInfo()
	{
		System.out.println("��ְ���Ĺ�������Ϊ"+m_workYear);
	} // ����mb_printInfo���� //��1��mb_printInfo()
	
} // ��J_Employee����

public class J_Teacher_re extends J_Employee
//�̳�J_Employee��
{
	//��Ա��
	public int m_classHour; // �ڿεĿ�ʱ
	
	//���췽��
	public J_Teacher_re(){
		m_classHour = 96;
	} // J_Teacher���췽������
	
	//��Ա����
	public void mb_printInfo()
	{
		System.out.println("�ý�ʦ�Ĺ�������Ϊ"+m_workYear);
		System.out.println("�ý�ʦ���ڿεĿ�ʱΪ"+m_classHour);
	} // ����mb_printInfo����  //��2��mb_printInfo()
	
	
	//main����
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Employee oldWang = new J_Employee();
		oldWang.mb_printInfo();
		oldWang = new J_Teacher_re();
		oldWang.mb_printInfo();
		System.out.println();System.out.println();System.out.println();
		J_Teacher_re tom = new J_Teacher_re();
		tom.mb_printInfo();
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Teacher_re ����

// ////////////////////////////////////////////
// ����super�ؼ��ֵıʼ�
// super���this
// this���ʵ��ǵ�ǰ���(��Ա��,���췽��,��Ա����)
// super���ʵ����丸���(��Ա��,���췽��,��Ա����)
// ////////////////////////////////////////////
// super.�����Ա��
// super.�����Ա����
// super(���๹�췽���ĵ��ò����б�)
// ////////////////////////////////////////////