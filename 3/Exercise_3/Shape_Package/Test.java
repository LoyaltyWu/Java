// ////////////////////////////////////////////
//
// Test.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���к���������
// ////////////////////////////////////////////
// ������һ��Test��
import SHAPE.SH.J_AbstractShape;
import SHAPE.SH.J_Triangle;
import SHAPE.SH.J_Rectangle;
import SHAPE.SH.J_Circle;
class Test
{
	public static void main(String args[]){
		/*
		J_Triangle(double a,double b,double c);
		J_Rectangle(int mx,int my,int x,int y);
		J_Circle(double r);
		*/
		J_AbstractShape a = new J_Triangle(3.0,4.0,5.0);
		System.out.println("The area of the triangle A is "+a.mb_getArea()+" and its circuit is "+a.mb_getCircuit());
		a = new J_Rectangle(0.0,0.0,1.0,3.0);
		System.out.println("The area of the rectangle A is "+a.mb_getArea()+" and its circuit is "+a.mb_getCircuit());
		a = new J_Circle(10.0);
		System.out.println("The area of the circle A is "+a.mb_getArea()+" and its circuit is "+a.mb_getCircuit());
	} // ���� main ����
} // �� Test ����