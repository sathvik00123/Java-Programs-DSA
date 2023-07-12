import java.applet.*;
import java.awt.*;
/*<applet code = "AppletHTML" width 400 height 400>
</applet>*/

public class AppletHTML extends Applet {
    
    public void init(){
        setBackground(Color.black);
        setForeground(Color.red);
    }
    public void paint(Graphics g){
        g.drawString("Welcome",200,200);
    }

}
