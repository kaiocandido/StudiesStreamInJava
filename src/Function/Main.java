package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1,2,3,4,5);

        // Function<Integer, Integer> dobrar = n -> n * 2;

        List<Integer> numerosDobrados = numero.stream().map(n -> n * 2).toList();

        numerosDobrados.forEach(System.out::println);

    }
}
