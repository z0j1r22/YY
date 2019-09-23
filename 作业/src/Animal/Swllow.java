package Animal;

public class Swllow extends Animal implements Ifly {
    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"吃："+food.getName());

    }

    public Swllow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+"飞行");
    }
}
