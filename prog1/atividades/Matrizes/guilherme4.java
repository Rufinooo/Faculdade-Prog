import java.util.*;

public class guilherme4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomes = new String[10];
        double[][] notas = new double[10][5];
        double soma, media;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            nomes[i] = in.next();
            soma = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Nota " + (j+1) + ": ");
                notas[i][j] = in.nextDouble();
                soma += notas[i][j];
            }
        }

        System.out.println("\nRESULTADO FINAL");
        System.out.println("------------------------------------");
        for (int i = 0; i < 10; i++) {
            soma = 0;
            for (int j = 0; j < 5; j++) {
                soma += notas[i][j];
            }
            media = soma / 5;

            System.out.print(nomes[i] + " - Média: " + String.format("%.2f", media) + " - ");
            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media >= 4) {
                System.out.println("Exame Especial");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
