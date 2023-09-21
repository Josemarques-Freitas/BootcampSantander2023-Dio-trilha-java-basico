package DesafioIphone;

public class Banda {
    private String nome;

    public Banda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Banda = " + nome;
    }

}
