// ////////////////////////////////////////////
//
// J_HelloApplet.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
// 			���к�СӦ�ó�������
// ////////////////////////////////////////////

// �ؼ���import��������һ���������������߽ӿڵ�

import java.awt.Graphics;
// ����ϵͳ���ṩ����java.awt.Graphics
// java.awt.Graphics��Graphics����������

import javax.swing.JApplet;
// ����ϵͳ���ṩ����java.swing.JApplet
// javax.swing.JApplet��JApplet����������


// �������඼�Ǵ����������

public class J_HelloApplet extends JApplet 
// ������һ��J_HelloApplet��
// extends������ǰ���������JApplet������
// ��ǰ�����J_HelloApplet��JApplet�����࣬��������һ��СӦ�ó���
// J_HelloApplet������������ڵ��ļ�ͬ��
{
	public void paint (Graphics g)
	//���� Graphics �������ͨ������g��ʵ����СӦ�ó����ͼ�ν����ͼ�λ��ƹ��ܡ�
	{
		g.clearRect(0,0,getWidth(),getHeight());
		//Graphics��ĳ�Ա����cleanRect����
		g.drawString("СӦ�ó�������!",10,20);
	} // ���� paint ����
} //�� J_HelloApplet ����