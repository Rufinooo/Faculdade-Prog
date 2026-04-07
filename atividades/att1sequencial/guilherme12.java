import java.util.*;

public class guilherme12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double rA, rB, rC, peri, mKm, mMetros, voltas;

        System.out.println("Digite o comprimento da Rua A (em metros): ");
        rA = in.nextDouble();

        System.out.println("Digite o comprimento da Rua B (em metros): ");
        rB = in.nextDouble();

        System.out.println("Digite a meta de caminhada diária (em km): ");
        mKm = in.nextDouble();

        rC = Math.sqrt(Math.pow(rA, 2) + Math.pow(rB, 2));

        peri = rA + rB + rC;

        mMetros = mKm * 1000;

        voltas = Math.ceil(mMetros / peri);

        System.out.printf("Dona Maria precisa fazer %.0f voltas no quarteirão para atingir sua meta.\n", voltas);

        in.close();

    }
}
