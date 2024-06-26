package java8;

public class Employee {
    private String name;
    private Integer age;
    private String code;
    private String gender;
    private Integer salary;

    public Employee(String name, Integer age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public Employee(String name, Integer age, String code, String gender, Integer salary) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", code='" + code + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
