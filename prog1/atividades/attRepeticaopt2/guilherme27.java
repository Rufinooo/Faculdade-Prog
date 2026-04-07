import java.util.*;

public class guilherme27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int altura, i, j;

        System.out.print("Digite a altura do triângulo: ");
        altura = in.nextInt();

        i = 1;
        while (i <= altura) {
            j = 1;
            while (j <= i) {
                System.out.print("#");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
