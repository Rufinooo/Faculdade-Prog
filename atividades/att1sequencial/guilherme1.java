import java.util.*;

public class guilherme1{
    public static void main(String[] args){

        Double num1, num2, num3, soma, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = in.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = in.nextDouble();

        System.out.println("Digite o terceiro número: ");
        num3 = in.nextDouble();

        soma = num1 + num2 + num3;
        media = soma / 3;

        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Média: %.2f", media);

    }
}