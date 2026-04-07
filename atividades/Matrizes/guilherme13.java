import java.util.*;

public class guilherme13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] onibus = new int[2][24];
        int opcao;

        do {
            System.out.println("========================================");
            System.out.println("               MARIAS UNIDAS");
            System.out.println("========================================");
            System.out.println("a. Vender passagem");
            System.out.println("b. Mostrar mapa de ocupação do ônibus");
            System.out.println("c. Encerrar");
            System.out.println("========================================");
            opcao = in.next().charAt(0);

            if (opcao == 'a') {
                System.out.print("Digite 0 para janela ou 1 para corredor: ");
                int tipo = in.nextInt();
                System.out.print("Digite o número da poltrona (0 a 23): ");
                int poltrona = in.nextInt();

                if (onibus[tipo][poltrona] == 0) {
                    onibus[tipo][poltrona] = 1;
                    System.out.println("Venda efetivada.");
                } else {
                    System.out.println("Poltrona ocupada.");
                }

            } else if (opcao == 'b') {
                System.out.println("Mapa de ocupação - Janela:");
                for (int i = 0; i < 24; i++) {
                    System.out.println("Poltrona " + i + ": " + (onibus[0][i] == 0 ? "Livre" : "Ocupada"));
                }
                System.out.println("Mapa de ocupação - Corredor:");
                for (int i = 0; i < 24; i++) {
                    System.out.println("Poltrona " + i + ": " + (onibus[1][i] == 0 ? "Livre" : "Ocupada"));
                }
            }

        } while (opcao != 'c');
    }
}
