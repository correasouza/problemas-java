import java.util.Scanner;
import java.util.Locale;

public class problemaValidacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double media = 0;

        System.out.print("Digite a primeira nota: ");
        double notaUm = input.nextDouble();

        while ((notaUm < 0.0) || (notaUm > 10.0)){
            System.out.print("Valor invalido! Tente novamente: ");
            notaUm = input.nextDouble();
        }

        System.out.print("Digite a segunda nota: ");
        double notaDois = input.nextDouble();

        while ((notaDois < 0.0) || (notaDois > 10.0)){
            System.out.print("Valor invalido! Tente novamente: ");
            notaDois = input.nextDouble();
        }

        media = (notaUm + notaDois) / 2;
        System.out.printf("MEDIA = %.2f", media);




    }
}