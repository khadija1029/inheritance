package Man;

public class ComissionE extends Employee{
    double comission;

    @Override
    public String toString() {
        return "ComissionE{" +
                "comission=" + comission +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public ComissionE(String name, int id, int salary, double comission) {
        super(name, id, salary);
        this.comission = comission;
    }
}
