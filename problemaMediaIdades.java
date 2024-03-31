import java.util.Locale;
import java.util.Scanner;

public class problemaMediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        boolean i = true;

        double total = 0;
        double c = 0;

        System.out.println("Digite as idades: ");

        while (i == true) {
            int idades = input.nextInt();
            if (idades >= 0) {
                total = total + idades;
                c++;
            } else {
                break;
            }
        }

        double media = total / c;

        if (media>= 0){
            System.out.printf("MEDIA = %.2f", media);
        } else{
            System.out.println("IMPOSSIVEL CALCULAR");
        }




        input.close();
    }
}