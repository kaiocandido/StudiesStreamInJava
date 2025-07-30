package Supplier;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Supplier<String> saudacao = () -> "Ola tudo bem";

        List<String> listaDeSaudacao = Stream.generate(() -> "Olá tudo bem?").limit(5).toList();

        listaDeSaudacao.forEach(System.out::println);
    }
}
