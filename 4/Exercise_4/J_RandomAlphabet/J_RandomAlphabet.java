// ////////////////////////////////////////////
//
// J_RandomAlphabet.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			例程
// ////////////////////////////////////////////
// 定义了一个J_RandomAlphabet类
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
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
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
		System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_RandomAlphabet 结束
/*
OUTPUT:
Java,Hello!
arbhbtdrig
abbdghirrt
(o゜▽゜)o☆[BINGO!]
*/