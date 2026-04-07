import java.util.*;

public class guilherme2{
    public static void main(String[] args){

        int numero, ante, suce;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = in.nextInt();

        ante = numero - 1;
        suce = numero + 1;

        System.out.println("Antecessor: "+ ante);
        System.out.println("Sucessor: "+ suce);

    }
}