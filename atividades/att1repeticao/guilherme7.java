import java.util.*;

public class guilherme7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float N, H = 0;

        System.out.println("Digite o valor de N: ");
        N = in.nextFloat();

        if (N > 0){
            for (float i = 1; i <= N; i++){
                H += 1 / i;
            }
            System.out.println(H);
        } else {
            System.out.println("Número inválido.");
        }

    }
}
