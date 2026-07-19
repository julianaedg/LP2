public class RectApp {
    public static void main(String[] args) {

        Rect r1 = new Rect(1, 1, 7, 7);

        // Testes
	System.out.println("Teste valores iniciais:");
        r1.print();
        System.out.println("Teste area calculada = " + r1.area());
        r1.drag(5, 3);
        r1.print();
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    int area() {
        return w * h;
    }

    void drag(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    void print() {
        System.out.format(
            "Retângulo de tamanho (%d,%d), na posição (%d,%d) com area %d\n",
            w, h, x, y, area()
        );
    }
}