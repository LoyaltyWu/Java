// ////////////////////////////////////////////
//
// J_InnerTest.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ʵ��(���������)�ڲ��� ��������
// ////////////////////////////////////////////
// ������һ��J_InnerTest��

class J_Test
{
	int m_dataOuter = 1;
	static int m_dataOutStatic = 2;
	
	
	/*
	���ⲿ����:
	����: J_Inner b;//������һ��J_Inner����b
	���ⲿ��������������п���:
	J_Test.J_Inner b;//������һ��J.test.J_Inner����b
	*/
	
	
	
	//ʵ���ڲ�����
	//1.staticʵ���ڲ���
	//2.��staticʵ���ڲ���
	class J_Inner
	{
		int m_data;
		static final int m_dataStatic = 4;
		//�����ڲ���,�����ĳ�Ա�����static����,��ô��Ҳ�������final����
		
		
		public J_Inner()
		{
			m_data = 3;
		} // J_Inner ���췽������
		
		//������static���Ե�ʵ���ڲ��಻�ܾ��в��ܺ���static�ĳ�Ա����
		public void mb_method()
		{
			System.out.println("m_dataOuter="+m_dataOuter);
			System.out.println("m_dataOuterStatic"+m_dataOutStatic);
			System.out.println("m_data="+m_data);
			System.out.println("m_dataStatic="+m_dataStatic);
			mb_methodOuter();
		} // ���� mb_method ����
	} // �ڲ��� J_Inner ����
	
	public void mb_methodOuter()
	{
		System.out.println("mb_methodOuter");
	} // ���� mb_methodOuter ����
}


public class J_InnerTest 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		J_Test a = new J_Test();
		J_Test.J_Inner b = a.new J_Inner();
		b.mb_method();
		//J_Test.J_Inner c = new J_Test.J_Inner();//���ھ�̬ʵ���ڲ���Ϳ���
		/*
		**********************************************************************
		ʵ���ڲ���Ĵ�������:
		
		static:
		new outer.inner();
		
		non-static:
		outer a = new outer();
		outer.inner b = a.new inner();
		**********************************************************************
		��ʵ���ڲ���ĳ�Ա��ͳ�Ա�����ķ��ʷ�ʽ:
		#define a ���ʽ
		static inner named class
			mb:
  			static member:
  				outer.inner.mb_static;
  			non-static member:
  				a.mb;
  		mb_Method:
  			static method:
  				Outer.Inner.mb_methodStatic();
  			non-static method:
  				a.mb_method();
		non-static inner named class
			mb:
				static member:
					outer.inner.mb_static;//ͬʱһ������final����
				non_static member:
					a.mb;
			mb_Method:
				static method:XXXXXXXXXXXXXX
				XXXXXXXXXXXXXXXXXXXXXXXXXXXXouter.inner.mb_methodStatic();
				//non-static inner named class could not hava static method
				
				non-static method:
					a.mb_method();
				
		
		*/
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_InnerTest ����

/*
OUTPUT��
Java,Hello!
m_dataOuter=1
m_dataOuterStatic2
m_data=3
m_dataStatic=4
mb_methodOuter
*/