// ////////////////////////////////////////////
//
// J_GenericityShape.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			����ShapeAreaInterface����
// ////////////////////////////////////////////
// ������һ��J_GenericityShape��
public class J_GenericityShape {
    public static void main(String[] args) {
        Shpe square = new Square();
        Shpe circle = new Circle();
 
        System.out.println("��Ϊ2�����������" + square.area(2));
        System.out.println("�뾶Ϊ3��Բ�����" + circle.area(3));
        F<Circle> test = new F<Circle>(  );
        //ʵ�����ĸ�ʽ
        test.me(new Circle(),3);//��Ϊ���ܴ����ͱ�����ȥ,��Ϊ��û�ж�Ӧ�Ĺ��췽�������Ǵ�һ�������ȥ
        F<Square> t = new F <Square>();
        t.me (new Square(),2);
    }
}

class F <T extends Shpe>
{
	public void me(T t,double i)
	{
		System.out.println(t.area(i));
	}// ���� me ����
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
��Ϊ2�����������4.0
�뾶Ϊ3��Բ�����28.274333882308138
*/