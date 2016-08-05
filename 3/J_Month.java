// ////////////////////////////////////////////
//
// J_Month.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			get-set程序例程
// ////////////////////////////////////////////
// 定义了一个J_Month类
public class J_Month 
{
	private int m_month = 1; // 月份,要求取值从1到12
	
	public int mb_getMonth()
	{
		return m_month;
	} // 方法 mb_getMonth 结束
	
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
	} // 方法 mb_setMonth 结束
} //类 J_Month 结束