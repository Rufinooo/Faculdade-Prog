import java.util.*;

public class guilherme7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, num, cont1 = 0, cont2 = 0;

        System.out.print("Digite a quantidade de numeros até 100: ");
        n = in.nextInt();

        int[] v1 = new int[100];
        int[] v2 = new int[100];

        for (i = 0; i < n; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            num = in.nextInt();

            if (num > 0 && num % 2 == 0) {
                v1[cont1] = num;
                cont1++;
            } else {
                v2[cont2] = num;
                cont2++;
            }
        }

        System.out.print("Vetor 1: [");
        for (i = 0; i < cont1; i++) {
            System.out.print(v1[i]);
            if (i < cont1 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Vetor 2 : [");
        for (i = 0; i < cont2; i++) {
            System.out.print(v2[i]);
            if (i < cont2 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        in.close();
    }
}
