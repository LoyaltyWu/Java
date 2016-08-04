// ////////////////////////////////////////////
//
// J_Teacher.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ְ���ͽ�ʦ֮��ļ̳��Գ�������
// ////////////////////////////////////////////
// ������һ��J_Teacher��
class J_Employee
{
	public int m_workYear;
	
	public J_Employee()
	{
		m_workYear = 1;
	} // J_Employee���췽������
} // ��J_Employee����

public class J_Teacher extends J_Employee
//�̳�J_Employee��
{
	//��Ա��
	public int m_classHour; // �ڿεĿ�ʱ
	
	//���췽��
	public J_Teacher(){
		m_classHour = 96;
	} // J_Teacher���췽������
	
	//��Ա����
	public void mb_printInfo()
	{
		System.out.println("�ý�ʦ�Ĺ�������Ϊ"+m_workYear);
		System.out.println("�ý�ʦ���ڿεĿ�ʱΪ"+m_classHour);
	} // ����mb_printInfo���� 
	
	
	//main����
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Teacher tom = new J_Teacher();
		tom.mb_printInfo();
		// /////////////////////////////////////////////////////////////////////////////////
		J_Employee oldWang = tom;//������תΪ���಻��Ҫǿ������ת��()
		System.out.println("��ʦ���Ĺ�������Ϊ"+oldWang.m_workYear);
		J_Teacher luoSir = (J_Teacher)oldWang;//����ת�������Ҫ��
		System.out.println("How about ��sir??");
		luoSir.mb_printInfo();
		System.out.println("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
		/////////////////////////////////////////////////////////////////////////////////
		System.out.println("Error Testing");
		/*
		ʵ��output:
		Exception in thread "main" java.lang.ClassCastException: 
		J_Employee cannot be cast to J_Teacher at J_Teacher.main(J_Teacher.java:56)
		*/
		//J_Employee a = new J_Employee();
		//J_Teacher b = (J_Teacher) a;
		/////////////////////////////////////////////////////////////////////////////////
		J_Teacher a = new J_Teacher();
		J_Employee b =new J_Employee();
		J_Employee c = a;//����ǿ��ת���ɸ�������()
		System.out.println("J_Teacher a = new J_Teacher();");
		if(a instanceof J_Teacher ){
			System.out.println("a is a instance of J_Teacher.");
		}else {
			System.out.println("a is not a instance of J_Teacher.");
		}
		if(a instanceof J_Employee ){
			System.out.println("a is a instance of J_Employee.");
		}else {
			System.out.println("a is not a instance of J_Employee.");;
		}
		System.out.println();System.out.println();System.out.println();
		System.out.println("J_Employee c = a;//����ǿ��ת���ɸ�������()");
		if(c instanceof J_Teacher ){
			System.out.println("c is a instance of J_Teacher.");
		}else {
			System.out.println("c is not a instance of J_Teacher.");
		}
		if(c instanceof J_Employee ){
			System.out.println("c is a instance of J_Employee.");
		}else {
			System.out.println("c is not a instance of J_Employee.");
		}
		System.out.println();System.out.println();System.out.println();
		System.out.println("J_Employee b =new J_Employee();");
		if(b instanceof J_Teacher ){
			System.out.println("b is a instance of J_Teacher.");
		}else {
			System.out.println("b is not a instance of J_Teacher.");
		}
		if(b instanceof J_Employee ){
			System.out.println("b is a instance of J_Employee.");
		}else {
			System.out.println("b is not a instance of J_Employee.");
		}
		System.out.println();System.out.println();System.out.println();
		b = (J_Teacher) a;
		System.out.println("b = (J_Teacher) a;");
		if(b instanceof J_Teacher ){
			System.out.println("b is a instance of J_Teacher.");
		}else {
			System.out.println("b is not a instance of J_Teacher.");
		}
		if(b instanceof J_Employee ){
			System.out.println("b is a instance of J_Employee.");
		}else {
			System.out.println("b is not a instance of J_Employee.");
		}
		
	} // ���� main ����
} //�� J_Teacher ����