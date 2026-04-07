import java.util.*;

public class guilherme2 {
    public static void main(String[] args) {

        double num1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");

        if (in.hasNextDouble()){
            num1 = in.nextDouble();

            if ((num1 % 2) == 0){
                System.out.println("Seu número é par");
            } else if ((num1 % 2) != 0 ) {
                System.out.println("Seu número é impar");
            }

        } else {
            System.out.println("Apenas números!");
        }

    }
}
