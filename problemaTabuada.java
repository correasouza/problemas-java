import java.util.Scanner;

public class problemaTabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int numero = input.nextInt();
        input.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d %n", numero, i, i * numero);
        }

    }
}