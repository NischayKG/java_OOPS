import java.awt.*;
import java.applet.*;

/* <applet code="applet1" width=300 height=400>
</applet>*/

public class applet1 extends Applet
{
	String msg;
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.black);
		msg="Naccho B.C";
	}
		
	public void start()
	{
		System.out.println("Starting of applet");
	}
	

	public void stop()
	{
		System.out.println("Stoping of applet");
	}
	public void destroy()
	{
		System.out.println("destroying of applet");
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}
