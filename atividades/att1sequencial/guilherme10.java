import java.util.*;

public class guilherme10{
    public static void main(String[] args){

        double m, c, i, t, m2;
        Scanner in = new Scanner(System.in);

        c = 2000;
        i = (0.005);
        t = (24);
        m = ((c * i) * t);
        m2 = m + c;

        System.out.printf("Total acumulado em 2 anos: %.2f\n", m2);

    }
}