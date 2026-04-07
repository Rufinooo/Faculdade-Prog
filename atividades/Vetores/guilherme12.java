import java.util.Scanner;

public class guilherme12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];
        int i;
        boolean crescente = true;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }

        for (i = 0; i < 9; i++) {
            if (vetor[i] > vetor[i + 1]) {
                crescente = false;
                break;
            }
        }

        if (crescente) {
            System.out.println("O vetor está ordenado em ordem crescente.");
        } else {
            System.out.println("O vetor NÃO está ordenado em ordem crescente.");
        }

        in.close();
    }
}
