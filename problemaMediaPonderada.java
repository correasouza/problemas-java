import java.util.Locale;
import java.util.Scanner;

public class problemaMediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite tres numeros: ");

        double contador = 2.0;
        double media = 0.0;

        for (int i = 0; i < 3; i++) {
            double v = input.nextDouble();
            contador += v;
        }

        media = contador / 3;

        System.out.printf("MEDIA = %.2f ", media);



    }
}