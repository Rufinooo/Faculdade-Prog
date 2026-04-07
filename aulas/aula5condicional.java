import java.util.Scanner;

public class aula5condicional {
    public static void main(String[] args) {

        int N;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade do atleta: ");
        N = in.nextInt();

        if (N < 0) {
            System.out.println("Idade inválida!");
        } else if (N >= 0 && N < 5) {
            System.out.println("Não participa!");
        } else if (N >= 5 && N <= 10) {
            System.out.println("Infantil!");
        } else if (N > 10 && N < 18) {
            System.out.println("Juvenil!");
        } else if (N >= 18 && N < 40) {
            System.out.println("Adulto!");
        } else {
            System.out.println("Sênior!");
        }

        in.close();
    }
}