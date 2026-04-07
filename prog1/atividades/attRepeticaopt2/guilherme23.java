import java.util.*;

public class guilherme23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, radiano, seno, termo, potencia, fatorial;
        int i, j, sinal, expoente;

        System.out.print("Digite o valor de X em graus: ");
        x = in.nextDouble();

        radiano = x * 3.141592 / 180;
        seno = 0;
        sinal = 1;
        i = 1;
        while (i <= 15) {
            expoente = 2 * i - 1;
            potencia = 1;
            j = 1;
            while (j <= expoente) {
                potencia = potencia * radiano;
                j = j + 1;
            }

            fatorial = 1;
            j = 1;
            while (j <= expoente) {
                fatorial = fatorial * j;
                j = j + 1;
            }

            termo = potencia / fatorial;
            seno = seno + sinal * termo;
            sinal = sinal * -1;
            i = i + 1;
        }
        System.out.println("Seno de X: " + seno);
    }
}
