import java.awt.*;
import java.applet.*;
/*<applet code="applet4" width=900 height=800>
</applet>*/
public class applet4 extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
	}
	
	public void paint(Graphics g)
	{
		Color c1=new Color(157,133,208);
		g.setColor(c1);
		g.drawString("Hello",20,90);
		Font f=new Font("Jokerman",Font.ITALIC,90);
		g.setFont(f);
		g.drawString("This is my inovation",50,90);
	}
}