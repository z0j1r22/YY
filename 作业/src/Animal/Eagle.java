package Animal;

public class Eagle extends Animal implements attack,Ifly {
    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"吃"+food.getName());
    }

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+"：攻击");
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+"飞翔");
    }
}
