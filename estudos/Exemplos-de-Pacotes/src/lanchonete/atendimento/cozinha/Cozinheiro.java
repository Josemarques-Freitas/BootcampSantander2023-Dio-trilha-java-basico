package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	// pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}

	// pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}

	// pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */ private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}

	/* Retirado da area do atendente com o default */
	/*
	 * puclic void pedirParaTrocarGas(Atendente meuAmigo) {
	 * meuAmigo.trocarGas();
	 */
	// Pedido ao Almoxarife com Default
	void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}

	// Deixando Default para somente o Almoxarife ver
	void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
