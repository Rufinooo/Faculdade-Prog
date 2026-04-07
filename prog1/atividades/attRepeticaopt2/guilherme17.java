import java.util.*;

public class guilherme17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao, a, b, resultado;
        boolean continuar;

        continuar = true;
        while (continuar) {
            System.out.println("====================");
            System.out.println("Calculadora de Fulano");
            System.out.println("====================");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("====================");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                a = in.nextInt();
                System.out.print("Digite o segundo número: ");
                b = in.nextInt();

                if (opcao == 1) {
                    resultado = a + b;
                    System.out.println("Resultado: " + resultado);
                } else if (opcao == 2) {
                    resultado = a - b;
                    System.out.println("Resultado: " + resultado);
                } else if (opcao == 3) {
                    resultado = a * b;
                    System.out.println("Resultado: " + resultado);
                } else if (opcao == 4) {
                    if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("Divisão por zero não permitida.");
                    }
                }
            } else if (opcao == 5) {
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
