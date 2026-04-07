import java.util.*;

public class guilherme21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, tipo, consumo;
        double custo, totalRes, totalCom, totalInd, somaTipo1, somaTipo2;
        int qtdTipo1, qtdTipo2;

        numero = -1;
        totalRes = 0;
        totalCom = 0;
        totalInd = 0;
        somaTipo1 = 0;
        somaTipo2 = 0;
        qtdTipo1 = 0;
        qtdTipo2 = 0;

        while (numero != 0) {
            System.out.print("Digite o número do consumidor (0 para sair): ");
            numero = in.nextInt();

            if (numero != 0) {
                System.out.print("Digite a quantidade de kWh consumidos: ");
                consumo = in.nextInt();
                System.out.print("Digite o tipo (1-residencial, 2-comercial, 3-industrial): ");
                tipo = in.nextInt();

                if (tipo == 1) {
                    custo = consumo * 0.3;
                    totalRes = totalRes + consumo;
                    somaTipo1 = somaTipo1 + consumo;
                    qtdTipo1 = qtdTipo1 + 1;
                } else if (tipo == 2) {
                    custo = consumo * 0.5;
                    totalCom = totalCom + consumo;
                    somaTipo2 = somaTipo2 + consumo;
                    qtdTipo2 = qtdTipo2 + 1;
                } else if (tipo == 3) {
                    custo = consumo * 0.7;
                    totalInd = totalInd + consumo;
                } else {
                    custo = 0;
                }

                System.out.println("Custo total para o consumidor: R$" + custo);
            }
        }

        System.out.println("Total de consumo Residencial: " + totalRes + " kWh");
        System.out.println("Total de consumo Comercial: " + totalCom + " kWh");
        System.out.println("Total de consumo Industrial: " + totalInd + " kWh");

        if (qtdTipo1 > 0) {
            System.out.println("Média de consumo Residencial: " + (somaTipo1 / qtdTipo1));
        }
        if (qtdTipo2 > 0) {
            System.out.println("Média de consumo Comercial: " + (somaTipo2 / qtdTipo2));
        }
    }
}
