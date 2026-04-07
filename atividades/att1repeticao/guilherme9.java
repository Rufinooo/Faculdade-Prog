import java.util.*;

public class guilherme9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numero, soma = 0, media;
        int N;

        System.out.println("Digite a quantidade de números: ");
        N = in.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.print("Digite o " + i + "º número: ");
            numero = in.nextDouble();
            soma += numero;
        }
        media = soma / N;
        System.out.println(soma+" "+media);
    }
}
