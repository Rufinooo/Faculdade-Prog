import java.util.*;

public class guilherme14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, centena, dezena, unidade;

        System.out.print("Digite um número inteiro de 3 dígitos: ");
        numero = in.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("Número inválido. Deve ter 3 dígitos.");
        } else {
            centena = numero / 100;
            dezena = (numero / 10) % 10;
            unidade = numero % 10;

            if (centena == unidade) {
                System.out.println("É um número palíndromo");
            } else {
                System.out.println("Não é um número palíndromo");
            }
        }
    }
}
