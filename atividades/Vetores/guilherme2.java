import java.util.*;

public class guilherme2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1[] = new int[10];
        int v2[] = new int[10];
        int v3[] = new int[10];

        for (int i = 0; i < 10 ; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            v1[i] = in.nextInt();
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            v2[i] = in.nextInt();
            v3[i] = v1[i] + v2[i];
        }
        System.out.print("Vetor 1 = [");
        for (int i = 0; i < 10; i++){
            System.out.print(v1[i] + ", ");
        }System.out.println("]");
        System.out.print("Vetor 2 = [");
        for (int i = 0; i < 10; i++) {
            System.out.print(v2[i]+ ", ");
        }System.out.println("]");
        System.out.print("Vetor 3 = [");
        for (int i = 0; i < 10; i++) {
            System.out.print(v3[i]+ ", ");
        }
        System.out.println("]");
    }
}