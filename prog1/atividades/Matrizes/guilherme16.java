import java.util.*;

public class guilherme16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int pontosDario = 0, pontosXerxes = 0;

        for (int i = 0; i < N; i++) {
            int d = in.nextInt();
            int x = in.nextInt();
            if ((d + 1) % 5 == x || (d + 2) % 5 == x) {
                pontosXerxes++;
            } else {
                pontosDario++;
            }
        }

        if (pontosDario > pontosXerxes) {
            System.out.println("dario");
        } else {
            System.out.println("xerxes");
        }
    }
}
