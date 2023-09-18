package Functional_Interface.Exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploFunção {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> nummerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        numeros.forEach(n -> System.out.println(n));
    }
}
