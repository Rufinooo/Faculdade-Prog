import java.util.*;

public class guilherme15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, a = 1, b = 1, c;

        System.out.print("Digite o valor de N: ");
        N = in.nextInt();
        System.out.print("Fibonacci: " + a + " " + b);

        for (int i = 3; i <= N; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
