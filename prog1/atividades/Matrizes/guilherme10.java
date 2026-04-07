import java.util.*;

public class guilherme10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Digite o número de cidades: ");
        n = in.nextInt();

        int[][] L = new int[n][n];

        System.out.println("Digite a matriz de ligações:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                L[i][j] = in.nextInt();
            }
        }

        System.out.print("Digite a cidade k para análise: ");
        int k = in.nextInt();

        int saidas = 0, entradas = 0;
        for (int j = 0; j < n; j++) {
            if (L[k][j] == 1) saidas++;
            if (L[j][k] == 1) entradas++;
        }
        System.out.println("Saídas de " + k + ": " + saidas);
        System.out.println("Entradas em " + k + ": " + entradas);

        int maxEntradas = 0, cidadeMax = -1;
        for (int j = 0; j < n; j++) {
            int cont = 0;
            for (int i = 0; i < n; i++) {
                if (L[i][j] == 1) cont++;
            }
            if (cont > maxEntradas) {
                maxEntradas = cont;
                cidadeMax = j;
            }
        }
        System.out.println("Cidade com mais entradas: " + cidadeMax);

        System.out.println("Cidades isoladas:");
        for (int i = 0; i < n; i++) {
            int somaLinha = 0, somaCol = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += L[i][j];
                somaCol += L[j][i];
            }
            if (somaLinha == 0 && somaCol == 0) {
                System.out.println(i);
            }
        }

        System.out.print("Digite o tamanho da rota m: ");
        int m = in.nextInt();
        int[] rota = new int[m];
        System.out.println("Digite a rota:");
        for (int i = 0; i < m; i++) rota[i] = in.nextInt();

        boolean possivel = true;
        for (int i = 0; i < m-1; i++) {
            if (L[rota[i]][rota[i+1]] == 0) {
                possivel = false;
                break;
            }
        }
        if (possivel) System.out.println("Rota possível.");
        else System.out.println("Rota impossível.");
    }
}
