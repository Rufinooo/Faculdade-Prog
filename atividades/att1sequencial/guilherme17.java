import java.util.*;

public class guilherme17{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = in.nextDouble();

        int pInt = (int) numero;
        double pFrac = numero - pInt;

        System.out.printf("Parte inteira: %d%n", pInt);
        System.out.printf("Parte fracionária: %.4f%n", pFrac);
    }
}

