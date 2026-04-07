import java.util.*;

public class vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota[] = new double[5];
        double soma = 0, media;

        for (int i = 0; i < nota.length; i++){
            System.out.println("Digite o valor da posição "+ (i + 1) +" do vetor:");
            nota[i] = in.nextDouble();
            soma += nota[i];
        }
        media = soma / nota.length;
        System.out.print("[");
        for (int j = 0; j < nota.length; j++){
            if (nota[j] > media){
                System.out.print(nota[j]+ " acima ");
            }
        }
        System.out.print("]");
    }
}
