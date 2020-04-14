import java.awt.*;
import java.applet.*;
/*<applet code="applet3" width=3000 height=900>
</applet>*/

public class applet3 extends Applet
{
	public void paint(Graphics g)
	{	
		g.setColor(Color.blue);
		g.drawLine(10,200,30,40);
		g.drawRect(30,200,30,40);
		Color c1=new Color(165,146,207);
		g.setColor(c1);
		g.fillRect(100,200,300,400);
		//g.drawRoundRect(700,200,300,400,500,600);
		//g.fillRoundRect(500,200,300,400,500,600);
		g.setColor(Color.red);
		g.fillArc(500,400,700,600,500,360);
	}
}