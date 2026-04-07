import java.util.Scanner;

public class aula2{
   public static void main(String []args){
   
      String nome;
      double peso;
      int idade;
      boolean fumante;
      
      Scanner teclado = new Scanner(System.in);
      System.out.println("Digite sua idade: ");
      peso = teclado.nextDouble();
      System.out.println("Digite seu nome: ");
      teclado.nextLine(); //sem esse "teclado.nextLine();" o "nome = teclado.nextLine();" pega o enter como valor da variável
      nome = teclado.nextLine();
      System.out.println("Digite seu peso: ");
      idade = teclado.nextInt();
      System.out.println("É fumante (true) ou não (false): ");
      fumante = teclado.nextBoolean();
                     
      System.out.printf("Meu nome é %s e minha idade é %d anos e meu peso é %.2f. e eu sou um %b fumante", nome, idade, peso, fumante);  
   }
}