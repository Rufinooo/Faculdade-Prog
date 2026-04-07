import java.util.*;

public class guilherme10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, numero, maior, menor;

        System.out.println("Digite a quantidade de números: ");
        N = in.nextInt();
        System.out.print("Digite o 1º número: ");
        numero = in.nextInt();

        maior = numero;
        menor = numero;

        for (int i = 2; i <= N; i++){
            System.out.println("Digite o "+ i +"º número: ");
            numero = in.nextInt();

            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }
        System.out.println("Maior número "+ maior);
        System.out.println("Menor número "+ menor);
    }
}
