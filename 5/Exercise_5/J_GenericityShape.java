// ////////////////////////////////////////////
//
// J_GenericityShape.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			泛型ShapeAreaInterface例程
// ////////////////////////////////////////////
// 定义了一个J_GenericityShape类
public class J_GenericityShape {
    public static void main(String[] args) {
        Shpe square = new Square();
        Shpe circle = new Circle();
 
        System.out.println("长为2的正方形面积" + square.area(2));
        System.out.println("半径为3的圆形面积" + circle.area(3));
        F<Circle> test = new F<Circle>(  );
        //实例化的格式
        test.me(new Circle(),3);//因为不能传类型变量过去,因为会没有对应的构造方法所以是传一个对象过去
        F<Square> t = new F <Square>();
        t.me (new Square(),2);
    }
}

class F <T extends Shpe>
{
	public void me(T t,double i)
	{
		System.out.println(t.area(i));
	}// 方法 me 结束
}
interface Shpe {
	double area(double d);
}
 
class Square implements Shpe {
 
    @Override
    public double area(double d) {
        return d * d;
    }
 
}
 
class Circle implements Shpe {
 
    @Override
    public double area(double d) {
        return Math.PI * d * d;
    }
 
}

/*
长为2的正方形面积4.0
半径为3的圆形面积28.274333882308138
*/