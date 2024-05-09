package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
                .distinct()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .skip(1)
                .findFirst();

        System.out.println(emp.get());

    }
}
