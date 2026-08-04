import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

class ElipsePaintApp {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.exibir();
    }
}

class PaintFrame {
    JFrame frame;
    Ellipse e1, e2, e3;

    PaintFrame() {
        this.frame = new JFrame("Pintando Elipses");
        this.frame.setSize(600, 500);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //posição, tamanho (x, y, w, h), cor de fundo e cor de contorno
        this.e1 = new Ellipse(320, 180, 140, 70, new Color(230, 143, 28), new Color(139, 0, 139));
        this.e2 = new Ellipse(50, 280, 100, 100, new Color(133, 168, 213), new Color(0, 20, 110));
        this.e3 = new Ellipse(200, 300, 220, 90, new Color(0, 250, 0), new Color(0, 100, 0));

        JPanel painel = new JPanel() {
            public void paint(Graphics g) {
                super.paint(g); 
                e1.paint(g);
                e2.paint(g);
                e3.paint(g);
            }
        };
    
        this.frame.add(painel);
    }

    public void exibir() {
        this.frame.setVisible(true);
    }
}

class Ellipse {
    int x, y;
    int w, h;
    Color fundo;
    Color contorno;

    Ellipse(int x, int y, int w, int h, Color fundo, Color contorno) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.fundo = fundo;
        this.contorno = contorno;
    }

    void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Ellipse2D.Double elipse = new Ellipse2D.Double(this.x, this.y, this.w, this.h);

        g2d.setColor(this.fundo);
        g2d.fill(elipse);

        g2d.setColor(this.contorno);
        g2d.draw(elipse);
    }
}
