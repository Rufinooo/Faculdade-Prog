import java.util.*;

public class guilherme12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diaVotacao, mesVotacao, anoVotacao;
        int diaNasc, mesNasc, anoNasc;
        int idade;

        System.out.print("Digite o dia da votação: ");
        diaVotacao = in.nextInt();
        System.out.print("Digite o mês da votação: ");
        mesVotacao = in.nextInt();
        System.out.print("Digite o ano da votação: ");
        anoVotacao = in.nextInt();

        System.out.print("Digite o dia de nascimento: ");
        diaNasc = in.nextInt();
        System.out.print("Digite o mês de nascimento: ");
        mesNasc = in.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        anoNasc = in.nextInt();

        idade = anoVotacao - anoNasc;
        if (mesVotacao < mesNasc || (mesVotacao == mesNasc && diaVotacao < diaNasc)) {
            idade--;
        }

        if (idade < 16) {
            System.out.println("Não vota");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}
