// 8-16 Java Genericity Pre
// J_Gen5.java
interface Shpe
{
	public abstract double getArea();
	public abstract String getName();
}
class Rec implements Shpe
{
	private double width;
	private double lenth;
	public Rec(){
		width = 1;
		lenth = 6;
	}
	public Rec(double w,double l){
		width = w;
		lenth = l;
	}
	public double getArea(){
		return width * lenth;
	}
	public String getName(){
		return "rectangle";
	}
}
class Cir implements Shpe
{
	private final double PI = Math.PI;
	private double radius;
	public Cir()
	{
		radius = 1;
	}
	public Cir(double r)
	{
		radius = r;
	}
	public double getArea()
	{
		return radius*radius*PI;
	}
	public String getName()
	{
		return "Circle";
	}
}
class F <T extends Shpe>
{
	void OUT(T t){
		System.out.println("Its name is "+t.getName()+", and its area is "+t.getArea());
		return;
	}
}
public class J_Gen5
{
	public static void main (String args[]){
		F <Cir> c = new F<Cir>();
		c.OUT(new Cir(3));
		F <Rec> r = new F<Rec>();
		r.OUT(new Rec(8,9));
		return;
	}
} 