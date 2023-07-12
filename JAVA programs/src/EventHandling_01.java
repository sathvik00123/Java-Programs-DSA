import java.awt.*;
import java.awt.event.*;
public class EventHandling_01 implements KeyListener
{
Frame f;
Label l;
TextArea tf;
TextField td;
String msg="";
EventHandling_01()
{
f=new Frame();
l=new Label();
l.setBounds(20,50,100,20);
tf=new TextArea();
td=new TextField();
td.setBounds(20,500,70,30);
tf.setBounds(20,80,300,300);
tf.addKeyListener(this);
f.add(l);
f.add(tf);
f.add(td);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
public void keyPressed(KeyEvent e)
{
l.setText("keyup");
}
public void keyReleased(KeyEvent e)
{
l.setText("keydown");
}
public void keyTyped(KeyEvent e)
{
l.setText("key typed");
}
public static void main(String args[])
{
new EventHandling_01();
}
}