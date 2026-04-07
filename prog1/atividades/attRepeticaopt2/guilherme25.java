import java.util.*;

public class guilherme25 {
    public static void main(String[] args) {
        int numero, soma, divisor, quantidade;

        numero = 2;
        quantidade = 0;

        while (quantidade < 5) {
            soma = 0;
            divisor = 1;
            while (divisor < numero) {
                if (numero % divisor == 0) {
                    soma = soma + divisor;
                }
                divisor = divisor + 1;
            }
            if (soma == numero) {
                System.out.println("Número perfeito: " + numero);
                quantidade = quantidade + 1;
            }
            numero = numero + 1;
        }
    }
}
