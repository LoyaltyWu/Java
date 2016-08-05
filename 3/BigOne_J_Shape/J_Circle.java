// ////////////////////////////////////////////
//
// J_Circle.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			圆例程
// ////////////////////////////////////////////
// 定义了一个J_Circle类
public class J_Circle implements J_Shape
{
	public double m_x,m_y; // 圆心坐标
	public double m_radius; // 半径
	
	public J_Circle(double r)
	{
		m_x = 0;
		m_y = 0;
		m_radius = r;
	} // J_Circle 构造方法结束
	
	public J_Circle (double x,double y,double r)
	{
		m_x = x;
		m_y = y;
		m_radius = r;
	} // J_Circle 构造方法结束
	
	public double mb_getArea()
	{
		return (Math.PI*m_radius*m_radius);
	} // 方法 mb_getArea 结束
} //类 J_Circle 结束