package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dulicateCharactersAndWords {
    public static void main(String[] args) {
        String str = "hello world hello";

        //duplicate characters
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(f -> f.getValue() > 1)
                .forEach(s -> System.out.println(s.getKey()));


        //duplicate words
        List<String> list = Arrays.asList(str.split(" "));
        list.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach((entry) -> System.out.println(entry.getKey()));

        //duplicate words
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .forEach(s -> System.out.println(s.getKey()));
    }
}
