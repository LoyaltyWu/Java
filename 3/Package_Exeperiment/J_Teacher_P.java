// ////////////////////////////////////////////
//
// J_Teacher.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			Package���̡���Teacher Part
// ////////////////////////////////////////////
// ������һ��J_Teacher��

package cn.edu.tsinghua.universityOrganization;

import cn.edu.tsinghua.universityOrganization.J_Employee_P;

public class J_Teacher_P extends J_Employee_P
//�̳�J_Employee��
{
	//��Ա��
	public int m_classHour; // �ڿεĿ�ʱ
	
	//���췽��
	public J_Teacher_P()
	{
		m_classHour = 96;
	} // J_Teacher���췽������
	
	//��Ա����
	public void mb_printInfo()
	{
		System.out.println("�ý�ʦ�Ĺ�������Ϊ"+m_workYear);
		System.out.println("�ý�ʦ���ڿεĿ�ʱΪ"+m_classHour);
	} // ����mb_printInfo���� 
	
	/*
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
	} // ���� main ����
	*/
	
} //�� J_Teacher ����