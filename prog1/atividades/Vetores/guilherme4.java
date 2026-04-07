import java.util.*;

public class guilherme4 {
    static Scanner in = new Scanner(System.in);

    public static void vetorPreechido(int v[]){
        for (int i = 0; i < v.length; i++){
            System.out.print("Digite a posição "+(i + 1)+" do vetor: ");
            v[i] = in.nextInt();
        }
    }

    public static void vetorImpresso(int v[]){
        System.out.print("[");
        for (int i = 0; i < v.length; i++){
            System.out.print(v[i]+ ", ");
        }System.out.println("]");
    }

    public static void main(String[] args) {
        int v1[] = new int[10];
        int v2[] = new int[10];

        vetorPreechido(v1);

        for (int i = 0; i < v1.length; i++){
                v2[i] = v1[v1.length - 1 - i];
        }
        System.out.println("Vetor Original: ");
        vetorImpresso(v1);

        System.out.println("Vetor invertido: ");
        vetorImpresso(v2);
    }
}
