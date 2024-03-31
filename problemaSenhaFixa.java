import java.util.Locale;
import java.util.Scanner;

public class problemaSenhaFixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int senha = 0;

            while (senha != 2002) {
                System.out.print("Digite a senha: ");
                int senha1 = input.nextInt();
                senha = senha1;
                if (senha1 == 2002) {
                    System.out.print("Acesso permitido!");
                } else {
                    System.out.print("Senha Invalida! ");
                }
            }


    }
}
