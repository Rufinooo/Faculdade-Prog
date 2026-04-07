import java.util.*;

public class guilherme12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] A = new int[3][4];
        System.out.println("Digite os valores da matriz A 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = in.nextInt();
            }
        }

        System.out.print("Digite linhas e colunas da matriz B: ");
        int linB = in.nextInt();
        int colB = in.nextInt();
        int[][] B = new int[linB][colB];

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linB; i++) {
            for (int j = 0; j < colB; j++) {
                B[i][j] = in.nextInt();
            }
        }

        if (4 != linB) {
            System.out.println("Não é possível multiplicar A x B");
        } else {
            int[][] C = new int[3][colB];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < colB; j++) {
                    int soma = 0;
                    for (int k = 0; k < 4; k++) {
                        soma += A[i][k] * B[k][j];
                    }
                    C[i][j] = soma;
                }
            }

            System.out.println("Matriz resultante:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < colB; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
