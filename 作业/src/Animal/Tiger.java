package Animal;

public class Tiger extends Animal implements attack {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        System.out.println(this.getName()+"老虎吃："+food.getName());
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+"：攻击");
    }
}
