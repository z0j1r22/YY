package Animal;

public class Cat extends Animal implements Perform {
    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"猫吃："+food.getName());
    }


    public Cat(String name) {
        super(name);
    }

    @Override
    public void perform() {
        System.out.println(this.getName()+"猫：表演");
    }
}
