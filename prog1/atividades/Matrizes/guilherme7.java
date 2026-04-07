import java.util.*;

public class guilherme7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        boolean ehPermutacao = true;

        System.out.print("Digite a dimensão da matriz quadrada: ");
        n = in.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int contLinha = 0, contColuna = 0;
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == 1) contLinha++;
                if (matriz[j][i] == 1) contColuna++;
            }
            if (contLinha != 1 || contColuna != 1) {
                ehPermutacao = false;
                break;
            }
        }

        if (ehPermutacao) {
            System.out.println("É uma matriz permutação.");
        } else {
            System.out.println("Não é uma matriz permutação.");
        }
    }
}
