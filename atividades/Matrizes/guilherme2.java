import java.util.*;

public class guilherme2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        float mat[][] = new float[3][5], soma = 0;
        float somas[] = new float[3];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                soma += mat[i][j];
            }
            somas[i] = soma;
        }
        System.out.print("[");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(somas[i] + ", ");
        }
        System.out.println("]");

    }
}
