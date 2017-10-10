import java.applet.Applet;          // getting these packages to use applets.
import java.awt.*;  
  
public class first extends Applet{    // here to use functions of applet we are inheriing the applet class.
  
public void paint(Graphics g){             // using paint function to draw all these on applet screen.
g.setColor(Color.red);      // it will set the color of figures.
g.drawString("Welcome",50, 50);  // it will draw "Welcome" on the screen.
g.drawLine(20,30,20,300);           // it will draw a line on tyhe screen.
g.drawRect(70,100,30,30);     // it wil draw a hollow rectangle.
g.fillRect(170,100,30,30);     // it will draw a rectangle filled with color.
g.drawOval(70,200,30,30);  
  
g.setColor(Color.pink);            // here we seted the color again.
g.fillOval(170,200,30,30);         //  it will draw an oval filled with pink color.
g.drawArc(90,150,30,30,30,270);    // it will draw an arc
g.fillArc(270,150,30,30,0,180);     // it will draw a filled arc.
  
}  
}  