import java.util.*;

public class guilherme23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total, a, b, c, ab, ac, bc, abc, nenhum;

        System.out.println("Digite o total de entrevistados: ");
        total = in.nextInt();

        System.out.println("Número de telespectadores que gostam da novela A: ");
        a = in.nextInt();

        System.out.println("Número de telespectadores que gostam da novela B: ");
        b = in.nextInt();

        System.out.println("Número de telespectadores que gostam da novela C: ");
        c = in.nextInt();

        System.out.println("Número de telespectadores que gostam de A e B: ");
        ab = in.nextInt();

        System.out.println("Número de telespectadores que gostam de A e C: ");
        ac = in.nextInt();

        System.out.println("Número de telespectadores que gostam de B e C: ");
        bc = in.nextInt();

        System.out.println("Número de telespectadores que gostam de A, B e C: ");
        abc = in.nextInt();

        int tGost = a + b + c - ab - ac - bc + abc;

        nenhum = total - tGost;

        System.out.println("Número de telespectadores que não gostam de nenhuma novela: " + nenhum);
    }
}
