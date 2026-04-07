import java.util.*;

public class guilherme7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;
        double val, tx, imp;

        System.out.print("Digite o ano de fabricação do carro: ");
        ano = in.nextInt();

        System.out.print("Digite o valor de tabela do carro: ");
        val = in.nextDouble();

        if (ano < 1990) {
            tx = 0.01;
        } else {
            tx = 0.015;
        }

        imp = val * tx;

        System.out.printf("O imposto a ser pago é: R$ %.2f", imp);

        in.close();
    }
}
