// ////////////////////////////////////////////
//
// J_Identifier.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			�ж�һ���ַ��Ƿ������ Java ��ʶ������ʼ�ַ�������ַ�������
// ////////////////////////////////////////////
// ������һ��J_Identifier��
public class J_Identifier 
{
	public static void main (String args[])
	{
		char c = 'è';
		//'è'��C++�в�����ֻռһ���ַ�λ������Ҫһ��2��λ���ַ��������װ��'è'�ַ�
		//���� Java ��ֻ��Ҫһ��charλ
		// Java �ַ����ϲ���Unicode�ַ����й�
		if(Character.isJavaIdentifierStart(c)){
			System.out.println("�ַ�\'"+c+"\'��������ʶ�������ַ�");//System.out.println("�ַ�\'"+c+"\'��������ʶ�������ַ�");
		}
		else{
			System.out.println("�ַ�\'"+c+"\'����������ʶ�������ַ�");
		}
		if(Character.isJavaIdentifierPart(c)){
			System.out.println("�ַ�\'"+c+"\'��������ʶ�������ַ����������ַ�");
		}
		else{
			System.out.println("�ַ�\'"+c+"\'����������ʶ�������ַ����������ַ�");
		}
	} // ���� main ����
} //�� J_Identifier ����
//�����õ���java.lang.Character��2����̬��Ա����
// public static boolean isJavaIdentifierStart (char ch)
// public static boolean isJavaIdentifierPart (char ch)


/*
�����������ͣ�boolean��char��byte��short��int��long��float��double
�����������ͣ�class��interface(�ӿ�����)��enum��array

Java �ַ����ϲ���Unicode�ַ����й�

��ʶ��(identifier)
���ڱ�ʶ�ļ��������������������ӿ����ͳ�Ա��������
**************************************************************
identifier �� Java ��ĸ(�Ƽ�ֻ��Ӣ����ĸ��'_')�� Java �������
(���ؼ��ֺ�false,true,null)
false,true,null�� Java ֱ����
**************************************************************
Java ֱ����
ֱ�ӱ�ʾ��ֵ����������ı��ʽ


�ؼ���(keyword)
Java ���Ա�����һЩӢ�ĵ��ʣ������⺬��




*/