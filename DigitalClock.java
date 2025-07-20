import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.*;
class DigitalClock extends JFrame
{
JLabel l1,l2;
SimpleDateFormat d1,d2;
String day;
DigitalClock(String s1)
{
super(s1);
}
DigitalClock(){}
void setComponents()
{
l1=new JLabel("Time");
l2=new JLabel();
Font f1=new Font("Verdana",Font.BOLD,40);
Color c1=Color.RED;
Color c2=c1.brighter();
l1.setForeground(c2);
l1.setBackground(Color.BLACK);
l1.setOpaque(true);

l2.setFont(new Font("Verdana",Font.BOLD,40));
l2.setForeground(c2);
l2.setBackground(Color.GREEN);
l2.setOpaque(true);
l1.setFont(f1);
setLayout(null);
add(l1);
add(l2);
l1.setBounds(50,50,300,100);
l2.setBounds(50,300,300,100);
d1=new SimpleDateFormat("hh:mm:ss a");
d2=new SimpleDateFormat("dd:mm:yyyy");

String time=d1.format(Calendar.getInstance().getTime());
l1.setText(time);

String day=d2.format(Calendar.getInstance().getTime());
l2.setText(day);
setTime();
}
public void setTime()
{
String time;
while(true)
{
time=d1.format(Calendar.getInstance().getTime());
l1.setText(time);
day=d2.format(Calendar.getInstance().getTime());
l2.setText(day);

try
{
Thread.sleep(1000);
}
catch(Exception e1)
{
}

}
}
public static void main(String []args)
{
DigitalClock d1=new DigitalClock("Digital Clock");
d1.setVisible(true);
d1.setSize(200,200);
d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
d1.setComponents();

}
}