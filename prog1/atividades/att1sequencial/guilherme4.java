import java.util.*;

public class guilherme4{
    public static void main(String[] args){

        double nota1, nota2, nota3, peso1, peso2, peso3, media, soma, mediapond;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();

        System.out.println("Digite o peso da primeira nota: ");
        peso1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        System.out.println("Digite o peso da segunda nota: ");
        peso2 = in.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = in.nextDouble();

        System.out.println("Digite o peso da terceira nota: ");
        peso3 = in.nextDouble();

        soma = peso1 + peso2 + peso3;

        media = (nota1 * peso1) + (nota2 * peso2) + (nota3 + peso3);

        mediapond = media / soma;

        System.out.printf("A média ponderada é: %.2f", mediapond);

    }
}
