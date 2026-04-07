/*
Entrada: peso, altura

Processamento: imc = peso/(altura²)
Saída: imc
Memoria: peso, altura, imc

 */

import java.util.Scanner;
public class aula3imc {
    public static void main(String[]args){
        double peso, altura, imc;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite sua altura em métros: ");
        altura = in.nextDouble();
        System.out.println("Digite seu peso em Kg: ");
        peso = in.nextDouble();

        imc = peso/(altura*2);
        System.out.printf("Seu IMC é: %.4f", imc);
        in.close();
    }
}
