#include <stdio.h>

typedef struct {
    int x, y;
    int pontas;
    int raioMaior;
    int proporcaoPontas;

} Estrela;

void printEstrela(Estrela m) {
    printf("Estrela de %d pontas na posição (%d,%d), raio maior %d e proporção de pontas %d.\n",
           m.pontas, m.x, m.y, m.raioMaior, m.proporcaoPontas);
}

int main() {
    Estrela n1 = {100, 100, 5, 75, 3};

    printEstrela(n1);

    return 0;
}