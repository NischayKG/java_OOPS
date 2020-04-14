import java.applet.*;
import java.awt.*;
public class count extends Applet implements Runnable
{
    Thread t;
    int count;
    public void init()
    {
       count=0;
       
       t=new Thread(this);
       t.start();
    }
  
  
    public void run()
    {
      while(true)
      {
          count++;
          repaint();
          try
         {
           t.sleep(100);
         }
          catch(InterruptedException e)
         {}
       }
    }
  
    public void paint(Graphics g)
    {
       g.drawString(Integer.toString(count),20,20);
       System.out.println("Count ="+count);
    }
  
     public void stop()
     { 

     }
}
  