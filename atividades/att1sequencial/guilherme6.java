import java.util.*;

public class guilherme6{
    public static void main(String[] args){

        double salario, vendas, comissao, benef;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: \nR$ ");
        salario = in.nextDouble();

        System.out.print("Digite o valor total de vendas do funcionário: \nR$ ");
        vendas = in.nextDouble();

        comissao = vendas * 0.04;
        benef = salario + comissao;

        System.out.printf("Benefício a receber: R$ %.2f\n", benef);

        in.close();
    }
}
