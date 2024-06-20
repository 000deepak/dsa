package latest.Collector.Done;

public class Employee {
    Boolean isActive ;
    String employmentType;
    Integer salary ;
    String name ;
    String Address;
    Integer age;
    Double rating;

    public Employee(Boolean isActive, String employmentType, Integer salary, String name, String address, Integer age, Double rating) {
        this.isActive = isActive;
        this.employmentType = employmentType;
        this.salary = salary;
        this.name = name;
        Address = address;
        this.age = age;
        this.rating = rating;
    }

    public Boolean getSIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Done.Employee{" +
                "isSalaried=" + isActive +
                ", employmentType='" + employmentType + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                '}';
    }
}
