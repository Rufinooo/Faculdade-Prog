import java.util.*;

public class guilherme10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double peso, altura, imc;
        String condicao;

        System.out.println("Digite seu peso: ");
        peso = in.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = in.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc < 25) {
            condicao = "Peso normal";
        } else if (imc < 30) {
            condicao = "Acima do peso";
        } else {
            condicao = "Obeso";
        }

        System.out.println(condicao);
    }
}
