//Another_Try.java
//ClassF1.java
//练习泛型1
interface SHPE 
{
	public double area();
	public abstract String name();
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
		return "Circle";
	}
	public double area()
	{
		return PI*radius*radius;
	}
}
class J_Rec implements SHPE
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
	public double area()
	{
		return wid*len;
	}
}
class F <T extends SHPE>
{
	public T t;
	F(){
		System.out.println("F 的构造函数被调用");
	}
	public void OUT(T t)
	{
		System.out.println(t.name()+"'s area is "+t.area());
	}
}
public class Another_Try
{
	public static void main(String args[])
	{
		F <J_Cir> a = new F <J_Cir> ();
		a.OUT(new J_Cir(2));
		//用的时候这样用
	}
}