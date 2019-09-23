package game;

public class Dao extends Wuqi {
    public Dao(String name){
        super(name);
    }

    @Override
    public void Xz() {
        System.out.println("用"+this.getName()+"杀了");
    }
}
