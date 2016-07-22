// ////////////////////////////////////////////
//
// J_HelloApplet.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
// 			简单招呼小应用程序例程
// ////////////////////////////////////////////

// 关键字import用来导入一个软件包或者类或者接口等

import java.awt.Graphics;
// 导入系统所提供的类java.awt.Graphics
// java.awt.Graphics是Graphics的完整名称

import javax.swing.JApplet;
// 导入系统所提供的类java.swing.JApplet
// javax.swing.JApplet是JApplet的完整名称


// 这两个类都是带软件包的类

public class J_HelloApplet extends JApplet 
// 定义了一个J_HelloApplet类
// extends表明当前定义的类是JApplet的子类
// 当前定义的J_HelloApplet是JApplet的子类，所以它是一个小应用程序
// J_HelloApplet类必须与它所在的文件同名
{
	public void paint (Graphics g)
	//关于 Graphics 这里可以通过控制g来实现在小应用程序的图形界面的图形绘制功能。
	{
		g.clearRect(0,0,getWidth(),getHeight());
		//Graphics类的成员方法cleanRect清屏
		g.drawString("小应用程序，您好!",10,20);
	} // 方法 paint 结束
} //类 J_HelloApplet 结束