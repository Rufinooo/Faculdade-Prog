import java.util.*;

public class guilherme13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite o valor do lado a: ");
        a = in.nextDouble();
        System.out.print("Digite o valor do lado b: ");
        b = in.nextDouble();
        System.out.print("Digite o valor do lado c: ");
        c = in.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não forma triângulo");
        }
    }
}
