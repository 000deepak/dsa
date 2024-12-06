```java
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList and add integers to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(12);
        list.add(2);
        list.add(24);
        list.add(4);

        // Create a stream from the list and print the count of elements
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());

        // Filter even numbers and print them
        list.stream().
                filter(a -> a % 2 == 0).
                forEach(a -> System.out.println(a));

        // Filter even numbers, remove duplicates, and print them
        list.stream().
                filter(a -> a % 2 == 0).
                distinct().
                forEach(a -> System.out.println(a));

        // Filter even numbers, remove duplicates, sort in descending order, and print them
        list.stream().
                filter(a -> a % 2 == 0).
                distinct().
                sorted((a, b) -> b - a).
                forEach(a -> System.out.println(a));

        // Filter even numbers, remove duplicates, sort in descending order, multiply by 2, and print
        list.stream().
                filter(a -> a % 2 == 0).
                distinct().
                sorted((a, b) -> b - a).
                map(a -> a * 2).
                forEach(a -> System.out.println(a));

        // Filter even numbers, remove duplicates, multiply by 2, and calculate the sum using reduce
        int sum = list.stream().
                filter(a -> a % 2 == 0).
                distinct().
                map(a -> a * 2).
                reduce(1, (a, b) -> a + b);

        System.out.println(sum);

        // Collect filtered even numbers (after removing duplicates and multiplying by 2) into a list
        List<Integer> resList = list.stream().
                filter(a -> a % 2 == 0).
                distinct().
                map(a -> a * 2).
                collect(Collectors.toList());

        System.out.println(resList);

        // Create an ArrayList of Employee objects
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "aman", 70000, "sde1", "aman1@gmail.com", "aman2@gmail.com"));
        empList.add(new Employee(2, "amit", 80000, "lead", "amit1@gmail.com", "amit2@gmail.com"));
        empList.add(new Employee(3, "varun", 90000, "sde1", "varun11@gmail.com", "varun91@gmail.com"));
        empList.add(new Employee(4, "rahul", 70000, "sde2", "rahul@gmail.com", "rahul12@gmail.com"));
        empList.add(new Employee(5, "aman", 70000, "sde1", "aman15@gmail.com", "aman25@gmail.com"));

        // Filter employees with designation "sde1" and print them
        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                forEach(a -> System.out.println(a));

        // Filter employees with designation "sde1", remove duplicates, and print them
        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                forEach(a -> System.out.println(a));

        // Filter employees with designation "sde1", remove duplicates, sort by salary in descending order, and print
        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                sorted((a, b) -> b.salary - a.salary).
                forEach(a -> System.out.println(a));

        // Filter employees with designation "sde1", remove duplicates, sort by salary in descending order, double salary, and print
        empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                sorted((a, b) -> b.salary - a.salary).
                map(a -> {
                    a.salary *= 2;
                    return a;
                }).
                forEach(a -> System.out.println(a));

        // Reduce the salary of employees with designation "sde1" (doubling the salary) and sum them
        Employee employee = empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                map(a -> {
                    a.salary *= 2;
                    return a;
                }).
                reduce(new Employee(0), (a, b) -> new Employee(a.salary + b.salary));

        System.out.println(employee.toString());

        // Collect the employees with designation "sde1", double their salary, and put them in a list
        List<Employee> employeeList = empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                map(a -> {
                    a.salary *= 2;
                    return a;
                }).
                collect(Collectors.toList());

        System.out.println(employeeList);

        // Collect the emails of employees with designation "sde1" in a list of ArrayLists
        List<ArrayList<String>> employeeList1 = empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                map(a -> a.emails).
                collect(Collectors.toList());
        System.out.println(employeeList1);

        // Flatten the emails of employees with designation "sde1" into a single list
        List<String> employeeList2 = empList.stream().
                filter(a -> a.designation.equals("sde1")).
                distinct().
                flatMap(a -> a.emails.stream()).
                collect(Collectors.toList());

        System.out.println(employeeList2);
    }
}
```
