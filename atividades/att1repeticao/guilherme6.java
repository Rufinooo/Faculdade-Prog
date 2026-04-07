public class guilherme6 {
    public static void main(String[] args) {
        double media, soma = 0;
        double N = Math.floor(Math.random() * 100);
        System.out.println(N);

        for (int i = 1; i <= N; i++){
            soma += i;
        }
        media = soma / N;
        System.out.println(N+" "+media);
    }
}
