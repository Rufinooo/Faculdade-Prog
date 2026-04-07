public class guilherme11 {
    public static void main(String[] args) {
        int[] primos = new int[10];
        int i, j, count;
        int limite = 200;
        boolean[] crivo = new boolean[limite + 1];

        for (i = 0; i <= limite; i++) {
            crivo[i] = true;
        }
        crivo[0] = false;
        crivo[1] = false;

        for (i = 2; i * i <= limite; i++) {
            if (crivo[i]) {
                for (j = i * i; j <= limite; j += i) {
                    crivo[j] = false;
                }
            }
        }

        count = 0;
        for (i = 100; i <= limite && count < 10; i++) {
            if (crivo[i]) {
                primos[count] = i;
                count++;
            }
        }

        System.out.print("10 primeiros primos a partir de 100 pelo crivo: [");
        for (i = 0; i < 10; i++) {
            System.out.print(primos[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
