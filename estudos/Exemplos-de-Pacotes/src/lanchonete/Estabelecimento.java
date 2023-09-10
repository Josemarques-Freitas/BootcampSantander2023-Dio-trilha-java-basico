package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
//import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponíveis para toda a aplicação
        // Modificado com o private no arquivo Cozinheiro.
        // cozinheiro.lavarIngredientes();
        // cozinheiro.baterVitaminaLiquidificador();
        // cozinheiro.selecionarIngredientesVitamina();
        // cozinheiro.prepararLanche();
        // cozinheiro.prepararVitamina();
        // cozinheiro.prepararVitamina();

        // ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        ;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        // Retirando o metodo e o import Almoxarife do arquivo Estabelecimento
        // Almoxarife almoxarife = new Almoxarife();
        // ações que não precisam estarem disponíveis para toda a aplicação
        // Removido no Almoxarife com private
        // almoxarife.controlarEntrada();
        // almoxarife.controlarSaida();
        // ação que somente o seu pacote cozinha precisa conhecer (default)
        // almoxarife.entregarIngredientes();
        // almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // ação que somente o seu pacote cozinha precisa conhecer (default)
        // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimento
        // ainda não definiu normas de atendimento

        // esta ação é muito sigilosa, qua tal ser privada ?
        // Removido no Cliente com private
        // cliente.consultarSaldoAplicativo();

        // já pensou os clientes ouvindo que o gás acabou ?
        // Removido no Atendente com Default
        // Removido no Cozinheiro com private
        // cozinheiro.pedirParaTrocarGas(atendente);
        // cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
