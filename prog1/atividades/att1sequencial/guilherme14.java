import java.util.*;

public class guilherme14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double larg, comp, area, poten;

        System.out.println("Escreve a largura do cômodo (em metros): ");
        larg = in.nextDouble();

        System.out.println("Escreve o comprimento do cômodo (em metros): ");
        comp = in.nextDouble();

        area = larg * comp;

        poten = area * 18;

        System.out.println("Área do cômodo: " + area + " m²");
        System.out.println("Potência necessária: " + poten + " W");

        in.close();
    }
}
