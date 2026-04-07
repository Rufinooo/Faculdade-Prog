import java.util.*;

public class guilherme11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double D, Q, S, n;

        System.out.print("Digite o valor do diâmetro D: ");
        D = in.nextDouble();

        System.out.print("Digite o valor da carga Q: ");
        Q = in.nextDouble();

        if (D > 100) {
            n = 2;
        } else if (D < 50) {
            n = 6;
        } else {
            n = 4;
        }

        S = (4 * Q) / (Math.PI * D * D * n);

        System.out.printf("A tensão S é: %.2f", S);
    }
}
