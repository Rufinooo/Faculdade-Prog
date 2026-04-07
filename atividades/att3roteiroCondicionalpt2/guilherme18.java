import java.util.*;

public class guilherme18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int codigo, quantidade;
        double precoUnitario = 0, total = 0, desconto = 0, precoFinal = 0;

        System.out.print("Digite o código do produto (1 a 40): ");
        codigo = in.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        quantidade = in.nextInt();

        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.0;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 20.0;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 30.0;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 40.0;
        }

        if (precoUnitario > 0) {
            total = precoUnitario * quantidade;

            if (total <= 250) {
                desconto = total * 0.05;
            } else if (total <= 500) {
                desconto = total * 0.10;
            } else {
                desconto = total * 0.15;
            }

            precoFinal = total - desconto;

            System.out.println("Preço unitário: R$" + precoUnitario);
            System.out.println("Preço total: R$" + total);
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Preço final: R$" + precoFinal);
        } else {
            System.out.println("Código de produto inválido.");
        }
    }
}
