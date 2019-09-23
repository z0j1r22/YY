package game;

public class Cike extends Role {
    public Cike(String name){
        super(name);
    }

    @Override
    public void Juese() {
        System.out.println(this.getName());
    }
}
