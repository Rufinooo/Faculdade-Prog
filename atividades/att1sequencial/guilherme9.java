import java.util.*;

public class guilherme9{
    public static void main(String[] args){
        double n, diagonais;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de lados do polígono: ");
        n = in.nextInt();
        diagonais = n * (n - 3) / 2;
        System.out.printf("O número de diagonais desse polígono é: %.2f\n", diagonais);
        in.close();
    }
}
