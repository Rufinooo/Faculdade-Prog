import java.util.*;

public class guilherme14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, fat = 1;

        System.out.println("Digite um número: ");
        N = in.nextInt();

        for (int i = 1; i <= N; i++){
            fat *= i;
        }
        System.out.println("Fatorial de "+ N +" é: "+ fat);

    }
}
