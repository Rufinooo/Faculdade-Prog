import java.util.*;

public class guilherme6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int linhas = 4, colunas = 7;
        double[][] matriz = new double[linhas][colunas];
        double menor, minmax;
        int linhaMenor = 0, posLinha = 0, posColuna = 0;

        System.out.println("Digite os valores da matriz 4x7:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = in.nextDouble();
            }
        }

        menor = matriz[0][0];
        linhaMenor = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                }
            }
        }

        minmax = matriz[linhaMenor][0];
        posLinha = linhaMenor;
        posColuna = 0;
        for (int j = 1; j < colunas; j++) {
            if (matriz[linhaMenor][j] > minmax) {
                minmax = matriz[linhaMenor][j];
                posColuna = j;
            }
        }

        System.out.println("MINMAX = " + minmax + " | Posição: (linha " + (posLinha+1) + ", coluna " + (posColuna+1) + ")");
    }
}
