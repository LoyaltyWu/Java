// ////////////////////////////////////////////
//
// J_VectorFor.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��1�� for ��������
// ////////////////////////////////////////////
import java.util.Iterator;
import java.util.Vector;


// ������һ��J_VectorFor��
public class J_VectorFor 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		Vector <String> a = new Vector <String> ();
		a.add("a");
		a.add("b");
		a.add("c");
		
		//��һ��for��д��
		//����Ϳ϶�ֻ���õ�Vector�µĶ���
		for (String c:a){
			System.out.print(c+", ");
		}
		System.out.println();
		//��һ�ּ�for��д������import IteraterҲ����...
		//Vector�ڲ����Ѿ��е�������...
		//��Ȼ�����������ʽ�򻯶���,����ʵ����iterator�ķ����Ѿ�д��Vector����..		
	
	
	
	
		//Vector�Դ�iterator()����ѽ,����...
		//����˵���ṩ��Iteratorһ����ڻ����ǳ�ʼ����??	
		for(Iterator<String> i = a.iterator(); i.hasNext();){
			String c = i.next();
			System.out.print(c+", ");
		} // for ѭ������
		System.out.println();
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_VectorFor ����