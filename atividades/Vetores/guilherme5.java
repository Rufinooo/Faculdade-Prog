import java.util.*;

public class guilherme5{

    static Scanner in = new Scanner(System.in);

    public static int pesquisaVetor(int v[],int num){
        for (int i = 0; i < v.length; i++){
            if (v[i] == num){
                return i;
            }
        }
        return 0;
    }

    public static void imprimeVetor(int v[]){
        System.out.print("[");
        for (int i = 0; i < v.length; i++){
            System.out.print(v[i]);
            if (i < v.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void preecheVetor(int v[]){
        for (int i = 0; i < v.length; i++){
            System.out.print("Digite a posição "+(i)+" do vetor: ");
            v[i] = in.nextInt();
        }
    }

    public static void main(String[] args){
        int v1[] = new int[10];
        int valor, pos;

        preecheVetor(v1);
        System.out.print("Digite um valor para ser pesquisado: ");
        valor = in.nextInt();
        pos = pesquisaVetor(v1, valor);

        if (pos == 0){
            System.out.println("O valor " + (valor) + " não está presente no vetor.");
        } else {
            System.out.println("O valor "+(valor)+ " está na " + (pos) + " posição do vetor.");
        }
        in.close();
    }
}