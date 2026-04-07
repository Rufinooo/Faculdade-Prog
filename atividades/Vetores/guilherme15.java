import java.util.*;

public class guilherme15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] contas = new int[10];
        double[] saldos = new double[10];
        int i, opcao, codigo, posicao;
        double valor;
        boolean contaEncontrada;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            contas[i] = in.nextInt();
            System.out.print("Digite o saldo da conta " + (i + 1) + ": ");
            saldos[i] = in.nextDouble();
        }

        do {
            System.out.println("\nMenu de Operações");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar saldo em conta");
            System.out.println("4. Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o código da conta para depósito: ");
                codigo = in.nextInt();
                posicao = -1;
                contaEncontrada = false;
                for (i = 0; i < 10; i++) {
                    if (contas[i] == codigo) {
                        posicao = i;
                        contaEncontrada = true;
                    }
                }
                if (contaEncontrada) {
                    System.out.print("Digite o valor a depositar: ");
                    valor = in.nextDouble();
                    saldos[posicao] += valor;
                    System.out.println("Depósito efetuado. Saldo atualizado: " + saldos[posicao]);
                } else {
                    System.out.println("Conta não encontrada!");
                }
            } else if (opcao == 2) {
                System.out.print("Digite o código da conta para saque: ");
                codigo = in.nextInt();
                posicao = -1;
                contaEncontrada = false;
                for (i = 0; i < 10; i++) {
                    if (contas[i] == codigo) {
                        posicao = i;
                        contaEncontrada = true;
                    }
                }
                if (contaEncontrada) {
                    System.out.print("Digite o valor a sacar: ");
                    valor = in.nextDouble();
                    if (saldos[posicao] >= valor) {
                        saldos[posicao] -= valor;
                        System.out.println("Saque efetuado. Saldo atualizado: " + saldos[posicao]);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                } else {
                    System.out.println("Conta não encontrada!");
                }
            } else if (opcao == 3) {
                System.out.print("Digite o código da conta para consulta: ");
                codigo = in.nextInt();
                contaEncontrada = false;
                for (i = 0; i < 10; i++) {
                    if (contas[i] == codigo) {
                        System.out.println("Saldo da conta " + codigo + ": " + saldos[i]);
                        contaEncontrada = true;
                    }
                }
                if (!contaEncontrada) {
                    System.out.println("Conta não encontrada!");
                }
            }
        } while (opcao != 4);

        in.close();
    }
}
