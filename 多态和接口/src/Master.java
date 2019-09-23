public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }
    public void feed(Pet pet){
        System.out.println("主人："+name+"喂养：");
        pet.eat();
    }

}
