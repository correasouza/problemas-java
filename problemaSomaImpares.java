import java.util.Scanner;

public class problemaSomaImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int numeroUm = input.nextInt();
        int numeroDois = input.nextInt();
        input.close();

        int maior = 0;
        int menor = 0;
        int soma = 0;

        if (numeroUm > numeroDois) {
            maior = numeroUm;
            menor = numeroDois;
        } else {
            maior = numeroDois;
            menor = numeroUm;
        }
        if (menor % 2 == 0) {
            menor++;
        }

        for (int i = menor; i < maior; i += 2) {
            soma += i;
        }

        System.out.println("SOMA DOS IMPARES = " + soma);





    }
}