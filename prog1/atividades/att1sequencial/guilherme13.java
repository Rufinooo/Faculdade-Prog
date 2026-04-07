import java.util.*;

public class guilherme13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int anoComec, inte, nTeve, anoHj, copas;

        anoComec = 1930;
        inte = 4;
        nTeve = 2;

        System.out.println("Escreve o ano de agora: ");
        anoHj = in.nextInt();

        copas = ((anoHj - anoComec) / inte) + 1 - nTeve;

        System.out.println("Quantidade de copas que tiveram: " + copas);

        in.close();
        
    }
}
