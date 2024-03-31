import java.util.Scanner;

public class problemaSequenciaImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = input.nextInt();
        input.close();

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println("" + i);
            }
        }


    }
}