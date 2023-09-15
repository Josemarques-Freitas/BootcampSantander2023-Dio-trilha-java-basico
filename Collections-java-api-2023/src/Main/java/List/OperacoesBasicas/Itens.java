package Main.java.List.OperacoesBasicas;

public class Itens {
    private String Nome;
    private double Preco;
    private int Quantidade;

    public Itens(String nome, double preco, int quantidade) {
        this.Nome = nome;
        this.Preco = preco;
        this.Quantidade = quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    @Override
    public String toString() {
        return "Itens [Nome=" + Nome + ", Preco=" + Preco + ", Quantidade=" + Quantidade + "]";
    }

}
