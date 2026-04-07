import java.util.Scanner;

public class guilherme12 {
    public static void main(String[] args) {
        String nomeCid, nmaior = "", nmenor =" ";
        double nacid, nveic, menor = 0, maior = 0, qtd200 = 0, razao;
        double somaacid=0, somaVeic = 0, mediaveic = 0, mediacid = 0, somaacid200 = 0, mediacid200;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            System.out.println("Nome da cidade: ");
            nomeCid = in.nextLine();

            System.out.println("quantidade de veiculos da cidade "+nomeCid+": ");
            nveic = in.nextDouble();

            System.out.println("quantidade de acidentes da cidade "+nomeCid+": ");
            nacid = in.nextDouble();
            in.nextLine();

            somaVeic += nveic;
            somaacid += nacid;
            if (nveic < 200){
                somaacid200 += nacid;
                qtd200 ++;
            }
            if (i == 1){
                maior = nacid;
                nmaior = nomeCid;
                menor = nacid;
                nmenor = nomeCid;
            } else {
                if (nacid > maior){
                    maior = nacid;
                    nmaior = nomeCid;
                } else if (nacid < menor) {
                    menor = nacid;
                    nmenor = nomeCid;
                } else {
                    System.out.println(".");
                }

            }
        }
        razao = somaacid / somaVeic;
        mediaveic = somaVeic / 5;
        if (qtd200 != 0) {
            mediacid200 = somaacid200 / qtd200;
            System.out.println("media de acidentes - de 200 veiculos: "+mediacid200);
        } else {
            System.out.println("nenhuma cidade com menos de 200 veiculos");
        }
        System.out.println("Maior indice de acidentes: "+nmaior+ ", "+maior);
        System.out.println("Menor indice de acidentes: "+nmenor+ ", "+menor);
        System.out.println("Razão: "+razao);
        System.out.println("Média de veiculos nas 5 cidades: "+mediacid);

    }
}