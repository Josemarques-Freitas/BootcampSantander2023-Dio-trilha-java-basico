import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Adicionando o df "#0.00"
        DecimalFormat df = new DecimalFormat("#0.00");
   
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        
        // Calcula os juros para o ano atual
        for (int ano = 1; ano <= periodo; ano++){
          double juros = valorFinal * taxaJuros;
          valorFinal += juros;
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}