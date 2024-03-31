import java.util.Scanner;
import java.util.Locale;

public class problemaQuadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        boolean i = true;

        while (i) {
            System.out.println("Digite os valores das coordenadas X e Y: ");
            double x = input.nextDouble();
            double y = input.nextDouble();

            if (x >= 1 && y >= 1) {
                System.out.println("QUADRANTE Q1");
            } else if (x <= -0.1 && y >= 1) {
                System.out.println("QUADRANTE Q2");
            } else if (x <= -0.1 && y <= -0.1) {
                System.out.println("QUADRANTE Q3");
            } else if (x >= 1 && y <= -0.1) {
                System.out.println("QUADRANTE Q4");
            } else if (x == 0 || y == 0) {
                break;
            }
        }




        input.close();
    }
}
