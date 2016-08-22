// G7.java
interface SHPE
{
	public abstract double getArea();
	public abstract String getName();
}

class J_Cir implements SHPE
{
	private double radius;
	private final double PI = Math.PI;
	public J_Cir(){
		radius = 1;
	}
	public J_Cir(double r){
		radius = r;
	}
	
	public double getArea(){
		return PI*radius*radius;
	}
	public double getRadius(){
		return radius;
	}
	public String getName(){
		return "circle";
	}
	
	public void setRadius(double r){
		radius = r;
	}
}

class J_Rec implements SHPE
{
	private double width;
	private double lenth;
	
	public J_Rec()
	{
		width = 1;
		lenth = 6;
	}
	
	public J_Rec(double w,double l)
	{
		width = w;
		lenth = l;
	}
	
	public void setWNL(double w,double l){
		width = w;
		lenth = l;
	}
	public void setWidth(double w){
		width = w;
	}
	public void setLenth(double l){
		lenth = l;
	}
	
	public double getLenth(){
		return lenth;
	}
	
	public String getName()
	{
		return "Rectangle";
	}
	public double getArea()
	{
		return width*lenth;
	}
}

class F <T extends SHPE>
{
	void out(T t){
		System.out.println("The area of "+t.getName()+" is "+t.getArea());
	}
}

public class G7
{
	public static void main (String [] args){
		F <J_Cir> a = new F <J_Cir> ();
		a.out(new J_Cir(3));
		F <J_Rec> b = new F <J_Rec> ();
		b.out(new J_Rec(6,8));
		System.out.println("(o©b¨Œ©b)o¡î[BINGO!]");
		return;
	}
}