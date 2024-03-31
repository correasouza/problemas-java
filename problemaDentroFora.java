import java.util.Scanner;

public class problemaDentroFora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = input.nextInt();
        input.close();

        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um numero: ");
            int v = input.nextInt();
            if (v >= 10 && v <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.printf("%d DENTRO\n", dentro);
        System.out.printf("%d FORA", fora);



    }
}