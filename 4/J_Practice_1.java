// ////////////////////////////////////////////
//
// J_Practice_1.java
//
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���к���������
// ////////////////////////////////////////////
// ������һ��J_Practice_1��
public class J_Practice_1
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line
		char [] c;
		char c1 [];

		char [] a,b,c2;//3���ַ�����
		char a1[],b1[],c3[];//3���ַ�����

		c = new char [5];
		// ���´����ַ������������� ��ֵ���������

		char [] c4 = new char [5];
		//ֱ�ӳ�ʼ����ʼ

		char [] c5 = {'a','b','c','d','e'};

		String [] s = new String [3];
		s[0] = new String ("aaa");
		s[1] = new String ("bbb");
		s[2] = new String ("ccc");

		String [] s1 = { new String ("aaaa"), new String ("bbbb"), new String ("cccc")};

		int [][] matrix;

		matrix = new int [2][3];//2��3��
		System.out.println("matrix.length : "+matrix.length);
		System.out.println("matrix[0].length : "+matrix[0].length);
		int [][][] matrix3D = new int [3][][];//3��

		matrix3D[0] = new int [2][];//2��
		matrix3D[1] = new int [3][];//3��
		matrix3D[2] = new int [2][];//2��

		matrix3D[0][0]=new int [4];
		matrix3D[0][1]=new int [4];

		matrix3D[1][0]=new int [4];
		matrix3D[1][1]=new int [4];
		matrix3D[1][2]=new int [4];

		matrix3D[2][0]=new int [4];
		matrix3D[2][1]=new int [4];

		//����������??�ǿ��Ե�
		int [][][] M3D = new int [2][3][4];
		String s2 = new String("It can't be!");
		String s3 = s2.substring(0,1);//���I
		System.out.println(s3);
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Practice_1 ����