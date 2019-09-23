package game;

public class Jian extends Wuqi {
    public Jian(String name){
        super(name);
    }

    @Override
    public void Xz() {
        System.out.println("用"+this.getName()+"杀了");
    }
}
