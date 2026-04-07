import java.util.*;

public class guilherme18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int[][] mat = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        boolean escada = true;
        int lastPivot = -1;

        for (int i = 0; i < N; i++) {
            int pivot = -1;
            for (int j = 0; j < M; j++) {
                if (mat[i][j] != 0) {
                    pivot = j;
                    break;
                }
            }

            if (pivot == -1) {
                for (int k = i+1; k < N; k++) {
                    for (int j = 0; j < M; j++) {
                        if (mat[k][j] != 0) escada = false;
                    }
                }
                break;
            } else {
                if (pivot <= lastPivot) escada = false;
                for (int k = i+1; k < N; k++) {
                    for (int j = 0; j <= pivot; j++) {
                        if (mat[k][j] != 0) escada = false;
                    }
                }
                lastPivot = pivot;
            }
        }

        System.out.println(escada ? "S" : "N");
    }
}
