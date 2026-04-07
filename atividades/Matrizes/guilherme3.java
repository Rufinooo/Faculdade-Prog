import java.util.*;

public class guilherme3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int semanas, acimaMedia, menorDia;
        double soma, media, menorProd;

        System.out.print("Digite o número de semanas: ");
        semanas = in.nextInt();

        double[][] producao = new double[semanas][7];

        soma = 0;
        for (int i = 0; i < semanas; i++) {
            System.out.println("Semana " + (i+1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Dia " + (j+1) + ": ");
                producao[i][j] = in.nextDouble();
                soma += producao[i][j];
            }
        }

        media = soma / (semanas*7);

        acimaMedia = 0;
        for (int i = 0; i < semanas; i++) {
            for (int j = 0; j < 7; j++) {
                if (producao[i][j] > media) {
                    acimaMedia++;
                }
            }
        }

        System.out.println("\nRELATÓRIO DE PRODUÇÃO RELATIVO À " + semanas + " SEMANAS");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Produção média = %.2f\n", media);
        System.out.println("Número de dias com produção acima da média = " + acimaMedia);

        System.out.println("\nINDICAÇÃO DOS DIAS DE MÍNIMA PRODUÇÃO:");
        for (int i = 0; i < semanas; i++) {
            menorProd = producao[i][0];
            menorDia = 1;
            for (int j = 1; j < 7; j++) {
                if (producao[i][j] < menorProd) {
                    menorProd = producao[i][j];
                    menorDia = j+1;
                }
            }
            System.out.println("Semana " + (i+1) + " ..................... DIA " + menorDia);
        }
    }
}
