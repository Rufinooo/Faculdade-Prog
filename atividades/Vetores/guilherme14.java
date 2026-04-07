import java.util.*;

public class guilherme14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] amostras = new double[20];
        int i;
        double soma = 0, media, somaDesvio = 0, desvioPadrao;

        for (i = 0; i < 20; i++) {
            System.out.print("Digite o valor da amostra " + (i + 1) + ": ");
            amostras[i] = in.nextDouble();
            soma += amostras[i];
        }

        media = soma / 20;

        for (i = 0; i < 20; i++) {
            somaDesvio += Math.pow(amostras[i] - media, 2);
        }

        desvioPadrao = Math.sqrt(somaDesvio / (20 - 1));

        System.out.println("Média das amostras: " + media);
        System.out.println("Desvio padrão das amostras: " + desvioPadrao);

        in.close();
    }
}
