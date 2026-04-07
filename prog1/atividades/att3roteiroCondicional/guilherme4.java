import java.util.*;

public class guilherme4 {
    public static void main(String[] args) {

        double num1, num2, res;
        char op;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = in.nextDouble();
        System.out.println("Digite outro: ");
        num2 = in.nextDouble();

        System.out.println("MENU\n+ : soma\n- : subtrair\n* : multiplicação\n/ : divisão\nESCOLHA: ");

        op = in.next().charAt(0);
        switch (op) {
            case '+':
                res = num1 + num2;
                System.out.println("soma = " + res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println("subtração = " + res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println("multiplicação = " + res);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Divisão por zero");
                } else {
                    res = num1 / num2;
                    System.out.println("Divisão = " + res);
                }
                break;

            default:
                System.out.println("Operação Inválida!");
        }
        in.close();
    }
}
