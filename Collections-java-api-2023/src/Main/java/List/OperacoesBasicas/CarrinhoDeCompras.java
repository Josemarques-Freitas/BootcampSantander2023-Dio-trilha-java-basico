package Main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String Nome, double Preco, int quantidade) {
        Itens itens = new Itens(Nome, Preco, quantidade);
        this.itensList.add(itens);
    }

    public void removerItem(String nome) {
        List<Itens> itensParaRemover = new ArrayList<>();
        for (Itens i : itensList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }

        itensList.removeAll(itensParaRemover);

    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        for (Itens itens : itensList) {
            double valorItem = itens.getPreco() * itens.getQuantidade();
            valorTotal += valorItem;
        }

        return valorTotal;

    }

    public void exibirItens() {
        System.out.println(this.itensList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itensList=" + itensList + "]";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
