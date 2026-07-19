public class PoligonoApp {
    public static void main(String[] args) {
        int[] x = {0, 4, 6, 3, 0};
        int[] y = {0, 0, 3, 6, 4};

        Poligono p1 = new Poligono(5, x, y);
        p1.print();
    }
}

class Poligono {
    int lados;
    int[] x, y;

    Poligono(int lados, int[] x, int[] y) {
        this.lados = lados;
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.printf("Polígono de %d lados com vértices: ", lados);

        for (int i = 0; i < lados; i++) {
            System.out.printf("(%d,%d) ", x[i], y[i]);
        }

        System.out.println();
    }
}