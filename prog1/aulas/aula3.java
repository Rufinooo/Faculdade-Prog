/*

Entrada: num1, num2
Processamento: soma = num1 + num2
               sub = num1 - num2
               mult = num1 * num2
               div = num1 / num2
Saida: soma, sub, mult, div
memoria: num1, num2, soma, sub, mult, div

*/

import java.util.*;//entrada de dados
   public class aula3{
      public static void main(String []args){
      
      double num1, num2, soma, sub, mult, div;
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Digite um numero: ");
      num1 = in.nextDouble();
      System.out.println("Digite outro numero: ");
      num2 = in.nextDouble();
      
      soma = num1 + num2; 
      sub = num1 - num2;
      mult = num1 * num2; 
      div = num1 / num2;
      
      System.out.println("AS OPERAÇÕES BÁSICAS DESSES NÚMEROS SÃO: ");
      System.out.printf("Soma = %.2f\nSubtração = %.2f\nMultiplicação = %.2f\nDivisão = %.2f", soma, sub, mult, div);
      
   }
}