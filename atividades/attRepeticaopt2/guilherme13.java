import java.util.*;

public class guilherme13 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int num;

        System.out.print("Digite um número para saber se é primo ou não: ");
        num = in.nextInt();

        if (num <= 1){
            System.out.println("Não é primo");
        } else {
            for (int i = 2; i <= num/2; i++){
                if (num % i == 0){
                    System.out.println("Nao e primo");
                    return;
                }else {
                    System.out.println("Primo");
                    return;
                }
            }
        }
        in.close();
    }
}