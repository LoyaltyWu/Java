// ////////////////////////////////////////////
//
// J_RandomAlphabet.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			����
// ////////////////////////////////////////////
// ������һ��J_RandomAlphabet��
public class J_RandomAlphabet 
{
	private static void quickSort(int a[],int start,int end){
		if (!(start<end))return;
		int flag = a[start];
		int index = start;
		int fr = start;
		int ba = end;
		while (fr<ba){
			while (a[ba]>=flag&&fr<ba){
				ba--;
			}
			//a[ba]<=flag need to go to front
			a[fr]=a[ba];
			while(a[fr]<=flag&&fr<ba){
				fr++;
			}
			//a[fr]>=flag need to switch to back
			a[ba]=a[fr];
		}
		int mid = ba;
		a[ba] = flag;
		quickSort(a,start,mid-1);
		quickSort(a,mid+1,end);
	}
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		int [] boring  = new int [10];
		char [] look = new char [10];
		for (int i =0;i<10;i++){
			boring[i] = (int)(Math.random()*26+0.5);
			while (boring[i]==0){
				boring[i] = (int)(Math.random()*26+0.5);
			}
			char a = 'a';
			System.out.print((char)(a+boring[i]-1));
		}
		quickSort(boring,0,9);
		System.out.println();System.out.println();System.out.println();
		for (int i =0;i<10;i++){
			char a = 'a';
			System.out.print((char)(a+boring[i]-1));
		}
		System.out.println();
		System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_RandomAlphabet ����
/*
OUTPUT:
Java,Hello!
arbhbtdrig
abbdghirrt
(o�b���b)o��[BINGO!]
*/