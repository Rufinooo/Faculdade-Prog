import java.util.*;

public class guilherme16{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int  temp, hr, min;

        System.out.println("Digite uma quantidade qualquer (em minutos): ");
        temp = in.nextInt();

        hr = temp / 60;
        min = temp % 60;

        System.out.println("Seus minutos em horas são: " + hr +" horas e " + min +" minutos");

    }

}
