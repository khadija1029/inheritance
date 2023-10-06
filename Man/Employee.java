package Man;

public class Employee extends Person{
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
    public Employee(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
