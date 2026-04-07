import java.util.Scanner;

public class guilherme8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, fx;

        System.out.print("Digite o valor de x: ");
        x = in.nextDouble();

        if (x <= 1) {
            fx = 1;
        } else if (x <= 2) {
            fx = 2;
        } else if (x <= 3) {
            fx = Math.pow(x, 2);
        } else {
            fx = Math.pow(x, 3);
        }

        System.out.printf("f(x) = %.2f", fx);

        in.close();
    }
}
