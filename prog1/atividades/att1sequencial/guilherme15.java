import java.util.*;

public class guilherme15{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double area, r, pi;

        pi = 3.14;

        System.out.println("Raio da circuferência: ");
        r = in.nextDouble();

        area = (pi * Math.pow(r, 2));

        System.out.printf("Área da circuferência: %.2f", area);

    }
}
