package Test8_23;

public class Parrot extends Bird{
    @Override
    public void fly() {
        System.out.println(this.getName()+"在飞");
    }

    public Parrot(String name, String type) {
        super(name, type);
    }
}
