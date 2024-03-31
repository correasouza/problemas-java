import java.util.Scanner;
import java.util.Locale;

public class problemaCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int combustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4){
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            combustivel = input.nextInt();
            if (combustivel == 1) {
                alcool++;
            } else if (combustivel == 2) {
                gasolina++;
            } else if (combustivel == 3) {
                diesel++;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}