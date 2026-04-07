import java.util.*;

public class guilherme3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v1[] = new int[10];
        int v2[] = new int[10];
        int v3[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a " + (i + 1) + "ª posição do vetor 1 : ");
            v1[i] = in.nextInt();
            System.out.print("Digite a " + (i + 1) + "ª posição do vetor 2 : ");
            v2[i] = in.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            if (v1[i] == v2[i]) {
                v3[i] = 1;
            } else {
                v3[i] = 0;
            }
            System.out.print(v3[i]+ ",");
        }
        System.out.print("]");
    }
}
