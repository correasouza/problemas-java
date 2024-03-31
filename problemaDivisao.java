import java.util.Locale;
import java.util.Scanner;

public class problemaDivisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double divisao = 0.0;

        System.out.print("Quantos casos voce vai digitar? ");
        int casos = input.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.print("Entre com o numerador: ");
            double numerador = input.nextDouble();
            System.out.print("Entre com o denominador: ");
            double denominador = input.nextDouble();
            if (numerador < -1) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                divisao = numerador / denominador;
                System.out.printf("DIVISAO = %.2f %n", divisao);
            }
        }

        input.close();
    }
}