import java.util.*;

public class guilherme3{
    public static void main(String[] args){

        double num1, num2, num3, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num1 = in.nextDouble();

        System.out.println("Digite outro numero: ");
        num2 = in.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        num3 = in.nextDouble();

        result = (num1 * num2) /num3;

        System.out.printf("O resultado é: %.2f", result);

    }
}