package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "carro", "kaios");

        //Predicate<String> maisDeCinco = palavra -> palavra.length() > 4;

        palavras.stream().filter((s) -> s.length() > 4).forEach(System.out::println);
    }
}
