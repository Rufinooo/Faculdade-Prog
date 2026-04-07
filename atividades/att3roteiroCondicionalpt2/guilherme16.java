import java.util.*;

public class guilherme16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;

        System.out.print("Digite um ano inteiro positivo: ");
        ano = in.nextInt();

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}
