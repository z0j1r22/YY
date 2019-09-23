package Animal;

public class Parrot extends Animal implements Ifly,Perform {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"吃："+food.getName());

    }

    @Override
    public void fly() {
        System.out.println(this.getName()+"飞翔");
    }

    @Override
    public void perform() {
        System.out.println(this.getName()+"表演");
    }
}
