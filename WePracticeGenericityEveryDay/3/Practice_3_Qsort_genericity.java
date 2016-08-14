interface SHPE
{
	public abstract String name();
	public abstract double Area();
}

class J_Cir implements SHPE
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
		return "circle";
	}
	public double Area()
	{
		return PI*radius*radius;
	}
}

class J_Rec implements SHPE
{
	private double width;
	private double lenth;
	public J_Rec()
	{
		width = 1;
		lenth = 1;
	}
	public J_Rec(double w,double l)
	{
		width = w;
		lenth = l;
	}
	public String name()
	{
		return "rectangle";
	}
	public double Area()
	{
		return width*lenth;
	}
}

class F <T extends SHPE>
{
	void OUT(T t)
	{
		System.out.println("The area of "+t.name()+" is "+t.Area());
	}
}

public class Practice_3_Qsort_genericity
{
	public static void main(String args[])
	{
		F <J_Cir> a = new F <J_Cir> ();
		a.OUT();
		F <J_Rec> b = new F <J_Rec> ();
		b.OUT();
	}
}