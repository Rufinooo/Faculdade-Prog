import java.util.Scanner;

public class guilherme8{
    public static void main(String[] args) {
        double bMaior, bMenor, alt, vMetro, area, vVenda;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a base maior (m): ");
        bMaior = in.nextDouble();

        System.out.print("Digite a base menor (m): ");
        bMenor = in.nextDouble();

        System.out.print("Digite a altura (m): ");
        alt = in.nextDouble();

        System.out.print("Digite o valor por metro quadrado (R$): ");
        vMetro = in.nextDouble();

        area = (bMaior + bMenor) * alt / 2;
        vVenda = area * vMetro;

        System.out.printf("Área total do terreno: %.2f m²\n", area);
        System.out.printf("Valor médio de venda: R$ %.2f\n", vVenda);

        in.close();
    }
}
