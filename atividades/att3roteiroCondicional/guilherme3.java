import java.util.*;

public class guilherme3 {
    public static void main(String[] args) {
        double valcar, v1, v2, v3;
        Scanner in = new Scanner(System.in);

        System.out.println("Valor de fábica do carro: ");
        valcar = in.nextDouble();

        if (valcar <= 28000.00){
            v1 = (valcar + (valcar* 0.05));
            System.out.printf("Valor final do carro: "+ v1);
        } else if ((valcar > 28000.00) && (valcar <= 45000.00)){
            v2 = (valcar + (valcar * 0.10) + (valcar * 0.15));
            System.out.println("Valor final do carro: "+ v2);
        } else if (valcar > 45000.00){
            v3 = (valcar + (valcar * 0.15) + (valcar * 0.20));
            System.out.println("Valor final do carro: "+ v3);
        } else {
            System.out.println("-_-");
        }
        in.close();
    }
}
