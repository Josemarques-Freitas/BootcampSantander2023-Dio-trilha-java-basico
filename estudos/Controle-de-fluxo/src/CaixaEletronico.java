public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
    double saldo = 25.0;
    double deposito = 21.00;
    double valorSolicitado = 26.0;

    if(valorSolicitado > saldo)
    saldo = saldo + deposito - valorSolicitado;

    System.out.println(saldo);

    //Controle de fluxo simples 

}
    
}
