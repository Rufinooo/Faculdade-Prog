import java.util.*;

public class guilherme11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[5][3];

        System.out.println("Digite os estoques (4 armazéns x 3 produtos) e na última linha os custos:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) soma += matriz[i][j];
            System.out.println("Armazém " + (i+1) + " -> total armazenado: " + soma);
        }

        int maiorProduto2 = 0, armazemMaior = 0;
        for (int i = 0; i < 4; i++) {
            if (matriz[i][1] > maiorProduto2) {
                maiorProduto2 = matriz[i][1];
                armazemMaior = i+1;
            }
        }
        System.out.println("Armazém com maior estoque do produto 2: " + armazemMaior);

        int menorEstoque = Integer.MAX_VALUE, armazemMenor = 0;
        for (int i = 0; i < 4; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) soma += matriz[i][j];
            if (soma < menorEstoque) {
                menorEstoque = soma;
                armazemMenor = i+1;
            }
        }
        System.out.println("Armazém com menor estoque: " + armazemMenor);

        double maiorCusto = 0;
        int armazemCusto = 0;
        for (int i = 0; i < 4; i++) {
            double custo = 0;
            for (int j = 0; j < 3; j++) custo += matriz[i][j] * matriz[4][j];
            if (custo > maiorCusto) {
                maiorCusto = custo;
                armazemCusto = i+1;
            }
        }
        System.out.println("Armazém com maior custo de estocagem: " + armazemCusto);
    }
}
