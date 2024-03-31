import java.util.Scanner;
import java.util.Locale;

public class problemaExperiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos casos de teste serao digitados? ");
        int casos = input.nextInt();

        double coelho = 0;
        double ratos = 0;
        double sapos = 0;

        for (int i = 0; i < casos; i++) {
            System.out.print("Quantidade de cobaias: ");
            int quantidadeCobaias = input.nextInt();
            System.out.print("Tipo de cobaia: ");
            char tipoCobaia = input.next().charAt(0);
            if (tipoCobaia == 'C'){
                coelho += quantidadeCobaias;
            } else if (tipoCobaia == 'R'){
                ratos += quantidadeCobaias;
            } else if (tipoCobaia == 'S'){
                sapos += quantidadeCobaias;
            }
        }


        double total = coelho + ratos + sapos;

        double percentualCoelhos = (coelho / total) * 100;
        double percentualRatos = (ratos / total) * 100;
        double percentualSapos = (sapos / total) * 100;

        System.out.println("RELATORIO FINAL:");
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %n", percentualSapos);



        input.close();
    }
}