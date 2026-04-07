import java.util.*;

public class guilherme6 {
    public static void main(String[] args) {
       double sal, salnv;
       Scanner in = new Scanner(System.in);

        System.out.println("Salário  do funcionário: ");
        sal = in.nextDouble();

       if (sal < 700){
           salnv = (sal + (sal * 0.30));
           System.out.printf("Salário novo! %.2f", salnv);
       } else if (sal >= 700) {
           salnv = (sal + (sal * 0.10));
           System.out.printf("Salário novo! %.2f", salnv);
       } else {
           System.out.println("??");
       }
       in.close();
    }
}
