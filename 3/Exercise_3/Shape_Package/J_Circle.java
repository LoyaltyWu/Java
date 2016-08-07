// ////////////////////////////////////////////
//
// J_Circle.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			简单招呼程序例程
// ////////////////////////////////////////////
// 定义了一个J_Circle类
package SHAPE.SH;
import SHAPE.SH.J_AbstractShape;
public class J_Circle extends J_AbstractShape
{
	/*
	public double Circuit;
	public double Area;
	public abstract double mb_getArea();
	public abstract double mb_getCircuit();
	*/
	private double radius;
	private double Circuit;
	private double Area;
	private final double PI = Math.PI;;
	public J_Circle(){
		radius = 0;
		Circuit = 0;
		Area = 0;
	}
	public J_Circle(double r){
		radius = r;
		Circuit = 2.0*PI*r;
		Area = r*PI*r;
	}
	public void setCircle(double r){
		radius = r;
		Circuit = 2.0*PI*r;
		Area = r*PI*r;
	}
	public double mb_getCircuit(){
		return Circuit;
	}
	public double mb_getArea(){
		return Area;
	}
} //类 J_Circle 结束