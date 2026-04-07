import java.util.*;

public class guilherme6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Digite a quantidade de séries Fibonacci: ");
        n = in.nextInt();
        int v1[] = new int[n];

        for (int i = 0; i < n && i < 2; i++){
            v1[i] = 1;
        }
        for (int i = 2; i < n; i++){
            v1[i] = v1[i - 1] + v1[i - 2];
        }
        System.out.print("[");
        for (int i = 0; i < v1.length; i++){
            System.out.print(v1[i]);
            if (i < v1.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        in.close();
    }
}
