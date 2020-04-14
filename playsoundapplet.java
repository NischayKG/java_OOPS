import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class playsoundapplet extends Applet implements ActionListener
{
   Button play, stop;
   AudioClip audioclip;
   
   public void init()
   {
	play=new Button("play in loop");
        add(play);
        play.addActionListener(this);
        stop=new Button("stop");
	add(stop);
	stop.addActionListener(this);
	audioclip=getAudioClip(getCodeBase(),"wind.wav");
   }

   public void actionPerformed(ActionEvent ae)
   {
	Button source=(Button)ae.getSource();
	if(source.getLabel()=="play in loop")
	{
	    audioclip.play();
	}
	else if(source.getLabel()=="stop")
	{
	   audioclip.stop();
	}
   }
}