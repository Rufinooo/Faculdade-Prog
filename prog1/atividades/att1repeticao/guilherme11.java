import java.util.*;

public class guilherme11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota, N, maior = 0, menor = 0, soma = 0, media;
        String nome, notaMenor = "",notaMaior = "";

        System.out.println("Quantidade de alunos: ");
        N = in.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println("Digite o nome do "+ i +" aluno: ");
            nome = in.next();

            System.out.println("Digite a nota de "+ nome +":");
            nota = in.nextInt();

            soma += nota;
            maior = nota;
            menor = nota;
            notaMaior = nome;
            notaMenor = nome;

            if (i == 1) {
                maior = nota;
                menor = nota;
                notaMaior = nome;
                notaMenor = nome;
            } else {
                if (nota > maior){
                    maior = nota;
                    nome = notaMaior;
                }
                if (nota < menor){
                    menor = menor;
                    nome = notaMaior;
                }
            }
        }
        media = soma / N;

        System.out.println("Menor nota: "+ menor);
        System.out.println("Maior nota: "+ maior);
        System.out.printf("A soma das notas é: %.2f e a média das notas é: %.2f", soma, media);
    }
}
