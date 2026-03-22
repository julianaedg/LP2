import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Ellipse2D Shape");
        this.setSize(450, 350);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.gray);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g2d.setPaint(Color.white);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);
        
        g2d.setPaint(Color.green);
        double l = getWidth();
        double a = getHeight();
        Ellipse2D.Double elipse = new Ellipse2D.Double(50, 50, l - 100, a - 100);
        g2d.draw(elipse);

        g2d.setPaint(Color.red);
        double diametro = 100;
        double xCirculo = (l - diametro) / 2.0;
        double yCirculo = (a - diametro) / 2.0;
        Ellipse2D.Double circulo = new Ellipse2D.Double(xCirculo, yCirculo, diametro, diametro);
        g2d.draw(circulo);
    }
}