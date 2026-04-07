import java.util.*;

public class guilherme22{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double A, B, temp;

        System.out.println("Digite o valor de A: ");
        A = in.nextDouble();

        System.out.println("Digite o valor de B: ");
        B = in.nextDouble();

        temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A após a troca: " + A);
        System.out.println("Valor de B após a troca: " + B);
        
    }
}
