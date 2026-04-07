import java.util.*;

public class guilherme20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double hrTrab, salMin, hrEx, vHr, vHrEx, salBr, vEx, salReceber;

        System.out.println("Digite o número de horas trabalhadas: ");
        hrTrab = in.nextDouble();

        System.out.println("Digite o valor do salário mínimo: ");
        salMin = in.nextDouble();

        System.out.println("Digite o número de horas extras trabalhadas: ");
        hrEx = in.nextDouble();

        vHr = salMin * 0.125;
        vHrEx = salMin * 0.25;
        salBr = hrTrab * vHr;
        vEx = hrEx * vHrEx;
        salReceber = salBr + vEx;

        System.out.println("Salário bruto: R$ " + salBr);
        System.out.println("Valor das horas extras: R$ " + vEx);
        System.out.println("Salário a receber: R$ " + salReceber);

    }
}
