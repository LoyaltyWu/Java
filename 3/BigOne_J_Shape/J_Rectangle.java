// ////////////////////////////////////////////
//
// J_Rectangle.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			��������
// ////////////////////////////////////////////
// ������һ��J_Rectangle��
public class J_Rectangle implements J_Shape
{
	public double m_minX,m_minY; // ��1���ǵ�����
	public double m_maxX,m_maxY; // ��2���ǵ�����
	
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
		} // if-else�ṹ����
		if(y1<y2)
		{
			m_minY = y1;
			m_maxY = y2;
		}
		else 
		{
			m_minY = y2;
			m_maxY = y1;
		} // if-else�ṹ����
	} // J_Rectangle ���췽������
	
	
	// ���㲢������״�����
	public double mb_getArea()
	{
		return (m_maxX-m_minX)*(m_maxY-m_minY);
	} // ���� mb_getArea ����
} //�� J_Rectangle ����