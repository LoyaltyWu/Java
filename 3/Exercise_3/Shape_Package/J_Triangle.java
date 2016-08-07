// ////////////////////////////////////////////
//
// J_Triangle.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			简单招呼程序例程
// ////////////////////////////////////////////
// 定义了一个J_Triangle类
package SHAPE.SH;
import SHAPE.SH.J_AbstractShape;
public class J_Triangle extends J_AbstractShape
{
	/*
	public double Circuit;
	public double Area;
	public abstract double mb_getArea();
	public abstract double mb_getCircuit();
	*/
	private double a1,a2,a3;
	private double Circuit;
	private double Area;
	public J_Triangle(){
		a1 = 0;
		a2 = 0;
		a3 = 0;
		Circuit = 0;
		Area = 0;
	}
	public J_Triangle(double a,double b,double c){
		a1 = a;
		a2 = b;
		a3 = c;
		Circuit = a+b+c;
		double cosA = (b*b+c*c-a*a)/(2.0*b*c);
		double sinA = Math.sqrt(1-cosA*cosA);
		Area = 0.5*sinA*b*c;
	}
	public void setTriangle(double a,double b,double c){
		a1 = a;
		a2 = b;
		a3 = c;
		Circuit = a+b+c;
		double cosA = (b*b+c*c-a*a)/(2.0*b*c);
		double sinA = Math.sqrt(1-cosA*cosA);
		Area = 0.5*sinA*b*c;
	}
	public double mb_getCircuit(){
		return Circuit;
	}
	public double mb_getArea(){
		return Area;
	}
} //类 J_Triangle 结束