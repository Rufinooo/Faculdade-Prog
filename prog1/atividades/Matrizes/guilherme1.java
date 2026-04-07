import java.util.*;

public class guilherme1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mat[][] = new int[2][2];
        int maior[] = new int[2], mai = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Digite a linha " + (i + 1) + " da coluna " + (j + 1) + " : ");
                mat[i][j] = in.nextInt();
            }
        }
        in.close();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > maior[i]) {
                    maior[i] = mat[i][j];
                }
                if (maior[i] > mai){
                    mai = maior[i];
                }
            }
        }

        System.out.println("Matriz Original");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("|" + mat[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("=========================");

        System.out.println("Matriz Multiplicada");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("|" + mat[i][j] * mai);
            }
            System.out.println("|");
        }
    }
}