package DesafioIphone;

public class Album {
    private String nome;

    public Album(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Album = " + nome;
    }

}
