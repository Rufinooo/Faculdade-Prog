import java.util.*;

public class guilherme15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 5;
        int[][] amigos = new int[n][n];

        System.out.println("Digite a matriz de amizades 5x5:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                amigos[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int cont = 0;
            for (int j = 0; j < n; j++) {
                if (amigos[i][j] == 1) cont++;
            }
            System.out.println("Pessoa " + i + " tem " + cont + " amigos.");
        }
    }
}
