// ////////////////////////////////////////////
//
// J_2008Olympics.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			趣数题例程
// ////////////////////////////////////////////
// 定义了一个J_2008Olympics类
public class J_2008Olympics 
{
	private static void initData(int array[]){
		array[2]=9;
		array[7]=0;
		for (int i = 0;i<10;i++){
			if (i==2){
				continue;
			}
			if (i==7){
				continue;
			}
			array[i]=0;
		}
	}
	//dataCheck#1
	private static boolean dataCheck (int array[]){
		int i = 0;
		int [] arr = new int [10];
		for (i = 0;i<10;i++){
			if (array[i]>=10){
				return false;
			}
			arr[i]=0;
		}
		for (i = 0;i<10;i++){
			
			arr[array[i]] = 1;
		}
		for (i = 0;i<10;i++){
			if (arr[i]==0){
				return false;
			}
		}
		return true;
	}
	
	private static void Com (int array[]){
		for (int i = 20;i<=99;i++){
			array[3]=i/10;
			array[4]=i%10;
			array[8]=array[3]+5;
			array[9]=array[4]+8;
			for (int j = 0;j<99;j++){
				array[0]=j/10;
				array[1]=j%10;
				array[5]=array[0]+2;
				array[6]=array[1]+1;
				if (dataCheck(array)){
					pri(array);
				}
			}
		}
	}
	
	private static boolean dataEnd(int array[]){
		for (int i = 0;i<10;i++){
			if (array[i]!=9)return false;
		}
		return true;
	}
	
	//dataCheck#2
	//bigDataAdd
	/*
		[0][1][2][3][4]
	+  2  0	 0  8  5
		[5][6][7][8][9]
	*/
	
	//bigDataPrint
	/*
		[0][1][2][3][4]
	+  2  0	 0  8  5
		[5][6][7][8][9]
	*/
	
	private static void pri(int array[]){
		System.out.print(" ");
		for (int i = 0;i<5;i++){
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("+20085");
		System.out.print(" ");
		for (int i = 0;i<5;i++){
			System.out.print(array[i+5]);
		}
		System.out.println();System.out.println();System.out.println();
	}
	
	/*
	private static void all (){
		int [] a = new int [10];
		for (initData(a);(!dataEnd(a));dataNext(a)){
			if (dataCheck(a)){
				
			}
		}
	}
	*/
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		//all();
		int [] a = new int [10];
		initData(a);
		Com(a);
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_2008Olympics 结束