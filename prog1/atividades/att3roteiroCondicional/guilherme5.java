import java.util.*;

public class guilherme5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma letra qualquer: ");
        char letra = in.next().charAt(0);

        if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U'){
            System.out.println("A letra digitada é uma vogal");
        } else {
            System.out.println("A letra digitada é uma consoante");
        }

    }
}
