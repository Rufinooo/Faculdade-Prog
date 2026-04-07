import java.util.*;

public class guilherme9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Digite o número de cidades: ");
        n = in.nextInt();

        int[][] custo = new int[n][n];
        int[] rota = new int[n];
        int total = 0;

        System.out.println("Digite a matriz de custo:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                custo[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite a rota (sequência de " + n + " cidades):");
        for (int i = 0; i < n; i++) {
            rota[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            total += custo[rota[i]][rota[i+1]];
        }

        System.out.println("Custo total da rota = " + total);
    }
}
