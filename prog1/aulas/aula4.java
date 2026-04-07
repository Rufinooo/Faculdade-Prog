import java.util.*;

public class aula4{
    public static void main(String []args){

        double cat1, cat2, hip;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro cateto: ");
        cat1 = in.nextDouble();
        System.out.println("digite o valor do segunto cateto: ");
        cat2 = in.nextDouble();
        hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.printf("Hipotenusa = %.2f",hip );
        in.close();
    }
}