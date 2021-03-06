//ClassF1.java
//��ϰ����1
interface Shpe 
{
	public double Area();
	public abstract String name();
}
class J_Cir implements Shpe
{
	private final double PI = Math.PI;
	private double radius;
	public J_Cir()
	{
		radius = 1;
	}
	public J_Cir(double r)
	{
		radius = r;
	}
	public String name()
	{
		return "Circle";
	}
	public double Area()
	{
		return PI*radius*radius;
	}
}
class J_Rec implements Shpe
{
	private double wid;
	private double len;
	public J_Rec()
	{
		wid = 6;
		len = 1;
	}
	public J_Rec(double w,double l)
	{
		wid = w;
		len = l;
	}
	public String name()
	{
		return "Rectangle";
	}
	public double Area()
	{
		return wid*len;
	}
}
class F <T extends Shpe>
{
	public void OUT(T t)
	{
		System.out.println(t.name()+"'s area is "+t.Area());
	}
}
public class ClassF1
{
	public static void main(String args[])
	{
		/*
		Shpe a = new J_Cir();
		System.out.println("The area of the circle is "+a.Area());
		a = new J_Rec();
		System.out.println("The area of the rectangle is "+a.Area());
		*/
		F <J_Cir> a = new F <J_Cir> ();
		a.OUT(new J_Cir());
		F <J_Rec> b = new F <J_Rec> ();
		b.OUT(new J_Rec());
		F <J_Cir> c = new F <J_Cir> ();
		c.OUT(new J_Cir());
		F <J_Rec> d = new F <J_Rec> ();
		d.OUT(new J_Rec());
	}
}