import java.util.*;

public class guilherme19{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double num, quad, cubo, raizQ, raizC;

        System.out.println("Escreve um número positivo: ");
        num = in.nextDouble();

        quad = Math.pow(num, 2);
        cubo = Math.pow(num, 3);
        raizQ = Math.sqrt(num);
        raizC = Math.cbrt(num);

        System.out.printf("Elevado ao quadrado: %.2f\n", quad);
        System.out.printf("Elevado ao cubo: %.2f\n", cubo);
        System.out.printf("Raiz quadrada: %.2f\n", raizQ);
        System.out.printf("Raiz cúbica: %.2f\n", raizC);

    }
}
