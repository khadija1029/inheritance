package Man;

public class PermanentE extends Employee {
    double pension;

    @Override
    public String toString() {
        return "PermanentE{" +
                "pension=" + pension +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public PermanentE(String name, int id, int salary, double pension) {
        super(name, id, salary);
        this.pension = pension;
    }
}
