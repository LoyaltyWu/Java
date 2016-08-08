// ////////////////////////////////////////////
//
// J_WeakHashMap.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��WeakHashMap���Զ�ȥ��һЩ"������"Ԫ��(�ؼ��ּ���Ӧ��ֵ)������
// ////////////////////////////////////////////
// ������һ��J_WeakHashMap��
import java.util.WeakHashMap;

public class J_WeakHashMap 
{
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int s = 800;
		WeakHashMap<String, String> ht = new WeakHashMap <String,String>(s*4/3,0.75f);
		
		
		// ��WeakHashMapʵ���������Ԫ��
		int i;
		for (i = 0;i<s;i++){
			ht.put(("key"+i),("value"+i));//Ԫ�عؼ���,Ԫ�ص�ֵ
		}
		System.out.println("�ڸո����������ʱ,����ϣ�������:"+ht.size());
		
		// ���еĽ���Ǵӵ�һ��Ԫ�ؿ�ʼ,�����Ѿ���������ϣ�����ˡ���
		// ����Ѿ�����WeakHashMapʵ�������е�Ԫ�أ�����,�ȴ�����ϣ��ɾ��Ԫ��
		System.out.println("һ��ʱ���,����ϣ��Ԫ�ظ�����:"+ht.size());
		
		System.out.println("һ��ʱ���,����ϣ��Ԫ�ظ�����:"+ht.size());
		for(i = 0;i<s;){
			if (!ht.containsKey("key"+i))
				//System.out.print("key"+i);
			if (ht.size()!=s)
				i++;
		} // ѭ������	
		System.out.println("");
		System.out.println("һ��ʱ���,����ϣ��Ԫ�ظ�����:"+ht.size());
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_WeakHashMap ����