import java.util.*;

public class guilherme9 {
    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de A, B e C: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a == 0){
            System.out.println("Não é equação de 2° grau");

            if (b == 0){
                System.out.println("Não é equação de 1° grau");
            } else {
                x1 = -c / b;
                System.out.println(x1);
            }

        } else {
            d = Math.pow(b, 2) -4 * a * c;
            if (d < 0){
                System.out.println("Não tem raiz real");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            }
        }
        in.close();
    }
}
