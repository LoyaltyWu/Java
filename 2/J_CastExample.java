// ////////////////////////////////////////////
//
// J_CastExample.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��������ת������
// ////////////////////////////////////////////
// ������һ��J_CastExample��
// ������2.2�ڵıʼ�
public class J_CastExample 
{
	public static void main (String args[])
	{
		//������֮ǰ�Ⱦ�һЩ����
		//һЩֱ����������
		//�����ַ�'j'
		char cha = 'a';
		char chb = 'b';
		char chc = 'è';
		System.out.println((char)cha + (char)chb + (char)chc);			
		//''��������Unicode�ַ�,�÷�б��u����������4λ16������������
		char unicode0 = '\u0061';
		char unicode1 = '\u0051';
		char unicode2 = '\u005a';
		System.out.println(unicode0+unicode1+unicode2);
		//ת���ַ�''
		char z1 = '\b';//�˸�
		char z2 = '\f';//��ҳ
		char z3 = '\n';//����
		char z4 = '\r';//�س�
		char z5 = '\t';//�Ʊ��
		char z6 = '\'';//������
		char z7 = '\"';//˫����
		char z8 = '\\';//��б��
		
		//�˽�����
		int oct1 = '\0';  //��Ӧ��0
		int oct2 = '\377';//��Ӧ��255
		//?????��int�ػ���char ???
		//�˽�����
		
		//ʮ������
		int dec1 = 12;
		int dec2 = 7;
		//�˽�����
		int oct01 = 012;//which is 10 in decimal
		int oct02 = -0123;//which is -83 in decimal
		//ʮ������
		int hex1 = 0xABc;//-2748 in decimal
		int hex2 = 0XaD;//173 in decimal
		//������ֱ����
		long dragon = -7L;//����L
		long oct3 = 0123L;//83 in decimal
		long hex3 = 0x123L;//291 in decimal
		//�����ȸ�����ֱ����
		float f1 = 0.1f;
		float f2 = .1f;
		float f3 = -.05e3f;//??????????????????????????
		//What is this ??
		float f4 = 5.e3f;//??????????????????????????
		float f5 = 5.e-010f;//??????????????????????????
		//˫���ȸ�����
		double d1 = 0.1;
		double d2 = 100d;
		double d3 = -5.e3;//??????????????????????????
		double d4 = 5.0e-1d;//??????????????????????????
		//ֱ����null
		
		
		//Java ������4����������: ������,��������,�洢��Ԫ,����ֵ
		int studentNumber;					// ������� studentNumber
		double velocity, distance;  // ������� velocity �� distance
		int m_radius = 5;						// ������� m_radius ����ֵ 5 
		//�൱�� int m_radius; m_radius = 5;
		/*
																ǿ����ϵ
		
		byte < short  \
		               } < int < long < float < double
		        char  /
		*/
		
		double d = 1.60; // d = 1.60
		int i = (int) d; // i = 1
		int anotherI = (int)(d+0.5);//��ʱiΪ2
		d = i;
		//��
		d = (double) i;
		//һ����
		
		// ***********************************************************************************
		// ***********************************************************************************
		// **********************************�ֽ���*******************************************
		// ***********************************************************************************
		// ***********************************************************************************
		
		// ��������ת������
		
		short a = 100;
		long b = a;
		
		
		System.out.println("����ת��:������"+a+"��ɳ�����:"+b);
		b = 123456789L;
		a = (short) b;					//��ʽ����ת����ǿ������ת��
		System.out.println("����ת��:������"+b+"��ɶ�����:"+a);
	
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_CastExample ����