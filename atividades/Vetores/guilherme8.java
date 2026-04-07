import java.util.Scanner;

public class guilherme8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] notas = new int[80];
        int[] freqAbs = new int[11];
        double[] freqRel = new double[11];
        int i;

        for (i = 0; i < 80; i++) {
            System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
            notas[i] = in.nextInt();
            while (notas[i] < 0 || notas[i] > 10) {
                System.out.print("Nota inválida! Digite novamente: ");
                notas[i] = in.nextInt();
            }
            freqAbs[notas[i]]++;
        }

        for (i = 0; i <= 10; i++) {
            freqRel[i] = (double) freqAbs[i] / 80;
        }

        System.out.println("\nNota\tFreq. Absoluta\tFreq. Relativa");
        for (i = 0; i <= 10; i++) {
            System.out.printf("%2d\t%14d\t%14.2f\n", i, freqAbs[i], freqRel[i]);
        }

        in.close();
    }
}
