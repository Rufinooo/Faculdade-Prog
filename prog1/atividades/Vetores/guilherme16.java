import java.util.Scanner;

public class guilherme16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, i, picos = 0;
        int[] alturas;

        N = in.nextInt();
        alturas = new int[N];
        for (i = 0; i < N; i++) {
            alturas[i] = in.nextInt();
        }

        for (i = 1; i < N - 1; i++) {
            if (alturas[i] > alturas[i - 1] && alturas[i] > alturas[i + 1]) {
                picos++;
                if (picos > 1) {
                    System.out.println("S");
                    in.close();
                    return;
                }
            }
        }

        System.out.println(picos == 1 ? 1 : 0);
        in.close();
    }
}
