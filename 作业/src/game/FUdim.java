package game;

public class FUdim extends  Guai {
    public FUdim(String name){
        super(name);
    }

    @Override
    public void guaiwu() {
        System.out.println(this.getName());
    }
}
