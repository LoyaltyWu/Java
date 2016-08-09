// ////////////////////////////////////////////
//
// J_EightQueen.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			八皇后例程
// ////////////////////////////////////////////
// 定义了一个J_EightQueen类
public class J_EightQueen 
{
	private static void pri(){
		for (int i = 0;i<8;i++){
			System.out.print("+-");
		}
		System.out.println("+");
	}
	
	private static void pri(int a){
		for (int i = 0;i<8;i++){
			if (i==a){
				System.out.print("|Q");
			}else{
				System.out.print("| ");
			}
		}
		System.out.println("|");
	}
	
	private static void priQueen(int array[]){
		for (int i = 0;i<8;i++){
			pri();
			pri(array[i]);
		}
		pri();
	}
	
	private static void initData(int array[]){
		for (int i = 0;i<8;i++){
			array[i] = i;
		}
	}
	
	private static boolean dataCheck (int array[]){
		int i = 0;
		int [] arr = new int [8];
		for (i = 0;i<8;i++){
			arr[i]=0;
		}
		for (i = 0;i<8;i++){
			arr[array[i]] = 1;
		}
		for (i = 0;i<8;i++){
			if (arr[i]==0){
				return false;
			}
		}
		return true;
	}
	
	private static void dataNext (int array[]){
		for (int i=7;i>=0;i--){
			if (array[i]==7){
				array[i] = 0;
			}
			else {
				array[i]++;
				return;
			}
		}
	}
	
	private static boolean dataEnd(int array[]){
		for (int i = 0;i<8;i++){
			if (array[i]!=7)return false;
		}
		return true;
	}
	
	private static void makeArray(){
		int i = 0;
		int [] array = new int [8];
		for (initData(array);(!dataEnd(array));dataNext(array)){
			if (dataCheck(array)){
				priQueen(array);
				System.out.println();System.out.println();
				//i++;//40320 = 8!算法正常终止
				//System.out.println(i);//最终输出40320程序能终止...
			}
		}
		
	}
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		makeArray();
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 J_EightQueen 结束