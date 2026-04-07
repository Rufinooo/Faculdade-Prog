import java.util.Scanner;

public class guilherme17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, penalidade, count, i, j;
        double[] dist;

        n = in.nextInt();
        dist = new double[n];
        for (i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            dist[i] = Math.sqrt(x * x + y * y);
        }

        penalidade = 0;
        for (i = 0; i < n; i++) {
            count = 0;
            for (j = i + 1; j < n; j++) {
                if (dist[j] <= dist[i]) {
                    count++;
                }
            }
            penalidade += count;
        }

        System.out.println(penalidade);
        in.close();
    }
}
