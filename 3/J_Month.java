// ////////////////////////////////////////////
//
// J_Month.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			get-set��������
// ////////////////////////////////////////////
// ������һ��J_Month��
public class J_Month 
{
	private int m_month = 1; // �·�,Ҫ��ȡֵ��1��12
	
	public int mb_getMonth()
	{
		return m_month;
	} // ���� mb_getMonth ����
	
	public int mb_setMonth(int m)
	{
		if (m<1){
			m_month = 1;
		}else if (m>12){
			m_month = 12;
		}else {
		m_month=m;
		}
		return m_month;
	} // ���� mb_setMonth ����
} //�� J_Month ����