package Animal;

public class Dog extends Animal implements Perform,attack {
    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"吃："+food.getName());
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+"：攻击");
    }

    @Override
    public void perform() {
        System.out.println(this.getName()+"：表演");
    }

    public Dog(String name) {
        super(name);
    }
}
