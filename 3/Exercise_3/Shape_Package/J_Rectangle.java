// ////////////////////////////////////////////
//
// J_Rectangle.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			简单招呼程序例程
// ////////////////////////////////////////////
// 定义了一个J_Rectangle类
package SHAPE.SH;
import SHAPE.SH.J_AbstractShape;
public class J_Rectangle extends J_AbstractShape
{
	/*
	public double Circuit;
	public double Area;
	public abstract double mb_getArea();
	public abstract double mb_getCircuit();
	*/
	private double minX,maxX,minY,maxY;
	private double Circuit;
	private double Area;
	public J_Rectangle(){
		minX=0;
		minY=0;
		maxX=1;
		maxY=1;
		Circuit = 4;
		Area = 1;
	}
	public J_Rectangle(double mx,double my,double x,double y){
		if (mx<x){
			minX=mx;
			maxX=x;
		}else {
			minX=x;
			maxX=mx;
		}
		if (my<y){
			minY=my;
			maxY=y;
		}else {
			minY=y;
			maxY=my;
		}
		Circuit = 2*((maxX-minX)+(maxY-minY));
		Area = ((maxX-minX)*(maxY-minY));
	}
	public void setRectangle(int mx,int my,int x,int y){
		if (mx<x){
			minX=mx;
			maxX=x;
		}else {
			minX=x;
			maxX=mx;
		}
		if (my<y){
			minY=my;
			maxY=y;
		}else {
			minY=y;
			maxY=my;
		}
		Circuit = 2*((maxX-minX)+(maxY-minY));
		Area = ((maxX-minX)*(maxY-minY));
	}
	public double mb_getCircuit(){
		return Circuit;
	}
	public double mb_getArea(){
		return Area;
	}
} //类 J_Rectangle 结束