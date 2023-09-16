package Main.java.List.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAcendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()) {
            Collections.sort(numerosAcendente);
            return numerosAcendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDecesdente() {
        List<Integer> numerosDecedente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()) {
            numerosDecedente.sort(Collections.reverseOrder());
            return numerosDecedente;
        } else {
            throw new RuntimeException(" A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDecesdente());

        numeros.exibirNumeros();
    }

}
