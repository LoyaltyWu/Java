// ////////////////////////////////////////////
//
// Exercise_2.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			习题2
// ////////////////////////////////////////////
// 定义了一个Exercise_2类
public class Exercise_2 
{
	public static void main (String args[])
	{
		//System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		//switch(choice){
		//Case '1':
		Exercise_1:
		{
			int [] binary = new int [32];
			//int lBinary [] ;
			int a1 []={11,33,105,7,-9,-5,-111,-28,-65};
			int tmp = 0;
			for (int i = 0;i<9;i++){
				if (a1[i]>=0){
					tmp = a1[i];
					int index=0;
					while (tmp!=0){
						binary[index++]=tmp%2;
						tmp/=2;
					}
					for (int j = 31;j>=0;j--){
						System.out.print(binary[j]);
					}
				}else {
					System.out.println("Original:"+a1[i]);
					a1[i]=(-a1[i]);
					System.out.println("Opposite:"+a1[i]);
					a1[i]=~a1[i];
					a1[i]+=1;
					////////////////////////////////////////////
					System.out.println(Integer.toBinaryString(a1[i]));
					////////////////////////////////////////////
				}
				System.out.println();
				for (int l = 0;l<32;l++){
					binary[l]=0;
				}
			}
			long []a1_1=new long [9];
			for (int k = 0;k<9;k++){
				a1_1[k]=a1[k];
			}
		}
		//Case '2':
		Exercise_2:
		{
			System.out.println("(int)5.2/2.5       "+(int)5.2/2.5);
			//2XXXX2.0
			System.out.println("1+4/5+(int)5.2/2.5 "+(1+4/5+(int)5.2/2.5));
			//3XXXX3.0
			System.out.println("1+4/5+5.2/2.5      "+(1+4/5+5.2/2.5));
			//1+2.08==3.08
			System.out.println("1.0+4/5+5.2/2.5    "+(1.0+4/5+5.2/2.5));
			//1.0+0+2.08 ==3.08
			System.out.println("1+4/5+5.2/2.5      "+(1+4/5+5.2/2.5));
			//1+0+2.08 == 3.08
			int a = 12;
			System.out.println("(++a)+(a++)        "+((++a)+(a++)));
			//13+13==26
			System.out.println("10>>2              "+(10>>2));
			//2
			System.out.println("10&11|12           "+(10&11|12));
			//1010 & 1011  = 1010    1010|1100 =1110 14
			System.out.println("5^7                "+(5^7));
			//^异或 101异或111==010 == 2!!!!!!!
			System.out.println("(-5|(~5))          "+(-5|(~5)));
			//1111 1011|(~0000 0101) == 1111 1011|1111 1010 == 1111 1011 == -5
			System.out.println("true               "+true);
			System.out.println("false              "+false);
			//Byte.toBinaryString()
			System.out.println("(true^false)&&true "+((true^false)&&true));
			//0000 0001^0000 0000  ==0000 0001 == true        true&&true == true
			System.out.println("(((!true)|false)||(!false))     "+(((!true)|false)||(!false)));
			//0000 0000 | 0000 0000 == 0000 0000      false||true == true
		}
		Exercise_3:
		{
			//J_Example;
		}
		Exercise_4:
		{
			int a = 1;
			System.out.println((true|(++a==1)&(a==2)));
			//1|0==1   1&1 == 1 true
			//a==2
			a = 1;
			System.out.println((true||(++a==1))&(a==2));
			//true||///   //后面这步没执行
			//true&false
			//==false
			a = 12;
			System.out.println(a*=2+3);
			//a==24 表达式24+3==27
			//
		}
		Exercise_5:
		{
			/*
											强弱关系
		
    	byte < short  \
    	               } < int < long < float < double
    	        char  /
			*/
			//System.out.println(01&&(4+6));
			//这个就不行了。。
			//因为boolean不能强制转换成int的样子
			//1&&(10)==true&&true==true
			System.out.println(4.2%2.1);
			//这个反而可以。。。。。
			//不行我觉得
			System.out.println('a'>'A');
			//061>041 == true
			System.out.println('1'==1);
			//'1'
			//false
		}
		Exercise_6:
		{
			//System.out.print(" ");
			//System.out.print("*");
			//System.out.println("*");
			for (int i = 0;i<4;i++){
				for (int j = 1;j<4-i;j++){
					System.out.print(" ");
				}
				for (int j = 0;j<(2*i+1);j++){
					if (j==(2*i)){
						System.out.println("*");
						break;
					}
					System.out.print("*");
				}
			}
			for (int i = 0 ;i<3;i++){
				for (int j = -1;j<i;j++){
					System.out.print(" ");
				}
				for (int j = 0;j<(2*(2-i)+1);j++){
					if (j==(2*(2-i))){
						System.out.println("*");
						break;
					}
					System.out.print("*");
				}
			}
		}
		Exercise_7:
		{
			int i = 0;
			int j = 0;
			while (i<4){
				j = 1;
				while (j<(4-i)){
					System.out.print(" ");
					j++;
				}
				j = 0;
				while (j<(2*i+1)){
					if (j==(2*i)){
						System.out.println("*");
						break;
					}
					System.out.print("*");
					j++;
				}
				i++;
			}
			i = 0;
			while (i<3){
				j = -1;
				while (j<i){
					System.out.print(" ");
					j++;
				}
				j = 0;
				while (j<(2*(2-i)+1)){
					if (j==(2*(2-i))){
						System.out.println("*");
						break;
					}
					System.out.print("*");
					j++;
				}
				i++;
			}
			i = 0;
			j = 0;
			int flag =  1;
			int flag2 = 1;
			do{
				j = flag;
				do{
					System.out.print(" ");
					j++;
				}while (j<(4-i+flag2));
				j = flag-1;
				do{
					if (j==(2*i)){
						System.out.println("*");
						break;
					}
					System.out.print("*");
					j++;
				}while (j<(2*i+1+flag2));
				i++;
			}while (i<4);
			i = 0;
			do{
				j = flag-2;
				do{
					System.out.print(" ");
					j++;
				}while (j<(i+flag2));
				j = flag-1;
				do {
					if (j==(2*(2-i))){
						System.out.println("*");
						break;
					}
					System.out.print("*");
					j++;
				}while (j<(2*(2-i)+1+flag2));
				i++;
			}while (i<3);
		}
		Exercise_8:
		{
			int i = 0;
			/*
			while (i<10);//题目这里神他妈多了个分号,又是dead loop
			{
				i++;
				System.out.println(i+"; ");
			}
			//改好的:(就是把多的分号去掉)
			while (i<10)
			{
				i++;
				System.out.println(i+"; ");
			}
			*/
			/*
			for (double x = 0.1;x!=1.0;x+=0.1){
				//这个是一定不行的,因为双精度,有误差
				System.out.println(x+"; ");
			}
			*/
			int sum;
			/*
			while (i<=100)
				sum+=i;
				i++;//题目给的原来是这样，直接dead end loop i++在
			//改好的:
			while (i<=100){
				sum+=i;
				i++;
			}*/
		}
		Exercise_9:
		{
			int i = 0;
			int j = 0;
			while (i<4){
				j = 1;
				while (j<(4-i)){
					System.out.print(" ");
					j++;
				}
				j = 0;
				while (j<(2*i+1)){
					if (j==(2*i)){
						System.out.println("*");
						break;
					}
					if(j==3&&i==3){/////////////////+控制
						System.out.print("+");
					}else {
						System.out.print("*");
					}
					j++;
				}
				i++;
			}
			i = 0;
			while (i<3){
				j = -1;
				while (j<i){
					System.out.print(" ");
					j++;
				}
				j = 0;
				while (j<(2*(2-i)+1)){
					if (j==(2*(2-i))){
						System.out.println("*");
						break;
					}
					System.out.print("*");
					j++;
				}
				i++;
			}
		}
		Exercise_10:
		{
			//prime number from 50 to 100
			boolean flag = true;
			for (int i = 50;i<101;i++){
				for (int j = 2;j<i/2;j++){
					if (i%j==0){
						flag = false;
						break;
					}
				}
				if (flag){
						System.out.print(i+" ");
				}
				flag = true;
			}
			System.out.println();
		}
		Exercise_11:
		{
			System.out.println();;
			double sum = 0;
			double sub = 1;
			for (sub = 1;sub<21;sub++){
				double tmp = sub;
				for (double i = 0;i<(tmp-1);i+=1.0){
					sub *= tmp;
				}
				System.out.println(sub);
				sum += sub;
				System.out.println(tmp);
				sub = tmp;
				System.out.println(sub);;
				System.out.println();;
			}
			System.out.println(sum);
			/*
			System.out.println(Integer.toBinaryString(312066588));
			System.out.println((int)312066588);
			*/
		}
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 Exercise_2 结束