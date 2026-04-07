import java.util.*;

public class guilherme24{
    public static void main(String[] args){

        double a, b, c, delta, x1, x2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente a: ");
        a = in.nextDouble();
        System.out.println("Digite o valor do coeficiente b: ");
        b = in.nextDouble();
        System.out.println("Digite o valor do coeficiente c: ");
        c = in.nextDouble();

        delta = Math.pow(b, 2) - 4 * a *c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("x1 = %.2f\nx2 = %.2f", x1, x2);

        in.close();
    }
}