package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		// ...?
		System.out.println("SERVINDO A MESA");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}

	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}

	/*
	 * Se eu colocar a opção abaixo em default, o Atendente não vai mais "Trocar o
	 * gas para o
	 * Cozinheiro e nem para o Almoxarifado."
	 */
	/* public */ void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}

	/*
	 * Trocando o public para private vc determina q so esse arquivo pode visualizar
	 * essa ação.
	 */
	/* public */private void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
}
