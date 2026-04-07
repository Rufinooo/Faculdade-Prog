import java.util.*;

public class atividade2 {
    public static void main(String[] args) {

        String usu;
        int senha;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu usuário: ");
        usu = in.next();

        System.out.println("Digite sua senha: ");
        if (! (in.hasNextInt()) ) {//o carácter "!" funciona como negação
            in.nextLine();
            System.out.println("A senha deve ser número inteiro: ");
        } else {
            senha = in.nextInt();
            if (usu.equals("admin"))
            {
                if (senha == 12345) {
                    System.out.println("Acesso concedido!");
                } else {
                    System.out.println("Senha incorreta!");
                }
            } else {
                System.out.println("Usuário inexistente.");
            }
        }
        in.close();
    }
}