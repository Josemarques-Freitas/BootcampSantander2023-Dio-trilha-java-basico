package lanchonete;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }

    public void fazerPedido() {
        System.out.println("FAZENDO O PEDIDO");
    }

    public void pagarConta() {
        System.out.println("PAGANDO A CONTA");
    }

    /*
     * Trocando o public para private vc determina q so esse arquivo pode visualizar
     * essa ação.
     */
    /* public */private void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
}
