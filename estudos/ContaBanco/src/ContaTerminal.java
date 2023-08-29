import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String agência = "067-8";
        int conta = 1021;
        double saldo = 237.48;


    System.out.println("Bem vindo ao nosso banco! Crie já sua conta.");

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Ola " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agência + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque." );
        
    }
}
