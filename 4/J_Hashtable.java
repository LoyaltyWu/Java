// ////////////////////////////////////////////
//
// J_Hashtable.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			ͨ����ϣ���γ������±���ֵ֮���˫��ӳ��
// ////////////////////////////////////////////
// ������һ��J_Hashtable��
import java.util.Hashtable;

public class J_Hashtable 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		String [] sa ={"Mary","Tom","John","James","Louis","Jim",
			"Rose","Ann","Lisa","Betty","Henry","Albert"};
		Hashtable <String ,Integer> ht = new Hashtable <String, Integer>();
		
		
		//��ϣ��ԭ����Ԫ�عؼ��ֺ����Ԫ�ش洢λ�ý���һ��ӳ���ϵ
		
		
		// ����ϣ�������Ԫ��,��ʹ�ùؼ�����ֵ֮�佨����ӳ���ϵ
		int i;
		for (i = 0;i<sa.length;i++){
			ht.put(sa[i],new Integer(i));
		}
		
		// ͨ���±�������(�ַ���ֵ)
		i = 8;
		System.out.println("�� sa ������,�±�Ϊ"+i+"���ַ�����\""+sa[i]+"\"");
		//Lisa
		
		// ͨ����ϣ��,ֱ�ӻ�õ�����(�ַ���ֵ)�������±�
		String s = sa[i];
		System.out.println("�� sa ������, \"" + s + "\"���±���" + ht.get(s));
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Hashtable ����