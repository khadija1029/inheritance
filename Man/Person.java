package Man;

public class Person {
    String name;
    int Id;

    public Person(String name, int id) {
        this.name = name;
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
}
