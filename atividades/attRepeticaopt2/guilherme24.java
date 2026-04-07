import java.util.*;

public class guilherme24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, quociente, resto;

        System.out.print("Digite o valor de A: ");
        a = in.nextInt();
        System.out.print("Digite o valor de B: ");
        b = in.nextInt();

        quociente = 0;
        resto = a;

        while (resto >= b) {
            resto = resto - b;
            quociente = quociente + 1;
        }

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
