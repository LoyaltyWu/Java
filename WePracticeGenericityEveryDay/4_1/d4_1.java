interface shpe
{
	abstract public String name();
	abstract public double area();
}

class cir implements shpe
{
	private double radius;
	private double PI = Math.PI;
	public cir(double r)
	{
		radius = r;
	}
	public String name()
	{
		return "circle";
	}
	public double area()
	{
		return PI*radius*radius;
	}
}

class rec implements shpe
{
	private double width,lenth;
	public rec(double l,double w)
	{
		lenth = l;
		width = w;
	}
	public String name()
	{
		return "rectangle";
	}
	public double area()
	{
		return lenth*width;
	}
}

class o <T extends shpe>
{
	public void out(T t)
	{
		System.out.println(t.name()+" "+t.area());
	}
}
public class d4_1
{
	public static void main(String args[]){
		o <cir> a = new o<cir>();
		a.out(new cir(88));
		o <rec> b = new o <rec>();
		b.out(new rec(1,7));
	}
}
/*
circle 24328.493509399355
rectangle 7.0
*/