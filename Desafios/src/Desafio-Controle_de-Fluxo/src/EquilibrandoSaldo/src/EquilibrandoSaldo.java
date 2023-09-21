import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        //Realizando o calculo d novo saldo
        double novoSaldo = saldoAtual + valorDeposito - valorRetirada;
        //Imprimindo o novo saldo com uma casa decimal("%.NÚMERO DE CASAS DECIMAIS", Variavel novosaldo)
        System.out.println("Saldo atualizado na conta: " + String.format("%.1f", novoSaldo));
       
}
}