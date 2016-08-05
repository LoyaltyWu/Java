// ////////////////////////////////////////////
//
// J_Rectangle.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			矩形例程
// ////////////////////////////////////////////
// 定义了一个J_Rectangle类
public class J_Rectangle implements J_Shape
{
	public double m_minX,m_minY; // 第1个角点坐标
	public double m_maxX,m_maxY; // 第2个角点坐标
	
	public J_Rectangle(double x1,double y1,double x2,double y2)
	{
		if(x1<x2)
		{
			m_minX = x1;
			m_maxX = x2;
		}
		else 
		{
			m_minX = x2;
			m_maxX = x1;
		} // if-else结构结束
		if(y1<y2)
		{
			m_minY = y1;
			m_maxY = y2;
		}
		else 
		{
			m_minY = y2;
			m_maxY = y1;
		} // if-else结构结束
	} // J_Rectangle 构造方法结束
	
	
	// 计算并返回形状的面积
	public double mb_getArea()
	{
		return (m_maxX-m_minX)*(m_maxY-m_minY);
	} // 方法 mb_getArea 结束
} //类 J_Rectangle 结束