import java.awt.*;
import java.applet.*;
/*<applet code= "Applet_01" width=400 height=400>
</applet>*/
public class Applet_01 extends Applet      // applet is not supporting.
{

    @Override
public void paint(Graphics g)
{
int a=10,b=20,c;
String s="";
c=a+b;

s="sum"+String.valueOf(c);
g.drawString(s,100,100);
}
}

