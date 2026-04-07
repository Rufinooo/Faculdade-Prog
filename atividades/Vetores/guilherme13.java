import java.util.Scanner;

public class guilherme13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];
        int i, j, temp;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }

        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 10; j++) {
                if (vetor[i] > vetor[j]) {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        System.out.print("Vetor ordenado: [");
        for (i = 0; i < 10; i++) {
            System.out.print(vetor[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        in.close();
    }
}
