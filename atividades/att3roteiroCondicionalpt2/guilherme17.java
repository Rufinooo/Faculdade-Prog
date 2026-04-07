import java.util.*;

public class guilherme17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, menor, meio, maior;

        System.out.print("Digite o primeiro número: ");
        a = in.nextInt();
        System.out.print("Digite o segundo número: ");
        b = in.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = in.nextInt();

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);
        System.out.println("Ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}
