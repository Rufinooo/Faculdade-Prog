import java.util.*;

public class guilherme8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 8;
        double[][] matriz = new double[n][n];
        boolean simetrica = true;

        System.out.println("Digite os valores da matriz 8x8:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}
