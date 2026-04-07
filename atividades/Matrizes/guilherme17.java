import java.util.*;

public class guilherme17 {
    static int L, C;
    static char[][] mapa;
    static int fimX, fimY;

    public static void dfs(int x, int y) {
        mapa[x][y] = '.';
        fimX = x;
        fimY = y;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < L && ny >= 0 && ny < C && (mapa[nx][ny] == 'H')) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        L = in.nextInt();
        C = in.nextInt();
        mapa = new char[L][C];
        int startX = 0, startY = 0;

        for (int i = 0; i < L; i++) {
            String linha = in.next();
            for (int j = 0; j < C; j++) {
                mapa[i][j] = linha.charAt(j);
                if (mapa[i][j] == 'o') {
                    startX = i;
                    startY = j;
                }
            }
        }

        dfs(startX, startY);
        System.out.println((fimX+1) + " " + (fimY+1));
    }
}
