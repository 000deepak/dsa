package latest.Collector.Done;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/*emp type - full time / part time / contract
*  rating(5) - r>4.5->30% salary  4.5>r>4 = 25% 3<r<4 ->15%  r<3 ->10%
*
* */
public class YupTv {
    public static void main(String[] args) {

        Employee emp1 = new Employee(true, "fullTime", 10000,
                "emp1", "address1", 35, 4.5);
        Employee emp2 = new Employee(true, "partTime", 10000,
                "emp2", "address2", 35, 4.2);
        Employee emp3 = new Employee(true, "contract", 10000,
                "emp3", "address3", 35, 3.5);
        Employee emp4 = new Employee(true, "fullTime", 10000,
                "emp4", "address4", 35, 2.0);
        Employee emp5 = new Employee(true, "fullTime", 10000,
                "emp5", "address5", 35, 1.0);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        List<Employee> fitered = empList.stream().map(YupTv::check).collect(Collectors.toList());

        System.out.println(fitered);

    }
    static Employee check(Employee e){
        if (e.getRating() < 4.5) {
            e.setSalary(10);
        }
        return e;
    }
}

