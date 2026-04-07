import java.util.*;

public class guilherme9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] alturas = new double[50];
        int[] sexos = new int[50];
        double somaAlturas = 0, somaHomens = 0, somaMulheres = 0;
        int contHomens = 0, contMulheres = 0;

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = in.nextDouble();

            System.out.print("Digite o sexo (1 = masculino, 2 = feminino): ");
            sexos[i] = in.nextInt();

            somaAlturas += alturas[i];

            if (sexos[i] == 1) {
                somaHomens += alturas[i];
                contHomens++;
            } else if (sexos[i] == 2) {
                somaMulheres += alturas[i];
                contMulheres++;
            }
        }

        double mediaTurma = somaAlturas / 50;
        double mediaHomens = contHomens > 0 ? somaHomens / contHomens : 0;
        double mediaMulheres = contMulheres > 0 ? somaMulheres / contMulheres : 0;
        double maior = alturas[0];
        double menor = alturas[0];

        for (int i = 1; i < 50; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }

        int homensAbaixoMedia = 0, mulheresAcimaMediaHomens = 0, mulheresAbaixoMediaTurma = 0, pessoasAbaixoMediaTurma = 0;

        for (int i = 0; i < 50; i++) {
            if (sexos[i] == 1 && alturas[i] < mediaHomens) {
                homensAbaixoMedia++;
            } else if (sexos[i] == 2 && alturas[i] > mediaHomens) {
                mulheresAcimaMediaHomens++;
            }

            if (sexos[i] == 2 && alturas[i] < mediaTurma) {
                mulheresAbaixoMediaTurma++;
            }

            if (alturas[i] < mediaTurma) {
                pessoasAbaixoMediaTurma++;
            }
        }

        System.out.println("\nA maior altura da turma: " + maior);
        System.out.println("A menor altura da turma: " + menor);
        System.out.println("A média das alturas da turma: " + mediaTurma);
        System.out.println("A média das alturas dos homens: " + mediaHomens);
        System.out.println("A média das alturas das mulheres: " + mediaMulheres);
        System.out.println("Mulheres com altura acima da média dos homens: " + mulheresAcimaMediaHomens);
        System.out.println("Homens com altura abaixo da média dos homens: " + homensAbaixoMedia);
        System.out.println("Mulheres com altura abaixo da média da turma: " + mulheresAbaixoMediaTurma);
        System.out.println("Pessoas com altura abaixo da média da turma: " + pessoasAbaixoMediaTurma);

        in.close();
    }
}
