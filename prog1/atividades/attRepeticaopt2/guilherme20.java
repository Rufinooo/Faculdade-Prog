import java.util.*;

public class guilherme20 {
    public static void main(String[] args) {
        int paisA, paisB, ano;

        paisA = 500000;
        paisB = 700000;
        ano = 2015;

        while (paisA <= paisB) {
            paisA = paisA + (paisA * 3 / 100);
            paisB = paisB + (paisB * 2 / 100);
            ano = ano + 1;
        }

        System.out.println("O país A ultrapassará o país B no ano: " + ano);
    }
}
