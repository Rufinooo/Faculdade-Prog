import java.util.*;

public class guilherme5{
    public static void main(String[] args) {

        double salario, gratif, salarioBruto, imposto, salarionovo;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: R$ ");
        salario = in.nextDouble();

        gratif = salario * 0.10;
        salarioBruto = salario + gratif;
        imposto = salarioBruto * 0.05;
        salarionovo = salarioBruto - imposto;

        System.out.printf("Salário a receber: R$ %.2f\n", salarionovo);

        in.close();
    }
}