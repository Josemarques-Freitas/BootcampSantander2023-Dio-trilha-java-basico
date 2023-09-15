package Main.java.Ordenação;

import java.util.Comparator;

//Adicionando a implementação Comparable com generico <TIPO DO GENERICO Q NO CASO É O NOME DA CLASSE> Obs: o compareblo é para comparar Int e String.
class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}

// Entroduzindo a classe comparator para comparar o double.
class comparatorPorAltura implements Comparator<Pessoa> {

    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());

    }

}
