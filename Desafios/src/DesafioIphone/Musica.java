package DesafioIphone;

public class Musica {
    private String nome;

    public Musica(String string) {
        this.nome = string;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Musica " + nome;
    }

}
