import java.util.*;

public class guilherme19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, reverso, aux, resto;

        System.out.print("Digite um número: ");
        numero = in.nextInt();

        aux = numero;
        reverso = 0;
        while (aux > 0) {
            resto = aux % 10;
            reverso = reverso * 10 + resto;
            aux = aux / 10;
        }

        if (numero == reverso) {
            System.out.println("O número é um palíndromo.");
        } else {
            System.out.println("O número não é um palíndromo.");
        }
    }
}
