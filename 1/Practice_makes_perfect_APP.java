import java.awt.Graphics;
import javax.swing.JApplet;
public class Practice_makes_perfect_APP extends JApplet
//记得是JApplet的子类哟
{
	public void paint(Graphics g)
	{
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawString("****************************************",20,40);
		g.drawString("** Practice makes perfect APP",20,60);
		g.drawString("****************************************",20,80);
	}
}