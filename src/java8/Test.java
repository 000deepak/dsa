package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("rohani", 33, "RFP03", "Male", 20000));
        employees.add(new Employee("Chandan", 22, "RFP01", "Female", 30000));
        employees.add(new Employee("Chandan", 21, "RFP05", "Male", 40000));
        employees.add(new Employee("Mohan", 18, "RFP04", "Female", 50000));
        employees.add(new Employee("Rohan", 23, "RFP02", "Male", 10000));


        employees.stream().forEach(e -> System.out.println(e.getGender()));

        var emp = employees.stream()
                .distinct().sorted(Comparator.comparing(Employee::getName))
                .skip(1).findFirst();
//                .distinct()
//                .sorted(Comparator.comparingDouble(Employee::getSalary))
//                .skip(1)
//                .findFirst();

        System.out.println(emp.get());

        String str = "hello world hello";
        Integer i = 234;
        String s2 = String.valueOf(i);
        Stream.of(str).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(""));

         Stream.of(s2)
                .map(word -> new StringBuilder(word).reverse())
                 .forEach(System.out::println);
//                .collect(Collectors.joining(" "));
        System.out.println(s2);

//         str.chars()
//                 .mapToObj(c->(char)c)
//                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                 .entrySet()
//                 .stream().filter(f->f.getValue()>1)
//                 .forEach(s -> System.out.println(s.getKey()));


//         List<String> list = Arrays.asList(str.split(" "));
//        list.stream()
//                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
//                        .entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .forEach((entry) -> System.out.println(entry.getKey()));

//        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().filter(f->f.getValue()>1).forEach(s-> System.out.println(s.getKey()));
    }
}
