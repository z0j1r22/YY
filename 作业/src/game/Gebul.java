package game;

public class Gebul extends Guai {
    public Gebul(String name){
        super(name);
    }

    @Override
    public void guaiwu() {
        System.out.println(this.getName());
    }
}
