import java.util.*;

public class guilherme8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float N, H = 0;
        int sinal = 1;

        System.out.println("Digite o valor de N: ");
        N = in.nextFloat();

        if (N > 0){
            for (float i = 1; i <= N; i++){
                H += sinal * (1 / i);
                sinal *= -1;
            }
            System.out.println(H);
        } else {
            System.out.println("Número inválido.");
        }

    }
}
