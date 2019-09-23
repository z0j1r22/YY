package game;

public class Zhanshi extends Role {
    public Zhanshi(String name){
        super(name);
    }

    @Override
    public void Juese() {
        System.out.println(this.getName());
    }
}
