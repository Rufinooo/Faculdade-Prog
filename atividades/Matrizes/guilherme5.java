import java.util.*;

public class guilherme5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int linhas = 6, colunas = 20;
        double[][] dados = new double[linhas][colunas];
        double soma, media, desvio, somaQuadrados;
        boolean precisaRevisar = false;

        for (int i = 0; i < linhas; i++) {
            System.out.println("Digite os 20 valores da linha " + (i+1) + ":");
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < linhas; i++) {
            soma = 0;
            for (int j = 0; j < colunas; j++) {
                soma += dados[i][j];
            }
            media = soma / colunas;

            somaQuadrados = 0;
            for (int j = 0; j < colunas; j++) {
                somaQuadrados += Math.pow(dados[i][j] - media, 2);
            }
            desvio = Math.sqrt(somaQuadrados / colunas);

            System.out.printf("Linha %d -> Média = %.2f | Desvio padrão = %.2f\n", (i+1), media, desvio);

            if (desvio > 5) {
                System.out.println(">> Linha " + (i+1) + " precisa ser revisada!");
                precisaRevisar = true;
            }
        }

        if (!precisaRevisar) {
            System.out.println("Nenhuma linha precisa ser revisada.");
        }
    }
}
