import java.util.*;

public class guilherme4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=0;

        while (num != -999){
            num = in.nextInt();
            if (num != -999){
                System.out.println(num * 3);
            }
        }
    }
}
