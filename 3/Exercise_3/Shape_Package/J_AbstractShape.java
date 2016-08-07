// ////////////////////////////////////////////
//
// J_AbstractShape.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			形状抽象类
// ////////////////////////////////////////////
// 定义了一个J_AbstractShape类
package SHAPE.SH;
abstract public class J_AbstractShape 
{
	public double Circuit = 0;
	public double Area = 0;
	public abstract double mb_getArea();
	public abstract double mb_getCircuit();
} //类 J_AbstractShape 结束