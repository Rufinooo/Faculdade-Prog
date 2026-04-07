import java.util.*;

public class guilherme11{
    public static void main(String[] args){

        double salario, conta1, conta2, multa1, multa2, result, restSalario, m3;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o salario: R$ ");
        salario = in.nextDouble();

        System.out.println("Valor da primeira conta: R$ ");
        conta1 = in.nextDouble();

        System.out.println("Valor da segunda conta: R$ ");
        conta2 = in.nextDouble();

        multa1 = (conta1 * 0.02);
        multa2 = (conta2 * 0.02);
        m3 = conta1 + conta2;
        result = multa1 + multa2;
        restSalario = (salario - m3) - result;

        System.out.printf("O resto do salário é: %.2f\n", restSalario);

    }
}