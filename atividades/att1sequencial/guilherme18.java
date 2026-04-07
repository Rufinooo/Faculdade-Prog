import java.util.*;

public class guilherme18{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double salMin, qtdeKw, vKw, vTotal, vDesc;

        System.out.println("Escreve o valor do salário mínimo: ");
        salMin = in.nextDouble();

        System.out.println("Escreve a quantidade de quilowatt consumida da sua residência: ");
        qtdeKw = in.nextDouble();

        vKw = salMin / 5;
        vTotal = vKw * qtdeKw;
        vDesc = vTotal - (vTotal * 0.15);

        System.out.println("Valor pago por quilowatt: R$ " + vKw);
        System.out.println("Valor a ser pago pelo consumo: R$ " + vTotal);
        System.out.println("Valor a ser pago com 15% de desconto: R$ " + vDesc);

    }
}
