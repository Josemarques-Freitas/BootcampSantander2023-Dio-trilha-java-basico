import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);

        // Adicionei o While para fazer um laço de repetição para obter as entradas.
        while (scanner.hasNext()) {
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
            String nomeTitular = scanner.nextLine();
            double saldo = scanner.nextDouble();

            // TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

            ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
            System.out.println("Informacoes:");

            // TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
            conta.exibirInformacoes();

            if (scanner.hasNext()) {
                scanner.nextLine();
            }
        }
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    // Corrigi o nome do metódo Bancaria para ContaBancaria.
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Adicionei o metódo exibirInformacoes para imprimir as infomaçoes no console.
    public void exibirInformacoes() {
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}
