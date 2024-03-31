import java.util.Scanner;

public class problemaFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int numero = input.nextInt();
        input.close();

        int contador = 1;

        for (int i = numero; i > 1; i--) {
            contador *= i;
        }

        System.out.println("FATORIAL = " + contador);



    }
}