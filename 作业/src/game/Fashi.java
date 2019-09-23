package game;

public class Fashi extends Role{
    public Fashi(String name){
        super(name);
    }

    @Override
    public void Juese() {
        System.out.println(this.getName());
    }
}
