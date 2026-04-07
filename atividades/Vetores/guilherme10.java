import java.util.*;

public class guilherme10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];
        int i, j = 0;

        for (i = 0; i < 10; i++) {
            System.out.print("v1[" + i + "]: ");
            v1[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            System.out.print("v2[" + i + "]: ");
            v2[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            v3[j] = v1[i];
            j++;
            v3[j] = v2[i];
            j++;
        }

        System.out.print("Vetor intercalado: [");
        for (i = 0; i < 20; i++) {
            System.out.print(v3[i]);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        in.close();
    }
}
