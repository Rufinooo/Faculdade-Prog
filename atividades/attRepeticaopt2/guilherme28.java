import java.util.*;

public class guilherme28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voto, candidato1, candidato2, candidato3, candidato4, branco, nulo;

        candidato1 = 0;
        candidato2 = 0;
        candidato3 = 0;
        candidato4 = 0;
        branco = 0;
        nulo = 0;

        voto = -1;
        while (voto != 0) {
            System.out.print("Digite o código do voto (0 para encerrar): ");
            voto = in.nextInt();

            if (voto == 1) {
                candidato1 = candidato1 + 1;
            } else if (voto == 2) {
                candidato2 = candidato2 + 1;
            } else if (voto == 3) {
                candidato3 = candidato3 + 1;
            } else if (voto == 4) {
                candidato4 = candidato4 + 1;
            } else if (voto == 5) {
                branco = branco + 1;
            } else if (voto != 0) {
                nulo = nulo + 1;
            }
        }

        System.out.println("Total de votos candidato 1: " + candidato1);
        System.out.println("Total de votos candidato 2: " + candidato2);
        System.out.println("Total de votos candidato 3: " + candidato3);
        System.out.println("Total de votos candidato 4: " + candidato4);
        System.out.println("Total de votos em branco: " + branco);
        System.out.println("Total de votos nulos: " + nulo);
    }
}
