package lanchonete.atendimento.cozinha;

public class Almoxarife {
    /* Trocando o public por private para so o Almoxarife ver a ação. */
    /* public */ private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    /* Trocando o public por private para so o Almoxarife ver a ação. */
    /* public */private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    /*
     * Retirando o public, o metodo fica (Deault) com isso nem todos os packages
     * reconhece essa ação "Entregar
     * Ingredientes."
     */
    /* public */ void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        // ...?
    }

    /*
     * Retirando o public, o metodo fica (Deault) com isso nem todos os packages
     * reconhece essa ação "Trocar Gas."
     */
    /* public */ void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}
