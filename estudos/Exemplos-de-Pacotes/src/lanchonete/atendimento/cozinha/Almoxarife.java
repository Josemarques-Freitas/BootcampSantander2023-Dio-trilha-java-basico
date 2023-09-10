package lanchonete.atendimento.cozinha;

public class Almoxarife {
    // Modificado com o private para que só Almoxarife veja essa ação.
    /* public */private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    // Modificado com o private para que só Almoxarife veja essa ação.
    /* public */private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    // Modificado com o Default para que Cozinheiro e Almoxarife veja essa ação.
    /* public */ void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        // ...?
    }

    // Modificado com o Default para que Cozinheiro e Almoxarife veja essa ação.
    /* public */ void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}
