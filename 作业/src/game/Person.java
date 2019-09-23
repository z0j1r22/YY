package game;

public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }
    public void start(Role role,Wuqi wuqi,Guai guai){
        System.out.println(this.name+"看到:");
        role.Juese();
        wuqi.Xz();
        guai.guaiwu();
    }
}
