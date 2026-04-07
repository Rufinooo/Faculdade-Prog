import java.util.*;

public class aula7{
    public static void main(String[] args) {

        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        if(in.hasNextInt()) {
            num = in.nextInt();

            if ((num % 2) == 0) {
                System.out.println("Numero par.");
            } else if ((num % 2) != 0) {
                System.out.println("Número ímpar");
            }
        }
        else{
            System.out.println("Entrada inválida. (Digite somente números)");
        }

    }
}