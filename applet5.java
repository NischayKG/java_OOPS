import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="applet5" width=200 height=500>
</applet>*/
public class applet5 extends Applet implements KeyListener
{
	public void init()
	{
		addKeyListener(this);
	}
	
	public void keyReleased(KeyEvent e)
	{
		showStatus("Key is released");
	}
	
	public void keyTyped(KeyEvent e)
	{
		showStatus("Key is Typed");
	}

	public void keyPressed(KeyEvent e)
	{
		showStatus("Key is Pressed");
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("Key Event",50,50);
	}
}
	