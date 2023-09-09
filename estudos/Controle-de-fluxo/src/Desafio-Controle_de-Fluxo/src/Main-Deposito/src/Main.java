import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0; // Criando variavel saldo com o valor de 0.0

            double valor = scanner.nextDouble();
            
            if (valor > 0) {
                saldo += valor; // Calculando para imprimir
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
                 //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            } else if (valor == 0) {
                System.out.println("Encerrando o programa...");
                //TODO: Imprimir a mensagem de valor unválido.
            } else {
                System.out.println("Valor inválido! Digite um valor maior que zero.");
            } 
         
        }
        
}

