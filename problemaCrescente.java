import java.util.Scanner;
import java.util.Locale;

public class problemaCrescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite dois numeros: ");
        int numeroUm = input.nextInt();
        int numeroDois = input.nextInt();
        input.close();

        while (numeroUm != numeroDois) {
            if (numeroUm > numeroDois) {
                System.out.print("DECRESCENTE!");
                break;
            } else {
                System.out.print("CRESCENTE!");
                break;
            }
        }


    }
}