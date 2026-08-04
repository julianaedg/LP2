// 2-Classes - 2.2.1
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect r1, r2, r3;

    PaintFrame() {
        this.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Pintando Retangulos");
        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //posição (x, y), tamanho (w, h), cor de fundo e cor de contorno
        this.r1 = new Rect(50, 50, 120, 60, new Color(230, 143, 28), Color.RED);
        this.r2 = new Rect(180, 50, 160, 80, new Color(133, 168, 213), new Color(0, 20, 110));
        this.r3 = new Rect(80, 150, 210, 100, new Color(0, 204, 0), new Color(0, 100, 0));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    Color fundo;    
    Color contorno;

    Rect(int x, int y, int w, int h, Color fundo, Color contorno) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.fundo = fundo;
        this.contorno = contorno;
    }


    Rect(int x, int y, int w, int h) {
        this(x, y, w, h, Color.WHITE, Color.BLACK);
    }

    int area() {
        return w * h;
    }

    void drag(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.fundo);
        g2d.fillRect(this.x, this.y, this.w, this.h);

        g2d.setColor(this.contorno);
        g2d.drawRect(this.x, this.y, this.w, this.h);
    }
}
