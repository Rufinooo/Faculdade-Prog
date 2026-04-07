import java.util.*;

public class guilherme7{
    public static void main(String[] args){
        double largura, altura, area, perimetro;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        largura = in.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        altura = in.nextDouble();

        area = largura * altura;
        perimetro = 2 * (largura + altura);

        System.out.printf("Área do retângulo: %.2f\n", area);
        System.out.printf("Perímetro do retângulo: %.2f\n", perimetro);

        in.close();
    }
}