package Test8_23;

public class Sollow extends Bird {
    public Sollow(String name, String type) {
        super(name, type);
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+"在飞");
    }
}
