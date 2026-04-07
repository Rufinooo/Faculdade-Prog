import java.util.*;

public class guilherme15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, d1, d2, d3, d4, decimal;

        System.out.print("Digite um número inteiro de 4 dígitos: ");
        numero = in.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("Digite apenas 4 digitos");
        } else {
            d1 = numero / 1000;
            d2 = (numero / 100) % 10;
            d3 = (numero / 10) % 10;
            d4 = numero % 10;

            if ((d1 == 0 || d1 == 1) && (d2 == 0 || d2 == 1) && (d3 == 0 || d3 == 1) && (d4 == 0 || d4 == 1)) {
                decimal = d1 * 8 + d2 * 4 + d3 * 2 + d4;
                System.out.println("Número binário válido.");
                System.out.println("Equivalente decimal: " + decimal);
            } else {
                System.out.println("Número não é binário.");
            }
        }
    }
}
