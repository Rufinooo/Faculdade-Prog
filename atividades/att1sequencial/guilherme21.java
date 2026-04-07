import java.util.*;

public class guilherme21{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double altura, angulo, escada;

        System.out.println("Digite a altura da parede (em metros): ");
        altura = in.nextDouble();

        System.out.println("Digite o ângulo formado pela escada e o chão (em graus): ");
        angulo = in.nextDouble();

        escada = altura / Math.sin(Math.toRadians(angulo));

        System.out.printf("A medida da escada necessária é: %.2f metros", escada);

    }
}
