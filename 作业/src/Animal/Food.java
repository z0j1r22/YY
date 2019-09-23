package Animal;

public abstract class Food {
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name) {
        this.name = name;
    }
}
class Dadou extends Food{
    public Dadou(String name) {
        super(name);
    }
}
class Gaoliang extends Food{
    public Gaoliang(String name) {
        super(name);
    }
}
class Gouliang extends Food{
    public Gouliang(String name) {
        super(name);
    }
}
