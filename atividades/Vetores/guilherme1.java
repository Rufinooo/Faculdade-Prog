import java.util.*;

public class guilherme1 {
    public static void main(String[] args) {
        int idade[] = new int[40];
        int idaMenor = 0, idaMaior = 0, media = 0, aluMNovo, aluMVelho, soma = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 40; i++){
            System.out.print("Digite a idade do aluno "+(i + 1)+" : ");
            idade[i] = in.nextInt();
        }

        aluMVelho = idade[0];
        aluMNovo = idade[0];

        for (int i = 0; i <= 39; i++){
            int idades = idade[i];
            soma += idades;

            if (idades <= 16) {
                idaMenor++;
            } else {
                idaMaior++;
            }

            if (idades > aluMVelho) {
                aluMVelho = idade[i];
            }
            if (idades < aluMNovo) {
                aluMNovo = idade[i];
            }

            media = soma / idade.length;
        }
        System.out.println("Alunos com a idade menor ou igual a 16 anos: "+ idaMenor);
        System.out.println("Alunos maiores que 16 anos: "+ idaMaior);
        System.out.println("Média das idades: "+ media);
        System.out.println("Aluno mais novo: "+ aluMNovo);
        System.out.println("Aluno mais velho: "+ aluMVelho);
    }
}
