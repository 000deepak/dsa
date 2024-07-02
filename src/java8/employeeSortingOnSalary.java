package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class employeeSortingOnSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("rohani", 33, "RFP03", "Male", 20000));
        employees.add(new Employee("Chandan", 22, "RFP01", "Female", 30000));
        employees.add(new Employee("Chandan", 21, "RFP05", "Male", 40000));
        employees.add(new Employee("Mohan", 18, "RFP04", "Female", 50000));
        employees.add(new Employee("Rohan", 23, "RFP02", "Male", 10000));

        employees.stream().forEach(e -> System.out.println(e.getGender()));

        //sort employees by name
        var empName = employees.stream()
                .distinct()
                .sorted(Comparator.comparing(Employee::getName))
                .skip(1)
                .findFirst();

        //sort employees according to salaries
        var empSalary = employees.stream()
                .distinct()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .skip(1)
                //.map(Employee::getName) //will return the employee name with 2nd largets salary
                .findFirst();

        //group employees by age
        Map<Integer, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        // Using streams to find the maximum salary
        Employee maxSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employees found"));
    }
}
