import java.util.*;

public class aulaRepeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        double media, nota, soma = 0;

        System.out.println("Digite quantas pessoas fizeram a prova: ");
        n = in.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("\nDigite a nota do dicente "+ i +": ");
            nota = in.nextDouble();
            soma = soma + nota;
            System.out.printf("A soma atual é igual a: %.2f", soma);
        }
        media = (double) (soma) / n;
        System.out.printf("A soma das %d notas é igual a %.2f", n, soma);
        System.out.printf("\nA média das %d notas é igual a: %.2f", n, media);
    }
}
