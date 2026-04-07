import java.util.*;

public class guilherme18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, somaPar, somaImpar, qtdPar, qtdImpar, maiorPar, menorImpar;
        double mediaPar, mediaImpar;

        numero = 0;
        somaPar = 0;
        somaImpar = 0;
        qtdPar = 0;
        qtdImpar = 0;
        maiorPar = 0;
        menorImpar = 0;

        while (numero >= 0) {
            System.out.print("Digite um número (negativo para sair): ");
            numero = in.nextInt();

            if (numero >= 0) {
                if (numero % 2 == 0) {
                    somaPar = somaPar + numero;
                    qtdPar = qtdPar + 1;
                    if (qtdPar == 1 || numero > maiorPar) {
                        maiorPar = numero;
                    }
                } else {
                    somaImpar = somaImpar + numero;
                    qtdImpar = qtdImpar + 1;
                    if (qtdImpar == 1 || numero < menorImpar) {
                        menorImpar = numero;
                    }
                }
            }
        }

        if (qtdPar > 0) {
            mediaPar = (double) somaPar / qtdPar;
            System.out.println("Média dos números pares: " + mediaPar);
            System.out.println("Maior número par: " + maiorPar);
        } else {
            System.out.println("Nenhum número par digitado.");
        }

        if (qtdImpar > 0) {
            mediaImpar = (double) somaImpar / qtdImpar;
            System.out.println("Média dos números ímpares: " + mediaImpar);
            System.out.println("Menor número ímpar: " + menorImpar);
        } else {
            System.out.println("Nenhum número ímpar digitado.");
        }
    }
}
