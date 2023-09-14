package Main.java.Pesquisa;

public class Livro {

    private String Título;
    private String Autor;
    private int anoPublicacao;

    public Livro(String título, String autor, int anoPublicacao) {
        this.Título = título;
        this.Autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public int getanoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro [Título=" + Título + ", Autor=" + Autor + ", Ano=" + anoPublicacao + "]";
    }

}
