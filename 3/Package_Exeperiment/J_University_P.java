// ////////////////////////////////////////////
//
// J_University_P.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			Package���̡���Main Programme Part
// ////////////////////////////////////////////
// ������һ��J_University_P��

import cn.edu.tsinghua.universityOrganization.J_Employee_P;

import cn.edu.tsinghua.universityOrganization.J_Teacher_P;

public class J_University_P 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Employee_P a = new J_Employee_P();
		a.mb_printInfo();
		a = new J_Teacher_P();
		a.mb_printInfo();
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_University_P ����


/*
����������������Ϊ:
javac -d . J_Employee_P.java
javac -d . J_Teacher_P.java
javac J_University_P.java
ִ��������:
java J_University

OUTPUT:

Java,Hello!
��ְ���Ĺ�������1
�ý�ʦ�Ĺ�������Ϊ1
�ý�ʦ���ڿεĿ�ʱΪ96

*/