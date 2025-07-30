package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);


        /*numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0 ){
                    System.out.println(integer);
                }
            }
        });*/
        numeros.stream().filter((n) -> n % 2 == 0 ).forEach(System.out::println);
    }
}