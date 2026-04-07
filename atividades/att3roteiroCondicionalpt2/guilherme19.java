import java.util.*;

public class guilherme19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario_base, tempo_servico;
        double imposto, gratificacao, salario_liquido;
        String classificacao;

        System.out.print("Digite o salário base: ");
        salario_base = in.nextDouble();

        System.out.print("Digite o tempo de serviço (em anos): ");
        tempo_servico = in.nextDouble();

        if (salario_base < 200) {
            imposto = 0;
        } else if (salario_base <= 450) {
            imposto = salario_base * 0.03;
        } else if (salario_base <= 700) {
            imposto = salario_base * 0.08;
        } else {
            imposto = salario_base * 0.12;
        }

        if (salario_base > 500) {
            if (tempo_servico <= 3) {
                gratificacao = salario_base * 0.20;
            } else {
                gratificacao = salario_base * 0.30;
            }
        } else {
            if (tempo_servico <= 3) {
                gratificacao = salario_base * 0.23;
            } else if (tempo_servico <= 6) {
                gratificacao = salario_base * 0.35;
            } else {
                gratificacao = salario_base * 0.33;
            }
        }

        salario_liquido = salario_base - imposto + gratificacao;

        if (salario_liquido <= 350) {
            classificacao = "A";
        } else if (salario_liquido <= 600) {
            classificacao = "B";
        } else {
            classificacao = "C";
        }

        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Gratificação: R$ " + gratificacao);
        System.out.println("Salário Líquido: R$ " + salario_liquido);
        System.out.println("Classificação: " + classificacao);
    }
}
