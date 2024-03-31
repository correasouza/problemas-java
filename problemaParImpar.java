import java.util.Scanner;

public class problemaParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = input.nextInt();

        for (int i = 0; i < numero; i++){
            System.out.print("Digite um numero: ");
            int v = input.nextInt();
            if ((v % 2) == 0 && v > 0){
                System.out.println("PAR POSITIVO");
            } else if ((v % 2) == 0 && v < 0) {
                System.out.println("PAR NEGATIVO ");
            } else if ((v % 2) != 0 && v > 0) {
                System.out.println("IMPAR POSITIVO");
            } else if ((v % 2) != 0 && v < 0) {
                System.out.println("IMPAR NEGATIVO");
            } else {
                System.out.println("NULO");
            }
        }




    }
}