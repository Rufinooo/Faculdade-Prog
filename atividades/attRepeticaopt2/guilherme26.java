import java.util.*;

public class guilherme26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, j, resultado;

        System.out.print("Digite o valor de N: ");
        n = in.nextInt();

        i = 1;
        while (i <= n) {
            System.out.println("Tabuada do " + i + ":");
            j = 1;
            while (j <= 10) {
                resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }
    }
}
