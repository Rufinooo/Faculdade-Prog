import java.util.*;

public class guilherme14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maxPlantas = 50;
        int[] codigos = new int[maxPlantas];
        String[] nomes = new String[maxPlantas];
        int[] estoqueIdeal = new int[maxPlantas];
        int[] estoqueAtual = new int[maxPlantas];
        int qtd = 0;
        int opcao;

        do {
            System.out.println("==========================================");
            System.out.println("        FLORICULTURA MARIASFLOR");
            System.out.println("==========================================");
            System.out.println("1. Cadastrar nova planta");
            System.out.println("2. Retirar planta");
            System.out.println("3. Inserir planta");
            System.out.println("4. Imprimir relatório");
            System.out.println("5. Sair");
            System.out.println("==========================================");
            opcao = in.nextInt();

            if (opcao == 1) {
                if (qtd < maxPlantas) {
                    System.out.print("Código: ");
                    codigos[qtd] = in.nextInt();
                    System.out.print("Nome: ");
                    nomes[qtd] = in.next();
                    System.out.print("Estoque ideal: ");
                    estoqueIdeal[qtd] = in.nextInt();
                    System.out.print("Estoque atual: ");
                    estoqueAtual[qtd] = in.nextInt();
                    qtd++;
                }

            } else if (opcao == 2) {
                System.out.print("Digite o código da planta: ");
                int codigo = in.nextInt();
                System.out.print("Quantidade a retirar: ");
                int retirar = in.nextInt();
                for (int i = 0; i < qtd; i++) {
                    if (codigos[i] == codigo) {
                        if (estoqueAtual[i] >= retirar) {
                            estoqueAtual[i] -= retirar;
                            System.out.println("Retirada realizada.");
                        } else {
                            System.out.println("Estoque insuficiente.");
                        }
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o código da planta: ");
                int codigo = in.nextInt();
                System.out.print("Quantidade a inserir: ");
                int inserir = in.nextInt();
                for (int i = 0; i < qtd; i++) {
                    if (codigos[i] == codigo) {
                        estoqueAtual[i] += inserir;
                        System.out.println("Estoque atualizado.");
                    }
                }

            } else if (opcao == 4) {
                for (int i = 0; i < qtd; i++) {
                    if (estoqueAtual[i] < estoqueIdeal[i]) {
                        System.out.println(nomes[i] + " | Atual: " + estoqueAtual[i] +
                                " | Precisa comprar: " + (estoqueIdeal[i] - estoqueAtual[i]));
                    }
                }
            }

        } while (opcao != 5);
    }
}
