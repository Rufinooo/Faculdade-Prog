import java.util.*;

public class guilherme22 {
    public static void main(String[] args) {
        double pi, termo;
        int i, sinal;

        pi = 0;
        sinal = 1;
        i = 1;
        while (i <= 51) {
            termo = 4.0 / (2 * i - 1);
            pi = pi + sinal * termo;
            sinal = sinal * -1;
            i = i + 1;
        }
        System.out.println("Valor aproximado de PI: " + pi);
    }
}
