// ////////////////////////////////////////////
//
// J_Circle.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			Բ����
// ////////////////////////////////////////////
// ������һ��J_Circle��
public class J_Circle implements J_Shape
{
	public double m_x,m_y; // Բ������
	public double m_radius; // �뾶
	
	public J_Circle(double r)
	{
		m_x = 0;
		m_y = 0;
		m_radius = r;
	} // J_Circle ���췽������
	
	public J_Circle (double x,double y,double r)
	{
		m_x = x;
		m_y = y;
		m_radius = r;
	} // J_Circle ���췽������
	
	public double mb_getArea()
	{
		return (Math.PI*m_radius*m_radius);
	} // ���� mb_getArea ����
} //�� J_Circle ����