package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		// ações que não precisam estarem disponíveis para toda a aplicação. RETIRADOS
		// COM O PRIVATE NO COZINHEIRO.
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

		// Como a aplicação do metodo Almoxarife não precisa ser vista aqui no
		// Estabelecimento, ele será dispensado do Metodo estabelecimento.
		// Almoxarife almoxarife = new Almoxarife();
		// ações que não precisam estarem disponíveis para toda a aplicação.
		// COM O PRIVATE EM ALMOXARIFE.
		// almoxarife.controlarEntrada();
		// almoxarife.controlarSaida();
		/*
		 * ação que somente o seu pacote cozinha precisa conhecer (default). Retimaos o
		 * public
		 * das opções abaixo no Arquivo Almoxarife e ela não esta mais disponivel para
		 * os demais
		 * packages.
		 * OBS: O modificador default so serve para mostrar arquivos no mesmo nivel.
		 */
		// almoxarife.entregarIngredientes();
		// almoxarife.trocarGas();

		Atendente atendente = new Atendente();
		// COM O PRIVATE EM ATENDENTE.
		// atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		/*
		 * ação que somente o seu pacote cozinha precisa conhecer (default). Retimaos o
		 * public
		 * da opções abaixo no Arquivo Atendente e ele não esta mais disponivel para os
		 * demais
		 * Arquivos Cozinheiro e Almoxarife..
		 * OBS: O modificador default so serve para mostrar arquivos no mesmo nivel.
		 */
		// atendente.trocarGas();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		// não deveria, mas o estabelecimento
		// ainda não definiu normas de atendimento
		// esta ação é muito sigilosa, qua tal ser privada ?
		// COM O PRIVATE EM CLIENTE.
		// cliente.consultarSaldoAplicativo();

		// já pensou os clientes ouvindo que o gás acabou ?
		// Retirado com o default em Atendente e Cozinheiro.
		// cozinheiro.pedirParaTrocarGas(atendente);
		// cozinheiro.pedirParaTrocarGas(almoxarife);

	}
}
