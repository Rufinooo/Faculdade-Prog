import java.util.*;

public class guilherme16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String binario;
        int decimal, resto, potencia, i, tamanho, digito;
        int octal, auxDecimal, potenciaOctal, aux;
        String hexadecimal;
        char hexa;

        System.out.print("Digite um número binário: ");
        binario = in.nextLine();

        boolean valido;
        valido = true;
        tamanho = binario.length();
        i = 0;
        while (i < tamanho) {
            if (binario.charAt(i) != '0' && binario.charAt(i) != '1') {
                valido = false;
            }
            i = i + 1;
        }

        if (!valido) {
            System.out.println("Número inválido.");
        } else {
            decimal = 0;
            potencia = 1;
            i = tamanho - 1;
            while (i >= 0) {
                digito = binario.charAt(i) - '0';
                decimal = decimal + digito * potencia;
                potencia = potencia * 2;
                i = i - 1;
            }
            System.out.println("Decimal: " + decimal);

            auxDecimal = decimal;
            octal = 0;
            potenciaOctal = 1;
            while (auxDecimal > 0) {
                resto = auxDecimal % 8;
                octal = octal + resto * potenciaOctal;
                auxDecimal = auxDecimal / 8;
                potenciaOctal = potenciaOctal * 10;
            }
            System.out.println("Octal: " + octal);

            auxDecimal = decimal;
            hexadecimal = "";
            while (auxDecimal > 0) {
                resto = auxDecimal % 16;
                if (resto < 10) {
                    hexadecimal = resto + hexadecimal;
                } else {
                    hexa = (char) ('A' + resto - 10);
                    hexadecimal = hexa + hexadecimal;
                }
                auxDecimal = auxDecimal / 16;
            }
            System.out.println("Hexadecimal: " + hexadecimal);
        }
    }
}
