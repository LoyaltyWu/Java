import java.awt.Graphics;
import javax.swing.JApplet;
public class Practice_makes_perfect_APP extends JApplet
//�ǵ���JApplet������Ӵ
{
	public void paint(Graphics g)
	{
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawString("****************************************",20,40);
		g.drawString("** Practice makes perfect APP",20,60);
		g.drawString("****************************************",20,80);
	}
}