package Functional_Interface.Exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSupplier {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Ola, sejam bem-vindos(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        listaSaudacoes.forEach(s -> System.out.println(s));
    }
}
