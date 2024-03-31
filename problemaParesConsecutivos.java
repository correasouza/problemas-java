import java.util.Scanner;

public class problemaParesConsecutivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int numero;
        boolean v = false;

        while (v != true) {
            System.out.print("Digite um numero inteiro: ");
            numero = input.nextInt();
            if (numero == 0) {
                v = true;
            } else if (numero % 2 == 0) {
                soma = numero + numero + 2 + numero + 4 + numero + 6 + numero + 8;
                v = true;
            } else if (numero % 2 != 0)  {
                soma = numero + 1 + numero + 3 + numero + 5 + numero + 7 + numero + 9;
                v = true;
            }
        }

        System.out.println("SOMA = " + soma);


        input.close();
    }
}