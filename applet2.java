import java.awt.*;
import java.applet.*;
import java.net.*;

/* <applet code="applet2" width=300 height=400>
     <PARAM name="n1" VALUE="nischay">
       <PARAM name="s1" VALUE="150000">
</applet>*/

public class applet2 extends Applet
{
	String str;
	double sal,tax;
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.black);
		str=getParameter("n1");
		sal=Double.parseDouble(getParameter("s1"));
		cal(sal);
	}
	
	public void cal(double sa)
	{
		tax=sa/10;
	}
	
	public void paint(Graphics g)
	{
		g.drawString("welcome :"+str,50,100);
		g.drawString("Your salary is :"+sal,50,150);
		g.drawString("Tax you pay is :"+tax,50,200);
		URL url1=getCodeBase();
		URL url2=getDocumentBase();
		g.drawString("CodeBase  :"+url1.toString(),10,250);
		g.drawString("DocumentBase  :"+url2.toString(),10,300);
		
		showStatus("yahi  hai hamara status");
	}
}